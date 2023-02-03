package aop_02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyCalcAspect {
	@Before("execution(* aop_02.service.MyCalc.*(double))")
	public void beforeAdvice(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		System.out.println("Before: " + name);
	}

	@Around("execution(* aop_02.service.MyCalc.*(double))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		Object ret = joinPoint.proceed(); // 본래 메서드의 결과값
		System.out.print(joinPoint.getSignature().getName() + " 수행");
		if ((double) ret > 50.0) { // 결과값이 50초과시
			System.out.print(" -> 현재 결과값 50초과");
		}
		System.out.println();
		return ret;
	}

	@AfterReturning(value = "execution(* aop_02.service.MyCalc.*(double))", returning = "ret")
	public void afterReturning(JoinPoint joinPoint, Object ret) {
		System.out.print(joinPoint.getSignature().getName() + " 수행");
		if ((double) ret > 50.0) { // 결과값이 50초과시
			System.out.print(" -> 현재 결과값 50초과");
		}
		System.out.println();
	}
}
