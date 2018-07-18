<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: liJunhu
  Date: 2018/7/16
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Enumeration enema=application.getInitParameterNames();

    while (enema.hasMoreElements())
    {
        String name=(String)enema.nextElement();
        String value=application.getInitParameter(name);
        %>
    <h1>
        <%=name%>:<%=value%>
    </h1>
<%
    }

%>
</body>
</html>
