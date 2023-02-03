package di_02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyCalcAspect {
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		Object ret = joinPoint.proceed(); // 본래 메서드의 결과값
		System.out.print(joinPoint.getSignature().getName() + " 수행");
		if ((double) ret > 50.0) { // 결과값이 50초과시
			System.out.print(" -> 현재 결과값 50초과");
		}
		System.out.println();
		return ret;
	}

	public void afterReturning(JoinPoint joinPoint, Object ret) {
		System.out.print(joinPoint.getSignature().getName() + " 수행");
		if ((double) ret > 50.0) { // 결과값이 50초과시
			System.out.print(" -> 현재 결과값 50초과");
		}
		System.out.println();
	}
}
