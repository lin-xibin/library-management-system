<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head>
<title>Book Insert</title>
<link rel="stylesheet" type="text/css" href="login.css"/>
</head>
<body>
<% if(request.getAttribute("result")!=null){
%>
<h1><font color="red"><%=request.getAttribute("result") %></font></h1>
<%} %>
<div id="insert_frame">
	<p><h2 align="center">������ͼ����Ϣ��</h2></p>
	<form action = "bookinsert.do" method = "post">
	<table align="center">
   		<p><label class="label_input">���</label><input type="text" name="bookid" class="text_field"></p>
   		<p><label class="label_input">����</label><input type="text" name="title" class="text_field"></p>
		<p><label class="label_input">����</label><input type="text" name="author" class="text_field"></p>
		<p><label class="label_input">������</label><input type="text" name="publisher" class="text_field"></p>
 		<p><label class="label_input">����</label><input type="text" name="price" class="text_field"></p>
 		<input type="submit" id="btn_insert" value="ȷ��" ></td>
 		<td><input type="reset" id="btn_insert" value="����" ></td>
 </tr>
</table>
</form>
</div>
</body></html>