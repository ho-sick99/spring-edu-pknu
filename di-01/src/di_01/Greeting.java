package di_01;

public class Greeting { // 서비스 객체기 때문에 코드 변화를 최소한으로
	private String name;
//	private MyLog log = new MyLog();
//	private MyLog log = new MyLogFile();
	private ILog log;

	public Greeting() {
		System.out.println("Greeting 생성");
	}

	public void setLog(ILog log) {
		this.log = log;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		log.log("이름설정: " + name); // 파일 출력, DBMS에 저장, 네트워크서버 전송 -> 기능이 달라지면 다른 클래스를 만들어야
		this.name = name;
	}

	public String getMessage() {
		// 출력메시지를 따로 출력
		String msg = name + "님, 안녕하세요!";
		log.log(msg);
		return msg;
	}
}
