package cn.itcast.web.request;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo08")
public class RequestDemo08 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo8888被访问了.....");

        //存储数据到request域中
        request.setAttribute("msg","Hello");

        //转发到demo9999资源
       /* RequestDispatcher requestDispatcher = request.getRequestDispatcher("/RequestDemo09");
        requestDispatcher.forward(request,response);*/
       request.getRequestDispatcher("/RequestDemo09").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
