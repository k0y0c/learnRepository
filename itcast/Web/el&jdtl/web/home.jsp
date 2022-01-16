<%--
  Created by IntelliJ IDEA.
  User: k0y0c
  Date: 2021-10-14
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="top.jsp"%>


<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>主体信息</h3>

    <%--
        <%
            System.out.println("hi~~~~~~");
        %>
    --%>
    <!--
        <h1>hello</h1>
     -->

    <%
        pageContext.setAttribute("msg","hello");
        pageContext.getRequest();
        pageContext.getException();
        pageContext.getResponse();
        
    %>

    <%
        pageContext.getAttribute("msg");
    %>

</body>
</html>
