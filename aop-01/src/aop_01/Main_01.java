package aop_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_01.service.Greeting;

public class Main_01 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // ApplicationContext
																									// -> 스프링 컨테이너를 의미
		Greeting gr = context.getBean(Greeting.class); // AOP 구성 시 
//		System.out.println("클래스: " + gr.getClass().getName());
		gr.setName("문준호");
		String msg = gr.getMessage();
		System.out.println(msg);
	}

}
