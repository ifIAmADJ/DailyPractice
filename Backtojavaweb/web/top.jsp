<%--
  Created by IntelliJ IDEA.
  User: liJunhu
  Date: 2018/7/14
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

        String getname=request.getParameter("name");

%>

<h1>欢迎回来哦，<%=getname%>。</h1>

</body>
</html>
