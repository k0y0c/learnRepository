<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: k0y0c
  Date: 2021-10-12
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>k0y0c</title>
</head>
<body>
    <%
        //1.获取所有的cookie
        Cookie[] cookies = request.getCookies();
        boolean flag = false;
        //2.遍历cookies
        if (cookies !=null && cookies.length >0 ){
            for (Cookie cookie : cookies) {
                //3.获取cookies名称
                String name = cookie.getName();
                //4.判断名称是否是：lastTime
                if ("lastTime".equals(name)){
                    //有该cookie，不是第一次访问
                    flag = true;    //有lastTime的cookie
                    //重新设置Cookie的value
                    //获取当前时间的字符串，重新设置Cookie的值，重新发送cookie
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String str_date = sdf.format(date);
                    //URL编码
                    str_date = URLEncoder.encode(str_date, "utf-8");
                    cookie.setValue(str_date);
                    //设置cookie存活时间
                    cookie.setMaxAge(60 * 60 * 24 * 30);      //一个月
                    response.addCookie(cookie);

                    //响应数据
                    //获取Cookie的value，时间
                    String value = cookie.getValue();
                    //URL解码
                    value = URLDecoder.decode(value, "utf-8");
     %>

                    <h1>欢迎回来，你上次访问的时间为：<%= value %></h1>

    <%
                    break;
                }
            }
        }
        if (cookies == null || cookies.length == 0 || flag == false){
            //没有，第一次访问
            //重新设置Cookie的value
            //获取当前时间的字符串，重新设置Cookie的值，重新发送cookie
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String str_date = sdf.format(date);
            //URL编码
            str_date = URLEncoder.encode(str_date, "utf-8");
            Cookie cookie = new Cookie("lastTime",str_date);
            //设置cookie存活时间
            cookie.setMaxAge(60 * 60 * 24 * 30);      //一个月
            response.addCookie(cookie);
    %>

            <h1>你好，欢迎首次登录</h1>
    <%
        }
    %>
</body>
</html>
