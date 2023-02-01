import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloMainSpring {

	public static void main(String[] args) {
		// Greeting 클래스에 이름넘겨주고 환영메세지 수신
		// ClassPath상(src 폴더 상)의 (beans.)xml 파일의 정보를 객체에 저장 (beans.xml 파일이 classpath상에 있음)	
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml"); // FileSystem상의 xml파일
		// beans.xml에 저장된 클래스 사용법 (객체화)
//		Greeting gt = (Greeting)context.getBean("gr"); // 추출할 bean의 id값, object 타입으로 생성하므로 casting 해줘야 함
		// GreetingEn 타입을 반환하지만, Greeting 부모형태 및 부모의 메서드 사용 -> 이러면 오버라이딩된 자식의 메서드가 사용됨
		// 고로, 밖에서 보면 전부 부모의 형태로 사용함 -> 적절하게 자식 클래스에서 오버라이딩해서 사용함
		// 이렇게 사용하면, 해당 파일을 수정하지 않고, xml 파일만 수정하고도 사용가능 -> 확장성이 좋다
		Greeting gt = context.getBean(Greeting.class); // 추출할 bean의 id값, class 타입으로 생성하므로 casting 필요없음
		String msg = gt.getMessage();
		System.out.println(msg);
	}// end main
}
