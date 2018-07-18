import Functions.Plus;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "getNumber",urlPatterns = "/getNumber")
public class getNumber extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String a=request.getParameter("varA");//接收来自index.jsp页面当中的request请求的两个变量varA和varB
        String b=request.getParameter("varB");

        Plus p=new Plus();

        request.setAttribute("result",Integer.toString(p.result(a,b)));//设置一个变量a用于接收

        RequestDispatcher view=request.getRequestDispatcher("result.jsp"); //为jsp准备好一个请求分派器。

        view.forward(request,response);   //使用请求分排期要求容器准备好Jsp。

    }
}
