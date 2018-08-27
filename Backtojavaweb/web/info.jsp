<%@ page import="java.util.Locale" %><%--
  Created by IntelliJ IDEA.
  User: liJunhu
  Date: 2018/7/14
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<%
    java.util.Locale locate=request.getLocale();

    String banner="";

    if(locate.equals(Locale.ENGLISH))
    {
        banner="Welcome to my zone！";
    }else if(locate.equals(Locale.CHINA))
    {
        banner="欢迎光临，伙计!";
    }


%>
<body>
<%=banner%><br>
用户提交的方式:<%=request.getMethod()%><br>
用户使用的协议:<%=request.getProtocol()%><br>
获取发出请求字符串的客户端地址:<%=request.getRequestURL()%><br>
获取提交数据的客户端IP地址:<%=request.getRemoteAddr()%><br>
</body>
</html>
