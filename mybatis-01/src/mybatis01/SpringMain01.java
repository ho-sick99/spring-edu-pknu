package mybatis01;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc02.vo.MemberVo;

public class SpringMain01 {

	public static void main(String[] args) {
		// Spring식 접근방식
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		SqlSessionFactory sqlSessionFactory = context.getBean(SqlSessionFactory.class);
//		try (SqlSession session = sqlSessionFactory.openSession()) { // true 옵션 시 auto commit
//			MemberVo vo = session.selectOne("MemberMapper.selectOne", "user100"); // id, #{mid}
//			System.out.println(vo);
//		}

//		SqlSession session = context.getBean(SqlSession.class);
//		MemberVo vo = session.selectOne("MemberMapper.selectOne", "user100");
//		session.close(); // 세션 닫기
//		System.out.println(vo);
//
//		SqlSession session = context.getBean(SqlSession.class);
//		MemberVo vo = new MemberVo("user102", "유저102", "p102", "백두번째 유저");
//		session.insert("insert", vo);
//		System.out.println("등록 성공");

		// 수정 테스트 코드
		SqlSession session = context.getBean(SqlSession.class);
		MemberVo vo = session.selectOne("MemberMapper.selectOne", "user100");
		if (vo != null) {
			vo.setMintro(vo.getMintro() + " -수정");
			session.update("update", vo);
			System.out.println("수정 성공");
		}
	}

}
