<%--
  Created by IntelliJ IDEA.
  User: liJunhu
  Date: 2018/7/16
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        @import "table.css";
    </style>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
<jsp:useBean id="person" class="myBean.Person">
    <jsp:setProperty name="person" property="*"/> <%--使用这此方法要求table表单名称和javaBean当中的成员变量一致。 相当于在Person类中实例化了一个对象person。--%>
</jsp:useBean>
<form action="reg.jsp">
    <table align="center" width="400" border="1">
        <tr>
            <td align="center" colspan="2">
                <span>显示用户信息</span>
            </td>
        </tr>

        <tr>
            <td align="right">姓名：</td>
            <td align="center"><jsp:getProperty property="name" name="person"/></td>
        </tr>

        <tr>
            <td align="right">年龄：</td>
            <td align="center"><jsp:getProperty property="age" name="person"/></td>
        </tr>

        <tr>
            <td align="right">性别：</td>
            <td align="center"><jsp:getProperty property="sex" name="person"/></td>
        </tr>

    </table>
</form>
</body>
</html>
