package di_02.log;

import org.springframework.stereotype.Component;

/**
 * 파일로 메시지 출력
 * 
 * @author qcl
 *
 */
@Component
public class MyLogFile extends MyLog {

	public void log(String msg) {
		System.out.println("파일 출력: " + msg);
	}

}
