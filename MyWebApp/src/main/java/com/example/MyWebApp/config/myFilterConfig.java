package com.example.MyWebApp.config;

import com.example.MyWebApp.filter.newFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myFilterConfig {

    @Bean
    public FilterRegistrationBean<newFilter> registrationBean() {
     FilterRegistrationBean<newFilter> registrationBean = new FilterRegistrationBean<>();

     registrationBean.setFilter(new newFilter());
     registrationBean.addUrlPatterns("/customers/*");
return  registrationBean;
}
}
