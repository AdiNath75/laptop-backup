package com.nath.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
	
	@Before("com.nath.aopdemo.aspect.NathAopExpressions.forDaoPackageNoGetterSetter()")
	public void performApiAnalyst() {
		
		System.out.println("\n====>>> Performing API analytics");
	}

}
