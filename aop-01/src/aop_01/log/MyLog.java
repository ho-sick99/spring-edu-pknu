package aop_01.log;

import org.springframework.stereotype.Component;

/**
 * 화면으로 메시지 출력
 * 
 * @author qcl
 *
 */
@Component 
public class MyLog {

	public void log(String msg) {
		System.out.println("화면 출력: " + msg);
	}

}
