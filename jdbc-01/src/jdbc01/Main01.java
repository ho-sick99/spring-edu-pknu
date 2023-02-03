package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main01 {

	public static void main(String[] args) throws Exception {
		//// 공통부분 ////
		// DB 연결 테스트
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("로딩 성공");

		// DBMS 연결
		// 사용하는 데이터베이스 제품마다 접근법(url)이 다름
		String url = "jdbc:oracle:thin:@127.0.0.1/XE"; // 오라클의 경우
		String user = "spring";
		String password = "spring";
		Connection conn = DriverManager.getConnection(url, user, password); // 실제 통신
		System.out.println("오라클 연결 성공");
		////////
		
		// SQL 통신 객체 생성 (statement)
		String sql = "INSERT INTO MEMBER(mid, mname, mpwd, mintro)";
		sql += "VALUES('user3', '유저3', 'p3', '세번째 유저')";

		//// 공통부분 ////
		Statement stmt = conn.createStatement(); // 상위 Connection을 통한 sql 통신
		stmt.executeUpdate(sql);
		System.out.println("INSERT SUCCESS!");
		stmt.close();
		conn.close();
		/////////
	}

}
