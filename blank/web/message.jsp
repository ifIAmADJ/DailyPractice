<%--
  Created by IntelliJ IDEA.
  User: i
  Date: 2018/6/30
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    String name="administrator"+"<br>";
    //这种注释在开发人员模式中可见。
    int number=0;
    /**
     * function:函数
     */
    private int count()
    {
           number++;

        return number;
    }


%>
<%=name%>
<%=count()%>

<%String url="auto.jpg";%>
<img src="picture/<%=url%>">

<%-- 这是隐藏注释。不会在开发人员模式中可见。--%>
<%@ include file="bannner.jsp"%>
<jsp:forward page="bannner.jsp">
    <jsp:param name="name" value="Lijunhu"/>
</jsp:forward>

</body>
</html>
