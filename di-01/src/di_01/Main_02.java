package di_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_02 {

	public static void main(String[] args) {
		// 생성자에는 객체 생성 시의 필수 사항들을 넣음
//		DBMSLog dbmsLog = new DBMSLog("127.0.0.1", "user1", "pass1");
		// DBMSLog dbmsLog = new DBMSLog();
//		// setter 사용은 선택사항이라는 뜻 (이거없이도 객체를 만들수 있음)
//		dbmsLog.setIp("127.0.0.1"); // 선택사항
//		dbmsLog.setUser("user1"); // 선택사항
//		dbmsLog.setPass("pass1"); // 선택사항

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml"); // 컨테이너를 또 만들 시, 메모리 영역에 새로운 컨테이너 할당. 따라서, 각 컨테이너가 따로 관리됨
		MyCalc mc = context.getBean(MyCalc.class);
		mc.plus(10);
		mc.plus(20);
		mc.minus(5);
		double r = mc.getResult();
		System.out.println(r);
		// 새로운 빈(bean) 추출 -> 기본적으로, 아까 mc를 재활용해서 넣어짐 (메모리 절약 등의 이유)
		MyCalc mc2 = context.getBean(MyCalc.class); // 허나, xml 파일에 scope를 프로토타입으로 지정하였으므로, 새 객체(일회용 객체) 생성
		double r2 = mc2.getResult();
		System.out.println(r2);
	
	}

}
