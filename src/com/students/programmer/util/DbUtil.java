package com.students.programmer.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	private String dbUrl = "jdbc:mysql://localhost:3306/db_student_manager_web?useUnicode=true&characterEncoding=utf8";
	private String dbUser = "root";
	private String dbPassword = "jiaozi1122";
	private String jdbcName = "com.mysql.jdbc.Driver";
	private Connection connection = null;
	public Connection getConnection(){
		try {
			Class.forName(jdbcName);
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			System.out.println("DB connection succesed");
		} catch (Exception e) {
			System.out.println("DB connection failed");
			e.printStackTrace();
		}
		return connection;
	}
	
	public void closeCon(){
		if(connection != null)
			try {
				connection.close();
				System.out.println("DB connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		dbUtil.getConnection();
	}

}
	