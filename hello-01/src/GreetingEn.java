/**
 * 영어 환영 메시지
 * 
 * @author qcl
 *
 */
public class GreetingEn extends Greeting { // 상속을 이용한 자식 클래스이므로 beans.xml에 등록
	// 서비스 클래스 (VO 클래스 아님
	// 비즈니스 메서드
	// 업무 코드(회원등록, 회원검색, 상품입고, ... )
	public String getMessage() {
		return "Hello!";
	}
}
