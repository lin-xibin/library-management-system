<%@ page contentType="text/html;charset=gb2312"%>
<%@ page import="com.beans.BookBean"%>
<%BookBean book=(BookBean)request.getSession().getAttribute("book"); %>
<html>
<head>
<link rel="stylesheet" type="text/css" href="login.css"/>
</head>
<body>
<div id="display_frame">
	<table border="1" width="200" align="center">
	    <div id="table">
		<tr><td>���</td><td><%=book.getBookid() %></td></tr>
		<tr><td>����</td><td><%=book.getTitle() %></td></tr>
		<tr><td>����</td><td><%=book.getAuthor() %></td></tr>
		<tr><td>������</td><td><%=book.getPublisher() %></td></tr>
		<tr><td>�۸�</td><td><%=book.getPrice() %></td></tr>
		</div>
	</table>
</div>
</body>
</html>
