package mybatis01;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jdbc02.vo.MemberVo;

public class Main01 {

	public static void main(String[] args) throws Exception {
		// mybatis식 접근방식
		String resource = "mybatis/config/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

//		try (SqlSession session = sqlSessionFactory.openSession()) { // true 옵션 시 auto commit
//			MemberVo vo = session.selectOne("selectOne", "user100"); // id, #{mid}
//			System.out.println(vo);
//		}

		// 목록 추출
		try (SqlSession session = sqlSessionFactory.openSession(true)) { // true 옵션 시 auto commit
			List<MemberVo> mlist = session.selectList("selectAll"); // id, #{mid}
			System.out.println("전체 출력");
			for (MemberVo vo : mlist) {
				System.out.println(vo);
			} // end for
		} // end try

//		// 등록
//		try (SqlSession session = sqlSessionFactory.openSession(true)) { // true 옵션 시 자동 커밋
//			MemberVo vo = new MemberVo("user101", "유저101", "p101", "백한번째 유저");
//			session.insert("insert", vo);
//			// session.commit(); // 수동 커밋
//			System.out.println("등록 성공");
//		}
	}// end main

}
