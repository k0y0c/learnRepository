<%--
  Created by IntelliJ IDEA.
  User: k0y0c
  Date: 2021-10-15
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el4</title>
</head>
<body>
    ${pageContext.request}
    <h4>动态获取虚拟目录</h4>
    ${pageContext.request.contextPath}
</body>
</html>
