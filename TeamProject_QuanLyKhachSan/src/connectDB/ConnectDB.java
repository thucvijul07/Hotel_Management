package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	//Connect Attributes
	private static ConnectDB instance = new ConnectDB();
	private static Connection connect = null;
	
	//Constructor
	public ConnectDB() {}
	
	//Get
	public static ConnectDB getInstance() {return instance;}
	public static Connection getConnection() {return connect;}
	
	//Methods
	public void connectDatabase() {
		try {
			String url = "jdbc:sqlserver://DESKTOP-6D1UCE2\\SQLEXPRESS:1433;databaseName=HotelManagement;integratedSecurity=true;";
			
			connect = DriverManager.getConnection(url);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void disconnectDatabase() {
		if(connect != null) {
			try {
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
