<%--
  Created by IntelliJ IDEA.
  User: k0y0c
  Date: 2021-10-11
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


    <%
      System.out.println("Hello jsp");
      int i = 5;
      String contextPath = request.getContextPath();    //获取虚拟目录
      out.print(contextPath);             ///cookie_session
    %>

    <%!
      int i = 3;
    %>

    <%= i  %>
    <%= "Hello"  %>

    <% response.getWriter().write("response..."); %>

  </body>
</html>
