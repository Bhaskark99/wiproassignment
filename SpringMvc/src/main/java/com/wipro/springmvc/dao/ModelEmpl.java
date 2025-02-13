package com.wipro.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ModelEmpl {
	
	public Connection getcon() {
       Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro_db", "root", "root");
		return conn;
			
		}catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
	
}
