package di_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 소스를 구할 수 있을 시, 어노테이션 사용 가능
// 허나, 남이 만든 클래스 같이, 소스 없이 클래스만 알 경우에는 bean 태그를 사용해야 함
// 어노테이션과 태그는 방식만 다르지, 기능은 완전히 동일함
@Component
public class MyCalc {
	private double result = 0.0;

	@Autowired // Dependency Injection -> MyLog 클래스가 반드시 @Component 등록되어 있어야 함
	private MyLog log;

	public void plus(double i) {
		result += i;
	}

	public void minus(double i) {
		result -= i;
	}

	public double getResult() {
		// 결과 출력
		log.log("result = " + result);
		return result;
	}

}
