<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: k0y0c
  Date: 2021-10-15
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取数据</title>
</head>
<body>
    <%
        User user = new User();
        user.setName("张三");
        user.setAge(23);
        user.setBirthday(new Date());

        request.setAttribute("u",user);

        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(user);
        request.setAttribute("list",list);

        Map map = new HashMap();
        map.put("sname","李四");
        map.put("gender","男");
        map.put("user",user);
        request.setAttribute("map",map);


    %>

    <h3>el获取对象中的值</h3>
    ${requestScope.u}
    <%--
        通过的是对象的属性来获取
            setter或getter方法，去掉set或get，在剩余部分，首字母变为小写
    --%>
    ${requestScope.u.name} <br>
    ${requestScope.u.age} <br>
    ${requestScope.u.birthday} <br>
    ${requestScope.u.birthday.month} <br>

    ${u.birStr} <br>


    <h3>el获取List中的值</h3>
    ${list} <br>
    ${list[0]} <br>
    ${list[1]} <br>
    ${list[10]} <br>    <%--不会报错 --%>
    ${list[2].name} <br>

    <h3>el获取List中的值</h3>
    ${map} <br>
    ${map.gender} <br>
    ${map["gender"]} <br>
    ${map.user.name  } <br>


</body>
</html>
