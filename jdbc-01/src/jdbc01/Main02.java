package jdbc01;

import javax.sql.DataSource;
import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource ds = context.getBean(DataSource.class);
		Connection conn = ds.getConnection();
		System.out.println("DBMS 연결 성공");
	}

}
