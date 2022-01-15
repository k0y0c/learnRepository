package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RequestDemo03")
public class RequestDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //演示获取请求头数据： user-agent

        String agent = request.getHeader("user-agent");
        System.out.println(agent);
        //判断agent的浏览器版本
        if (agent.contains("Chrome")){
            System.out.println("谷歌浏览器");
        }else if (agent.contains("Firefox")){
            System.out.println("火狐浏览器");
        }else{
            System.out.println("错误");
        }

    }
}
