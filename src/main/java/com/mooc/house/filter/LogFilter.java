package com.mooc.house.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @auther BH
 * @Date 2019/3/4 15:21
 */
@WebFilter(filterName = "LogFilter")
public class LogFilter implements Filter {
    private Logger logger = LoggerFactory.getLogger(LogFilter.class);
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        logger.info("Request--coming");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
