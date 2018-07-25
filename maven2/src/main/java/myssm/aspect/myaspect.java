package myssm.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class myaspect {
	@Pointcut("execution(* myssm.service.MyService.select(..))") //切点表达式
public void pointcut() {
	
}
	@Before("pointcut()")
	public void kaishi() {
		System.out.println("开始aop");
	}
	/*@Before  方法之前
	@After	方法之后
	@AfterReturning 方法正常返回后
	@AfterThrowing 	抛出异常后
	@Around	环绕
	*/
}
