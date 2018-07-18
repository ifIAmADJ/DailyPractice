<%--
  Created by IntelliJ IDEA.
  User: liJunhu
  Date: 2018/7/16
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
    <style>
        h1 span{
            font-family: "等线 Light";
            color:orangered;
        }
    </style>
</head>
<body>
<%
    String name=request.getParameter("administrator");

    session.setAttribute("savename",name);

%>
<h1>欢迎您的到来,<span><%=name%></span>~</h1>
<a href="Tip.jsp">点击我跳转到另一个页面</a>
</body>
</html>
