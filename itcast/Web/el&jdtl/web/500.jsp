<%--
  Created by IntelliJ IDEA.
  User: k0y0c
  Date: 2021-10-14
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>服务器正忙.....</h1>

    <%
        String message = exception.getMessage();
        out.print(message);
    %>
</body>
</html>
