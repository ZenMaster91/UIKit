package DBKit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMySQL extends NSDatabase {

	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";

	public DBMySQL() {
		try {
			Class.forName(MYSQL_DRIVER);
		} catch (ClassNotFoundException e) {
			System.err.println("Error while registering MySQL Driver");
			e.printStackTrace();
		}
	}
	
	@Override
	public Connection connect(String protocol, String vendor, String driver, String server, String port,
			String databaseName, String user, String password) throws SQLException {
		String url = protocol + ":" + vendor + "://" + server + ":" + port + "/" + databaseName;
		this.conn = DriverManager.getConnection(url, user, password);
		System.out.println("--> Connection " + this.conn.toString() + " has been oppened succesfully.");
		return this.conn;
	}

}
