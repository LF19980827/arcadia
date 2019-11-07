package com.aurora.arcadia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author LFuser
 * @create 2019-10-23-下午 6:39
 */
//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能
@Configuration
public class SpringMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // super.addViewControllers(registry);
        //浏览器发送 /hanhan 请求来到 login
        registry.addViewController("/hanhan").setViewName("login");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/arcadia/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/template/**").addResourceLocations("classpath:/static/");

    }

    //所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean //将组件注册在容器
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("accountManagement/login");
                registry.addViewController("/index.html").setViewName("accountManagement/login");
                registry.addViewController("/login.html").setViewName("accountManagement/login");
                registry.addViewController("/main.html").setViewName("index");

            }

//            //注册拦截器
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                        .excludePathPatterns("/index.html","/","/login");
//            }
        };

        return adapter;
    }


    @Bean  //国际化
    public LocaleResolver localeResolver(){
        return new LocaleResolver();
    }
}