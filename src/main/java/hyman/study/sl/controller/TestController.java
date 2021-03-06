package hyman.study.sl.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hyman/sl")
public class TestController {
	private Logger logger = Logger.getLogger(TestController.class);
	
	@RequestMapping("/test")
	public String test(){
		logger.info("log:调用后台test方法，返回test.jsp");
		return "test";
	}

	@RequestMapping("/test-throw-exception")
	public String testThrowException(){
		logger.info("测试抛出异常，看是否可以被统一异常捕获");
		System.out.println(1/0);
		return "test";
	}
}
