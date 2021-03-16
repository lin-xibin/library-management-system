package com.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
	public  Connection getConnection() {
		 String driver="com.mysql.cj.jdbc.Driver";
		 String url="jdbc:mysql://localhost:3306/library?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		 String userName="root";
		 String passWord="mysql159155";
	    Connection connecion = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        connecion = (Connection) DriverManager.getConnection(url, userName, passWord);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return connecion;
	}
}
