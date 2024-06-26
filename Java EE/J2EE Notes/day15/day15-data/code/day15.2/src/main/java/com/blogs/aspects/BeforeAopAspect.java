package com.blogs.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect // to tell SC , class below contains cross cutting concerns(i.e repeatative
//task)
@Component // to tell SC : it's a spring bean (i.e manage it's life cycle)
//@Slf4j
public class BeforeAopAspect {

//	private Logger log = LoggerFactory.getLogger(BeforeAopAspect.class);

	// What kind of method calls It would intercept ? : Methods having ANY ret type
	// , from the pkg : com.blogs.service , any class having any args
	// execution(* PACKAGE.*.*(..))
	// Weaving & Weaver
	@Before("execution(* com.blogs.service.*.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		// Advice
		System.out.println(" Before Advice : Intercepting Service Layer ");
		System.out.println(" Executing  "+joinPoint);
	}
}