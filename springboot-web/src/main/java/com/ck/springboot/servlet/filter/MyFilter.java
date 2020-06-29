package com.ck.springboot.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Myfilter process...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}