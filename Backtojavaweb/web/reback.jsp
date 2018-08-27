<%--
  Created by IntelliJ IDEA.
  User: liJunhu
  Date: 2018/7/14
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page errorPage="errorPage.jsp" %>  <%--当此页面发生错误时，忽略xml文档默认的网页--%>
<html>
<head>
    <title>Title</title>
    <style>
        h1 {
            font-size: 58px;
            text-align: center;
        }

        h2{
            font-size: 42px;
            text-align: center;
        }
    </style>
</head>
<body>
<h1>Pasico</h1>
<h2>欢迎光临</h2>
<%

    Date date=new Date();

    SimpleDateFormat today=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String td=today.format(date);

%>
<%=td%>

    <form action="top.jsp">
        <input type="text" name="name">
        <input type="submit" value="好眠">
    </form>

<a href="top.jsp?name=陌生人">晚安，我是一个路过这里的过客。</a>
</body>
</html>
