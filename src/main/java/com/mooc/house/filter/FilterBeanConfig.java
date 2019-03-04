package com.mooc.house.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther BH
 * @Date 2019/3/4 15:29
 */
@Configuration
public class FilterBeanConfig {
    @Bean
    public FilterRegistrationBean logFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LogFilter());
        List<String> urList = new ArrayList<String>();
        urList.add("*");
        return filterRegistrationBean;
    }
}
