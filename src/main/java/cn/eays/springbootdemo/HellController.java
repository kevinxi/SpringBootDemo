package cn.eays.springbootdemo;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellController {
	
	@RequestMapping("/hello")
	public String hell() {
		return "Hello Spring Boot!";
	}
	
	@RequestMapping("/hello2")
	public String hello() throws Exception{
		throw new Exception();
	}
	
	@ExceptionHandler(value= Exception.class)
	public String testErrorHandler(Exception ex) {
		System.out.println("TestController testErrorHandler().....");
		return "服务器故障，请联系管理员";
	}
}
