import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main01 {

	public static void main(String[] args) {
		// ClassPath -> src folder
		// ApplicationContext -> spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		HelloWorld obj = context.getBean(HelloWorld.class);
		System.out.println(obj.getMessage());
		
		
	}
}
