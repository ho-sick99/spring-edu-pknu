
public class HelloMain {

	public static void main(String[] args) {
		// Greeting 클래스에 이름넘겨주고 환영메세지 수신
		Greeting gt = new Greeting();
		String msg = gt.getMessage();
		System.out.println(msg);
	}// end main

}
