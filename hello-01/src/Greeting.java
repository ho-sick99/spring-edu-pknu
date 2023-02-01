/**
 * 한글 환영 메시지
 * 
 * @author qcl
 *
 */
public class Greeting { // 비즈니스 객체 (부모 클래스이므로 beans.xml에 등록 X)
	// 서비스 클래스 (VO 클래스 아님
	// 비즈니스 메서드
	// 업무 코드(회원등록, 회원검색, 상품입고, ... )
	public String getMessage() {
		return "안녕하세요!";
	}
}
