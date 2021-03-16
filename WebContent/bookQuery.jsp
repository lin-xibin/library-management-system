<%@ page contentType="text/html; charset=gb2312" %>
<html>
<head> 
<title>Book Query</title>
<link rel="stylesheet" type="text/css" href="login.css"/>
</head>
<body>
<div id="login_frame">
     <p align="center"><h2>请输入一个书号:</h2></p>
	 <form method="post" action="bookquery.do">

        <div id="login_control">
            <p align="center"><input type="text" name="bookid" class="query_text_field"/></p>
            <p align="center"><input type="submit" id="btn_query" value="提交"></p>
        </div>
    </form>
</div>
</body>
</html>

