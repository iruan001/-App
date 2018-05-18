package com.ruide.aop;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ThrowLog {
	@AfterThrowing(pointcut="execution(* com.ruide.action.*.*(..))",throwing="throwable")
	public void afterThrowing(JoinPoint jp,Throwable throwable){
		Logger logger=Logger.getLogger(this.getClass());
		logger.debug("出现错误了");
		logger.error(jp.getTarget().getClass());
	} 
}
