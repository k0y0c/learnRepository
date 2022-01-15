<%--
  Created by IntelliJ IDEA.
  User: yucha
  Date: 2022/1/2
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--常用的注解--%>
    <a href="anno/testRequestParam?name=哈哈">RequestParam</a>
    <br>

    <form action="anno/testRequestBody" method="post">
        用户姓名：<input type="text" name="uname"/><br>
        用户年龄：<input type="text" name="age"/><br>
        <input type="submit" value="提交"/>
    </form>
    <br>

    <a href="anno/testPathVariable/10">PathVariable注解</a>
    <br>

    <a href="anno/testRequestHeader">RequestHeader注解</a>
    <br>

    <a href="anno/testCookieValue">CookieValue注解</a>
    <br>


    <form action="anno/testModelAttribute" method="post">
        用户姓名：<input type="text" name="uname"/><br>
        用户年龄：<input type="text" name="age"/><br>
        <input type="submit" value="提交"/>
    </form>
    <br>


    <a href="anno/testSessionAttributes">SessionAttributes注解--向session域中存值</a> <br>
    <a href="anno/getSessionAttributes">SessionAttributes注解--向session域中取值</a> <br>
    <a href="anno/delSessionAttributes">SessionAttributes注解--删除session域中的值</a> <br>
</body>
</html>
