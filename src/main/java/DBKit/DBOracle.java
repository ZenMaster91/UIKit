package DBKit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBOracle extends NSDatabase {

	public static final String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";

	public DBOracle() {
		try {
			Class.forName(ORACLE_DRIVER);
		} catch (ClassNotFoundException e) {
			System.err.println("Error while registering the Oracle Driver");
			e.printStackTrace();
		}
	}

	@Override
	public Connection connect(String protocol, String vendor, String driver, String server, String port,
			String databaseName, String user, String password) throws SQLException {
		String url = protocol + ":" + vendor + ":" + driver + ":@" + server + ":" + port + ":" + databaseName;
		this.conn = DriverManager.getConnection(url, user, password);
		System.out.println("--> Connection " + this.conn.toString() + " has been oppened succesfully.");
		return this.conn;
	}

}
