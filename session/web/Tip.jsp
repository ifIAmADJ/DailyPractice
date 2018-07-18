<%--
  Created by IntelliJ IDEA.
  User: liJunhu
  Date: 2018/7/16
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
    <style>
        h1 span{
            font-family: "等线 Light";
            color: orangered;
        }
    </style>
</head>
<body>
<%
  String thisname=(String)session.getAttribute("savename");
  String geturl=application.getInitParameter("URL");
  session.setMaxInactiveInterval(60*60);
  long count=session.getLastAccessedTime();
%>
<h1>我通过了session会话保存了您的状态,<span><%=thisname%></span>。</h1>

<h1>我在这里返回了xml文档当中的application对象。<%=geturl%></h1>
<h1>
      您上一次与会话相关联的会话时间。<%=count%>

      距上一次发出会话所使用的时间。
</h1>
<a href="app.jsp">点击我返回xml的全部信息</a>
</body>
</html>
