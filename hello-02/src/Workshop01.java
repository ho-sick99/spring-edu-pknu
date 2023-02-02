import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Question 1
 * 
 * @author qcl
 *
 */
public class Workshop01 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("calc_beans.xml");
		SimpleCalc c = (SimpleCalc) context.getBean("calc");
		long ans = c.plus(20, 30);
		System.out.println("20+30=" + ans);
		ans = c.minus(20, 30);
		System.out.println("20-30=" + ans);
	}
}
