package com.nath.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudAsyncAspect {
	
	@Before("com.nath.aopdemo.aspect.NathAopExpressions.forDaoPackageNoGetterSetter()")
	public void logInToCloudAsync() {
		
		System.out.println("\n====>>> Logging to cloud in async fashion");
	}


}
