package com.lightinit.economicinformation.config;

import com.lightinit.economicinformation.Interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/index").setViewName("login");
    }

    public void addInterceptors(InterceptorRegistry registry) {


          registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")//拦截所有的
                .excludePathPatterns("/login","/","/regist")//不拦截的
                .excludePathPatterns("/assets/**");

    }
}
