package di_02.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import di_02.log.MyLog;

@Component
@Scope("prototype")
public class Greeting {
	private String name;
	private String msg;
	
	// MyLog를 상속받은 객체도 MyLog 타입으로 인식됨 (객체 다형성)
	// 객체 다형성 첫번째 해결책 -> 해당 타입의 Component를 중복하지 않음. 허나 이는 확장성이 부족
	// 메시지를 출력(화면, 파일, DBMS, 네트워크)
//	@Autowired
//	@Qualifier("myLogFile") // 두번째 해결책 -> @Qualifier을 사용하여 객체 이름으로 주입
	@Resource(name = "myLogFile") // Resource로 한번에 지정가능
	private MyLog log; 
	
	
	public void setLog(MyLog log) {
		this.log = log;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		msg = name + "님, 안녕하세요!";
		log.log(msg);
		return msg;
	}

}
