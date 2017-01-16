package db.tool.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import db.tool.Interceptor.MyInterceptor;

/**
 * 静态页面配置
 * @author liugang
 *
 */
@Configuration
public class MvcConfigurer extends WebMvcConfigurerAdapter {  
  
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/html");
        super.addResourceHandlers(registry);
    }

	
    @Override  
    public void addViewControllers(ViewControllerRegistry registry) {  
        registry.addViewController("/error").setViewName("error.html"); 
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);  
    }
    
    @Override  
    public void configurePathMatch(PathMatchConfigurer configurer) {  
        super.configurePathMatch(configurer);  
        configurer.setUseSuffixPatternMatch(false);  
    }


	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
		super.addInterceptors(registry);
		
	}
}