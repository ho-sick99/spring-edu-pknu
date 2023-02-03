package aop_01;

import aop_01.log.MyLog;
import aop_01.log.MyLogFile;

public class Test {

	public static void main(String[] args) {
		// Polymorphism (객체의 다형성)
		MyLog ml = new MyLog();
		ml = new MyLogFile(); // 부모 타입 변수 = new 자식타입()

		A a1 = new A();
		System.out.println(a1.p());

		// Anonymous class -> 특정 클래스의 일부 부분을 바꿔서 내가 원하는 기능을 쓰고 싶을 때 새로운 클래스를 생성하지 않고 특정
		// 클래스의 일부 기능을 오버라이딩 하여 쓰기 위해 사용
		A a2 = new A() { // 선언부 정의 - A를 상속한 어떤 클래스 선언
			public String p() {
				return "AA";
			}
		};
		System.out.println(a2.p());

		System.out.println(a1.getClass().getName());
		System.out.println(a2.getClass().getName());

	}
}

class A {
	public String p() {
		return "A";
	}
}