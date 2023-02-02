package di_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotation_01 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans_annotation.xml");
//		Greeting gr = (Greeting) context.getBean("gr"); // 문자열로 검색시 원래타입으로 캐스팅 필요
//		Greeting gr = context.getBean(Greeting.class); // Greeting.class로 검색하면 자동캐스팅 
//		String msg = gr.getMessage();
//		System.out.println(msg);

//		MyCalc mc = context.getBean(MyCalc.class);
		MyCalc mc = (MyCalc) context.getBean("myCalc");
		mc.plus(10);
		mc.plus(20);
		mc.minus(5);
		System.out.println(mc.getResult());
	}

}
