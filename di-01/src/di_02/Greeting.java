package di_02;

import org.springframework.stereotype.Component;
// Annotation으로 bean 등록
@Component // or @Service -> Service는 업무 코드(주로 CRUD의 기능을 수행하는 클래스)에 붙임
public class Greeting {

	public String getMessage() {
		return "Hello~!";
	}

}
