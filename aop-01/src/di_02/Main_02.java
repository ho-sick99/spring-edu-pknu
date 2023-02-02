package di_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_02.service.Greeting;

public class Main_02 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
		Greeting gr = context.getBean(Greeting.class);
		gr.setName("문준호");
		String msg = gr.getMessage();
		System.out.println(msg);

		gr = context.getBean(Greeting.class);
		System.out.println(gr.getMessage());
	}

}
