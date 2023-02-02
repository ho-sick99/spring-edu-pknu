package di_01;

public class MyLog implements ILog {

	public MyLog() {
		System.out.println("MyLog 생성");
	}

	public void log(String msg) {
		System.out.println("화면 출력: " + msg);
	}

}
