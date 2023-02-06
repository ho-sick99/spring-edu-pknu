package jdbc02;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc02.vo.MemberVo;

public class Main03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//		// 1개 숫자나 문자를 가져올때
//		String sql = "SELECT count(*) from member";
//		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
//		System.out.println("저장 개수: " + count);
//		// 1개 행을 가져올때
//		String sql = "SELECT * from MEMBER where mid=?";
//		Map<String, Object> mem = jdbcTemplate.queryForMap(sql, "user100");
//		// 대문자 column명이 키
//		System.out.println(mem.get("MID"));
//		System.out.println(mem.get("MNAME"));
//		System.out.println(mem);
//		// 전체 데이터를 모두 추출 -> 게시글 목록
//		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * from MEMBER");
//		System.out.println("전체 유저 출력");
//		for (Map<String, Object> map : list) {
//			System.out.println(map);
//		}

//		// 1개 데이터를 VO에 자동 저장 -> 상세보기, 수정하기
//		String sql = "SELECT * from MEMBER where mid=?";
//		MemberVo vo = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<MemberVo>(MemberVo.class), "user100");
//		System.out.println("VO:" + vo);

		// 여러 행을 VO 리스트에 저장하기
		String sql = "SELECT * from MEMBER ORDER BY mid ASC"; // mid를 기준으로 오름차순 정렬
		List<MemberVo> mlist = jdbcTemplate.query(sql, new BeanPropertyRowMapper<MemberVo>(MemberVo.class));
		System.out.println("전체 유저 출력");
		for (MemberVo vo : mlist) {
			System.out.println(vo);
		} // end for
	}// end main

}
