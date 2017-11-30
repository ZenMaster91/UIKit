package DBKit;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Protocol for every Database.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public abstract class NSDatabase {

	public static final String PROTOCOL_JDBC = "jdbc";
	public static final String VENDOR_ORACLE = "oracle";
	public static final String DRIVER_THIN = "thin";
	public static final String DEFAULT_SERVER = "156.35.94.99";
	public static final String DEFAULT_PORT = "1521";
	public static final String DEFAULT_DATABASE = "DESA";

	public static final String DEFAULT_USER = ""; // Enter here the user
	public static final String DEFAULT_PASS = ""; // Enter here the password

	protected Connection conn = null;
	protected Statement stat = null;
	protected PreparedStatement psQuery = null;
	protected CallableStatement cs = null;
	protected NSResultSet rs = null;

	protected NSDatabase() { }

	/**
	 * First out parameters and then in parameters!!!
	 * 
	 * @param statement
	 *            to call the Store Procedure or parameter.
	 * @param types
	 *            of the in parameters.
	 * @param parameters
	 *            for the function/stored procedure.
	 * @return and Object array with all the solutions.
	 * @throws SQLException
	 */
	public Object[] callFunc(String statement, Integer[] types, Object[] parameters) throws SQLException {
		this.cs = this.conn.prepareCall(statement);
		int i = 1;
		for (Integer s : types) {
			this.cs.registerOutParameter(i, s);
			i++;
		}

		for (Object o : parameters) {
			this.cs.setObject(i, o);
			i++;
		}

		this.cs.execute();

		Object[] result = new Object[types.length];
		for (i = 1; i <= result.length; i++) {
			Object o = cs.getObject(i);
			result[i - 1] = o;
		}

		return result;
	}

	/**
	 * First out parameters and then in parameters!!!
	 * 
	 * @param statement
	 *            to call the Store Procedure or parameter.
	 * @param types
	 *            of the in parameters.
	 * @param parameters
	 *            for the function/stored procedure.
	 * @return and Object array with all the solutions.
	 * @throws SQLException
	 */
	public Object[] callProc(String statement, Integer[] types, Object[] parameters) throws SQLException {
		this.cs = this.conn.prepareCall(statement);
		int i = 1;
		for (Integer s : types) {
			this.cs.registerOutParameter(i, s);
			i++;
		}
		i = 1;
		for (Object o : parameters) {
			this.cs.setObject(i, o);
			i++;
		}
		this.cs.execute();
		Object[] result = new Object[types.length];
		for (i = 1; i <= result.length; i++) {
			Object o = this.cs.getObject(i);
			result[i - 1] = o;
		}

		return result;
	}

	/**
	 * Closes a given connection.
	 * 
	 * @param connection
	 *            to be closed.
	 */
	public void close() {
		try {
			this.conn.close();
			System.out.println("--> Connection " + this.conn.toString() + " has been closed succesfully.");
		} catch (SQLException e) {
			System.err.println("The connection couldn't be closed.");
			e.printStackTrace();
		}
	}

	/**
	 * Opens a database connection.
	 * 
	 * @param protocol
	 *            to use by the connection.
	 * @param vendor
	 *            of the database.
	 * @param driver
	 *            for the connection.
	 * @param server
	 *            address.
	 * @param port
	 *            where the connection must call.
	 * @param database
	 *            name.
	 * @param user
	 *            of the connection.
	 * @param password
	 *            of the connection.
	 * 
	 * @return the opened connection.
	 * @throws SQLException
	 *             if there is any error while opening the database.
	 */
	public abstract Connection connect(String protocol, String vendor, String driver, String server,
			String port, String databaseName, String user, String password) throws SQLException;

	/**
	 * Executes a sql in a given connection.
	 * 
	 * @param sql
	 *            sentence to execute.
	 * @param connection
	 *            where the sql will be executed.
	 * @return the result set.
	 * 
	 * @throws SQLException
	 */
	public ResultSet execute(String sql) throws SQLException {
		this.stat = this.conn.createStatement();
		this.rs = new NSResultSet(stat.executeQuery(sql));
		return result();
	}

	/**
	 * Executes a sql prepared sentence in a given connection.
	 * 
	 * @param sql
	 *            to be executed
	 * @param parameters
	 *            for the sentence.
	 * @return the result of the sentence execution.
	 * @throws SQLException
	 *             if any error.
	 */
	public ResultSet execute(String sql, Object[] parameters) throws SQLException {
		this.psQuery = this.conn.prepareStatement(sql);
		for (int i = 0; i < parameters.length; i++) {
			this.psQuery.setObject(i + 1, parameters[i]);
		}
		this.rs = new NSResultSet(this.psQuery.executeQuery());
		return result();
	}

	public void update(String sql) throws SQLException {
		this.conn.createStatement().executeUpdate(sql);
	}

	/**
	 * Executes an update in the database from a sql an a parameters array.
	 * 
	 * @param sql
	 * @param parameters
	 * @throws SQLException
	 */
	public void update(String sql, Object[] parameters) throws SQLException {
		this.psQuery = this.conn.prepareStatement(sql);
		for (int i = 0; i < parameters.length; i++) {
			this.psQuery.setObject(i + 1, parameters[i]);
		}
		this.psQuery.executeUpdate();
	}

	/**
	 * Returns the result set object.
	 * 
	 * @return the result set object.
	 */
	public ResultSet result() {
		return this.rs.self();
	}

	/**
	 * Returns the number of columns the ResultSet has.
	 * 
	 * @param rs
	 *            to compute.
	 * @return the number of rows that it contains.
	 * @throws SQLException
	 */
	public int resultSize() throws SQLException {
		return this.rs.size();
	}

	/**
	 * Converts the result set of the consult to a matrix of values.
	 * 
	 * @return the matrix with the values of the consult.
	 * @throws SQLException
	 */
	public Object[][] resultToArray() throws SQLException {
		return this.rs.asArray();
	}
}
