package com.booksworld.adminconsumer.cfgbeans;


import com.booksworld.adminconsumer.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
@Component
public class WebMvcCfg extends WebMvcConfigurerAdapter {
    @Autowired
    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        // 映射为 user 的控制器下的所有映射
        //registry.addInterceptor(loginInterceptor).addPathPatterns("/login/home").excludePathPatterns("/index", "/");
        registry.addInterceptor(loginInterceptor).excludePathPatterns("/index", "/").excludePathPatterns("/static","/").excludePathPatterns("/login","/");
        super.addInterceptors(registry);
    }
}
