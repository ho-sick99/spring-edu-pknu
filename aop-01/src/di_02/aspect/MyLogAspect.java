package di_02.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyLogAspect {

	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		Object ret = null;
		ret = joinPoint.proceed(); // 반드시 실행 -> 본래 메서드의 결과값 조작 가능
		return ret + "~~~~~~!";
	}

	public void afterReturning(JoinPoint joinPoint, Object o) { // xml 설정파일의 반환값과 일치시켜야함
		System.out.println("정상종료 후: 반환값 = " + o);
	}

	public void beforeAdvice(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		// 전달되는 값 알아보기
		Object[] args = joinPoint.getArgs();
		System.out.println("AOP: BeforeAdvice (메서드: " + name + "())");
		System.out.println("AOP: 전달되는 데이터 개수: " + args.length);
	}

}
