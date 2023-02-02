package di_02;

import org.springframework.stereotype.Component;

@Component
public class MyLog {

	public void log(String string) {
		System.out.println("화면 출력: " + string);
	}

}
