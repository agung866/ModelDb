package com.bioskop.main.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection con =null;
	private static String url = "jdbc:mysql://localhost:3306/booking_bioskop?useSSL=false";
	private static String user="root";
	private static String password="";
	public static Connection getConnection() {
		
		if(con==null){
			try {
				con= DriverManager.getConnection(url,user,password);
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return con;
		
	}
	
}
