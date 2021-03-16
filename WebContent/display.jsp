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
		<tr><td>书号</td><td><%=book.getBookid() %></td></tr>
		<tr><td>书名</td><td><%=book.getTitle() %></td></tr>
		<tr><td>作者</td><td><%=book.getAuthor() %></td></tr>
		<tr><td>出版社</td><td><%=book.getPublisher() %></td></tr>
		<tr><td>价格</td><td><%=book.getPrice() %></td></tr>
		</div>
	</table>
</div>
</body>
</html>
