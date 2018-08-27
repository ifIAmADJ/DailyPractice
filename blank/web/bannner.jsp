<%--
  Created by IntelliJ IDEA.
  User: i
  Date: 2018/6/30
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        h1{
            font-family: "等线 Light";
        }
    </style>
</head>
<body>

<%String str=request.getParameter("name");


%>

<h1>欢迎回家,<%=str%></h1>
</body>
</html>
