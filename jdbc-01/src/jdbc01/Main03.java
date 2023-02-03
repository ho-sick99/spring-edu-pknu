package jdbc01;

import javax.sql.DataSource;
import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate template = context.getBean(JdbcTemplate.class);
		String sql = "INSERT INTO MEMBER (mid, mname, mpwd, mintro)";
		sql += "VALUES(?, ?, ?, ?)";
		template.update(sql, "user5", "유저5", "p5", "다섯번째 유저");
		System.out.println("유저 등록 성공");
	}

}
