import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Queston 03
 * 
 * @author qcl
 *
 */
public class Workshop03 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("calc_beans.xml");
		MyLotto lotto = (MyLotto) context.getBean("mylotto");
		lotto.makeLotto(); // 내부적으로 1~45 중복되지 않는 6개번호생성,저장
		ArrayList<Integer> nums = lotto.getLotto();
		System.out.println("이번주 로또번호는 " + nums);
	}
}
