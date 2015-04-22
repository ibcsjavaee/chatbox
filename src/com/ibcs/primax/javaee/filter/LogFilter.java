package com.ibcs.primax.javaee.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by instructor on 4/22/2015.
 */
public class LogFilter implements Filter {


    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        chain.doFilter(req, resp);

        System.out.println("After chain");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
