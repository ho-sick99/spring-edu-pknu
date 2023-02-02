package di_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_02.service.MyCalc;

public class AopWorkshop_01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		MyCalc mc = context.getBean(MyCalc.class);
		mc.plus(10); //더하기
		mc.multiple(10); //곱하기
		mc.minus(60); //빼기
		mc.plus(50);
		double result = mc.getResult();
		System.out.println("result="+result);
	}//end main
}