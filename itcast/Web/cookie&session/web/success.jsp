<%--
  Created by IntelliJ IDEA.
  User: k0y0c
  Date: 2021-10-13
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1> <%= request.getSession().getAttribute("user") %> ,欢迎你</h1>
</body>
</html>
