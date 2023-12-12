package com.mateuszwalczyk.gameshop.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
@Component
@Order(2)
public class HeaderFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse newResponse = (HttpServletResponse) servletResponse;
        newResponse.addHeader("String" ,"endpoint");
        System.out.println("HeaderFilter doFilter");
        filterChain.doFilter(servletRequest, newResponse);
    }
}
