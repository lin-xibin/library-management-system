package com.control;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.beans.BookBean;
import com.beans.BookDAO;

public class BookInsertServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			 throws ServletException,IOException{
		request.setCharacterEncoding("gb2312");
		String message = null;
	    BookBean book = new BookBean(
	    	request.getParameter("bookid"),request.getParameter("title"),
	    	request.getParameter("author"),request.getParameter("publisher"),
	    	Float.parseFloat(request.getParameter("price"))
		);
	    	    
		BookDAO bookdao = new BookDAO();
    	boolean success = bookdao.insertBook(book);
		if(success){
			 message = "�ɹ�����һ����¼��";
		}else{
			 message = "�����¼����";
		}
		request.setAttribute("result",message);
		RequestDispatcher view = request.getRequestDispatcher("/bookInsert.jsp");
		view.forward(request, response);
	}
}
