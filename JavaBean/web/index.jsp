<%--
  Created by IntelliJ IDEA.
  User: liJunhu
  Date: 2018/7/16
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      @import "table.css";
    </style>
  </head>
  <body>
  <form action="reg.jsp">
      <table align="center" width="400"  border="1">
        <tr>
          <td align="center" colspan="2">
            <span>添加用户信息</span>
          </td>
        </tr>

        <tr>
          <td align="right">姓名：</td>
          <td align="center"><input type="text" name="name"></td>
        </tr>

        <tr>
          <td align="right">年龄：</td>
          <td align="center"><input type="text" name="age"></td>
        </tr>

        <tr>
          <td align="right">性别：</td>
          <td align="center"><input type="text" name="sex"></td>
        </tr>

        <tr align="center" >
          <td align="center" colspan="2"><input type="submit" value="done."></td>
        </tr>

      </table>
  </form>
  </body>
</html>
