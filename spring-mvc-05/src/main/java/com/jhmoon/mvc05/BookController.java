package com.jhmoon.mvc05;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jhmoon.mvc05.vo.BookVo;

@Controller
public class BookController {

	@Autowired
	private SqlSession session;

	@RequestMapping("/book_insert_form")
	public String book_insert_form() {

		return "book/book_insert_form";
	}

	@RequestMapping("/book_insert_action")
	public String book_insert_action(Model model, BookVo vo) {
		System.out.println("도서 정보: " + vo);
		session.insert("BookMapper.insert", vo);

		return "book/book_insert_action";
	}

	@RequestMapping("/book_list")
	public String book_list(Model model) {
		List<Object> bookList = session.selectList("BookMapper.selectAll");
		model.addAttribute("bookList", bookList);

		return "book/book_list";
	}

	@RequestMapping("/book_detail")
	public String book_detail(Model model, @RequestParam String title) {
		BookVo vo = session.selectOne("BookMapper.selectOne", title);
		model.addAttribute("vo", vo);

		return "book/book_detail";
	}

	@RequestMapping("/book_update_form")
	public String book_update_form(Model model, @RequestParam String title) {
		BookVo vo = session.selectOne("BookMapper.selectOne", title);
		model.addAttribute("vo", vo);

		return "book/book_update_form";
	}

	@RequestMapping("/book_update_action")
	public String book_update_action(Model model, BookVo vo) {
		System.out.println("회원정보 수집: " + vo);
		session.insert("BookMapper.update", vo);

		return "book/book_update_action";
	}

	@RequestMapping("/book_delete_action")
	public String book_delete_action(Model model, @RequestParam String title) {
		session.delete("MemberMapper.delete", title);
		model.addAttribute("msg", "도서 삭제 성공!");

		return "book/book_delete_action";
	}
}
