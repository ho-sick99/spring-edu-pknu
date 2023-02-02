package di_02;

import di_02.log.MyLog;
import di_02.log.MyLogFile;

public class Test {

	public static void main(String[] args) {
		// Polymorphism (객체의 다형성)
		MyLog ml = new MyLog();
		ml = new MyLogFile(); // 부모 타입 변수 = new 자식타입()
		
	}

}
