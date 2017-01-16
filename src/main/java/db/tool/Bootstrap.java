package db.tool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import db.tool.util.SpringContextUtil;

@Configuration
@EnableAutoConfiguration
@ServletComponentScan
@ComponentScan
@ImportResource(locations = "classpath*:META-INF/spring/applicationContext.xml")
public class Bootstrap implements EmbeddedServletContainerCustomizer{

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Bootstrap.class, args);
		SpringContextUtil.setApplicationContext(applicationContext);
	}
	
	/**
	 * 更改启动端口
	 */
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(8080);
	}
}
