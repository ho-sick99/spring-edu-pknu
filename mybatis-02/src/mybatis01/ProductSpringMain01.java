package mybatis01;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc02.vo.BookVo;

public class ProductSpringMain01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//		SqlSession session = context.getBean(SqlSession.class);
//		BookVo vo = session.selectOne("BookMapper.selectOne", "user100");
//		System.out.println(vo);

		SqlSession session = context.getBean(SqlSession.class);
		// BookVo는 책제목(title),출판사(publisher),저자(Writer),가격(price)로 구성된다.
		BookVo vo = new BookVo("자바기본", "해냄출판사", "저자01", 22000);
		session.insert("BookMapper.insert", vo);
		System.out.println("등록성공 1");

		vo = new BookVo("자바실무", "해냄출판사", "저자01", 25000);
		session.insert("BookMapper.insert", vo);
		System.out.println("등록성공 2");

		vo = new BookVo("스프링입문", "하남출판사", "저자02", 27000);
		session.insert("BookMapper.insert", vo);
		System.out.println("등록성공 3");

		vo = session.selectOne("BookMapper.selectOne", "자바실무");
		System.out.println("자바실무책정보: " + vo);

		// 자바실무책의 가격을 20000원으로 내림
		vo.setPrice(20000);
		session.update("BookMapper.update", vo);
		System.out.println("수정된 자바실무책정보: " + vo);

	}
}