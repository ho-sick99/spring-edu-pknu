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

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		msg = name + "님, 안녕하세요!";
		return msg;
	}

}
