<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.net.URLDecoder" %>
<html>
<head>
    <title>通过获取的cookie保存用户的登陆信息。</title>
</head>
<body>
<%
    Cookie[] cookies=request.getCookies();
    String user="";
    String date="";

    request.setCharacterEncoding("UTF-8");

    if(cookies!=null)
    {
        for(int i=0;i<cookies.length;i++)
        {

            //login页面当中把用户名和注册时间录入到了一个字符串当中。需要以字符'#'作为节点分别获取user和date。

            if(cookies[i].getName().equals("mrCookie"))
            {
                String getmessage=URLDecoder.decode(cookies[i].getValue(),"utf-8");
                user=getmessage.split("#")[0];
               date=getmessage.split("#")[1];
            }
        }
    }
    //--设置一个获取cookie的数组，如果存在cookie就去遍历。如果找到期望的cookie，就获取用户名字和时间

    if("".equals(user) && "".equals(date))
    {
%>
<h1>游客您好，欢迎您初次光临。</h1>
    <form action="login.jsp" method="post">
            <p>请输入您的姓名</p>
        <input type="text" name="user">
        <input type="submit" value="确定">
    </form>
<%
    }else{
%>
    <h1>欢迎<%=user%>再次光临。</h1>

    您曾经登陆的时间是:<%=date%>

<h2>您的cookie信息将会保存<span><%=request.getParameter("saveTime")%></span>秒</h2>
<%
    }
%>

</body>
</html>
