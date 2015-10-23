package org.openhis.dao;


import java.sql.*;


public class DAO {
	private String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	private String DB_URL = "jdbc:mysql://localhost:3306/openhis";
	
	private String USER = "root";
	private String PASS = "";
	private Connection conn;
	private Statement st;
	public DAO(){
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				st=conn.createStatement();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
	public void close(){
		try {
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Statement GetSt(){
		return st;
	}
}
