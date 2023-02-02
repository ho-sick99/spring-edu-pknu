package di_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_02.service.Greeting;

public class Main_01 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); // ApplicationContext -> 스프링 컨테이너를 의미
		Greeting gr = context.getBean(Greeting.class);
		gr.setName("문준호");
		String msg = gr.getMessage();
		System.out.println(msg);
	}

}
