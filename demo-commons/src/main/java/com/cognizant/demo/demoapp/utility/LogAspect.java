package com.cognizant.demo.demoapp.utility;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Log method entry and exit points
 * 
 * @author sourav.dutta5@cognizant.com
 *
 */
@Component
@Aspect
public class LogAspect {

	@Around("execution(com.cognizant.demo.demoapp.utility.LogMethodPoint)")
	public Object proceed(ProceedingJoinPoint joinPoint) {
		Object joinPointProceed = null;
		try {
			System.out.println("Entering" + joinPoint.getSignature().getName());
			joinPointProceed = joinPoint.proceed();
			System.out.println("Exiting" + joinPoint.getSignature().getName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return joinPointProceed;
	}

}
