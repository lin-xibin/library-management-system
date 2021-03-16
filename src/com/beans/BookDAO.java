package com.beans;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import java.util.ArrayList;
import com.beans.BookBean;

public class BookDAO {
	 //private static InitialContext context= null;
	 //private DataSource dataSource = null;
	 JdbcConnection jdbcConnection =  new JdbcConnection();
	 
	 /**
	  * JNDI,直接在服务器上配置好数据源连接池
	  * 
	 public BookDAO(){
		 try{
			 if(context == null){
				 context = new InitialContext();
			 }
		 dataSource = (DataSource)context.lookup("java:comp/env/jdbc/bookDS");
		 }catch(NamingException e2){
		 }
	 }
	 **/
	 // 根据书号查询图书信息
	 public BookBean searchBook(String bookid){
		 Connection conn = null;
		 PreparedStatement pstmt = null;
		 ResultSet rst = null;
		 BookBean book = new BookBean();
		 try{
			 //conn = dataSource.getConnection();
			 conn=jdbcConnection.getConnection();
			 pstmt = conn.prepareStatement("SELECT * FROM books WHERE bookid=?");
			 pstmt.setString(1,bookid);
			 rst = pstmt.executeQuery();
			 if(rst.next()){
				 book.setBookid(rst.getString("bookid"));
				 book.setTitle(rst.getString("title"));
				 book.setAuthor(rst.getString("author"));
				 book.setPublisher(rst.getString("publisher"));
				 book.setPrice(rst.getFloat("price"));
				 System.out.println(book.getPrice());
				 return book;
			 }else{
				 return null;
			 }
		 }catch(SQLException se){
			 return null;
		 }finally{
			 try{
				 conn.close();
			 }catch(SQLException se){
			 }
		 }
	 }
	 // 插入一本图书记录
	 public boolean insertBook(BookBean book){
		 Connection conn = null;
		 PreparedStatement pstmt = null;
		 try{
			 //conn = dataSource.getConnection();
			 conn=jdbcConnection.getConnection();
			 pstmt = conn.prepareStatement(
					 "INSERT INTO books VALUES(?,?,?,?,?)");
			 pstmt.setString(1,book.getBookid());
			 pstmt.setString(2,book.getAuthor());
			 pstmt.setString(3,book.getTitle());
			 pstmt.setString(4,book.getPublisher());
			 pstmt.setFloat(5,book.getPrice());
			 pstmt.executeUpdate();
			 pstmt.close();
			 return true;
		 }catch(SQLException se){
			 System.out.println("连接数据库失败...");
			 return false;
		 }finally{
			 try{
				 conn.close();
			 }catch(SQLException se){ }
		 }
	  }
}
