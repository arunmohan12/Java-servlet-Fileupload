package org.pack.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public  class Connector implements Provider {
	 static Connection connect=null;
	public static Connection getConnection() throws ClassNotFoundException {
		try {
			Class.forName("org.postgresql.Driver");
			connect=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connect;
	}
	

}