package com.wipro.jdbc;

import java.sql.DriverManager;

public class Jdbcdemo {

	public static void main(String[] args) {
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver() );
	}

}
