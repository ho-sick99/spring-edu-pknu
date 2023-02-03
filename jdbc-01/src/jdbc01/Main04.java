package jdbc01;

import javax.sql.DataSource;
import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		String sql = "SELECT count(*) FROM MEMBER";
		int count = template.queryForObject(sql, Integer.class);
		System.out.println("저장된 개수: " + count);
	}

}
