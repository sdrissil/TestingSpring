package com.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Trace {

	@Around("tracePointcut()")
	public void logAround(ProceedingJoinPoint joinpoint) throws Throwable {
		String nomMethode = joinpoint.getTarget().getClass().getSimpleName()
				+ "." + joinpoint.getSignature().getName();

		final Object[] args = joinpoint.getArgs();
		final StringBuffer sb = new StringBuffer();
		sb.append(joinpoint.getSignature().toString());
		sb.append(" avec les parametres : (");

		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
			if (i < args.length - 1) {
				sb.append(", ");
			}
		}
		sb.append(")");
		System.out.println("Debut methode : " + sb);
		try {
			// MUST BE USED
			joinpoint.proceed();
		} finally {
			System.out.println("Fin methode : " + nomMethode);
		}
	}

	@Before("tracePointcut()")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Before method");
	}

	@Pointcut("execution(* com.spring.*Student.*(..))")
	public void tracePointcut() {

	}

}
