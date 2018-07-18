<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>中转站</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");

    String user=request.getParameter("user");

    String message=URLEncoder.encode(user+'#'+new SimpleDateFormat("h:m:s").format(new Date()),"utf-8"); //为了解决中文乱码问题。先将要写入的信息按照GBK进行编码.
    //不同的信息用‘#’进行分割。
    Cookie cookie=new Cookie("mrCookie",message);

    int saveTime=1000;

    cookie.setMaxAge(saveTime);

     response.addCookie(cookie);  //把本次的cookie保存到Cookie组中等待home页面去遍历。
%>

<script>
    window.location.href="home.jsp?saveTime=1000"
</script>
</body>
</html>
