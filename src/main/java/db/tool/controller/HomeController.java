package db.tool.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 主页
 * @author liugang
 *
 */
@Controller
public class HomeController {

	private static int count = 0;
	private int index = 0;
	
	@Value("${application.message:Hello World}")
	private String message = "Hello World";
	
	@GetMapping("/home")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	/**
	 * Spring Boot Controller 默认单例 
	 * 非单列 控制器添加注解 @Scope("prototype")
	 * @return
	 */
	@GetMapping("/test")
	@ResponseBody
	public String single(){
		String s = count++ +" | " + index++;
		System.out.println(s);
		return s;
	}
}