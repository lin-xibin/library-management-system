## 项目名称
基于MVC架构和HTML+JSP+Servlst+JDBC等技术的简单图书管理系统

## 设计思路
通过数据源和DAO对象访问数据库。其中JavaBeans实现模型，访问数据库，Servlet实现控制器，JSP页面实现视图。
- 模型包括2个JavaBean：BookBean用于存放图书信息，BookDAO用于访问数据库。
- 控制器包括2个Servlet：BookQueryServlet根据请求参数查询图书信息、BookInsertServlet用来向数据库中插入数据。
- 视图包括4个JSP页面：bookQuery.jsp显示查询页面、bookInsert.jsp显示插入页面、display.jsp显示查询结果页面和errorPage.jsp显示错误页面。

![设计图]（https://github.com/lin-xibin/The-World-of-Worms/blob/dab46b6546299969f098efc7d933059216e145cb/readme_image/1.jpg）

## 实现效果

![登录界面]（https://github.com/lin-xibin/The-World-of-Worms/blob/dab46b6546299969f098efc7d933059216e145cb/readme_image/2.jpg）
