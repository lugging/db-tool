package db.tool.util;

import org.springframework.context.ApplicationContext;

public class SpringContextUtil {
	
	private static ApplicationContext applicationContext;

	public static void setApplicationContext(ApplicationContext context) {
		applicationContext = context;
	}

	public static Object getBean(String beanId) {
		return applicationContext.getBean(beanId);
	}
	
	public static Object getBean(String beanId, Class<?> clazz) {
		return applicationContext.getBean(beanId, clazz);
	}
}