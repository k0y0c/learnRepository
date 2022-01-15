<%--
  Created by IntelliJ IDEA.
  User: k0y0c
  Date: 2021-10-15
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获域中的数据</title>
</head>
<body>
    <%
        //在域中存储数据
        session.setAttribute("name","李四");

        request.setAttribute("name","张三");
        session.setAttribute("age","23");

    %>

    <h3>获取值</h3>
    ${requestScope.name}
    ${sessionScope.age}
    ${sessionScope.haha}

    ${name}


</body>
</html>
