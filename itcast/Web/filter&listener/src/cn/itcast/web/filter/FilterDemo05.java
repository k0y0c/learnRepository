package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
//浏览器直接请求index.jsp资源时，该过滤器会被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.REQUEST)
//只有转发访问index.jsp时，该过滤器才会被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)
//浏览器直接请求index.jsp或者转发访问index.jsp时，过滤器会被执行
//@WebFilter(value = "/index.jsp",dispatcherTypes = { DispatcherType.REQUEST , DispatcherType.FORWARD})
public class FilterDemo05 implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo05....");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

}
