package hyman.study.sl.interceptor;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	private Logger logger = Logger.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e){
		logger.info("进入统一异常管理");
		e.printStackTrace();
		logger.error(e.getMessage(),e);
		
		return "error";
	}
}
