package com.xiaowei.bpmn.bpm.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author a
 */
//@Configuration
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    public WebConfig(){
        System.out.println("dd");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                //是否发送Cookie
                .allowCredentials(true)
                //放行哪些原始域
                .allowedOrigins("*")
                .allowedMethods(new String[]{"GET", "POST", "PUT", "DELETE","OPTIONS"})
                .allowedHeaders("*");
    }
}