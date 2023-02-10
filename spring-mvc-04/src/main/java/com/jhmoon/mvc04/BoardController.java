package com.jhmoon.mvc04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jhmoon.mvc04.dao.BoardDao;
import com.jhmoon.mvc04.vo.BoardVo;

@Controller
public class BoardController {

	@Autowired
	BoardDao boardDao = new BoardDao(); // BoardDao(Data Access Object)

	@RequestMapping("/board")
	public String home() {
		return "board/home";
	}

	// 게시물 등록 폼
	@RequestMapping(value = "/board/insert")
	public String insert() {
		return "board/insert";
	}

	// 게시물 등록 작업
	// 파라미터로부터 등록값추출 -> BoardVo에 저장
	// TABLE에 저장
	@RequestMapping(value = "/board/insert", method = RequestMethod.POST)
	public String insert_post(Model model, BoardVo vo // 파라미터와 동일한 이름의 변수에 자동저장
	) {
		try {
			boardDao.save(vo);
			model.addAttribute("msg", "등록 성공");
		} catch (Exception e) {
			model.addAttribute("msg", "등록 오류 발생");
			model.addAttribute("err", e);
			e.printStackTrace();
		}

		return "board/insert_result";
	}

	// 게시물 리스트
	@RequestMapping(value = "/board/list")
	public String list(Model model) {
		List<BoardVo> boardList = boardDao.selectAll();
		model.addAttribute("boardList", boardList);

		return "board/list";
	}

	// 게시물 상세보기
	@RequestMapping(value = "/board/detail")
	public String list(Model model, @RequestParam int no) {
		BoardVo vo = boardDao.selectOne(no);
		model.addAttribute("vo", vo);

		return "board/detail";
	}

	// 게시물 수정 폼
	@RequestMapping(value = "/board/update")
	public String update(Model model, @RequestParam int no) {

		BoardVo vo = boardDao.selectOne(no);
		model.addAttribute("vo", vo);
		return "board/update";
	}

	// 게시물 수정 작업
	// 수정 작업 시, 입력 암호가 기존 암호와 동일해야 함
	@RequestMapping(value = "/board/update", method = RequestMethod.POST)
	public String update_post(Model model, @RequestParam BoardVo vo // 파라미터와 동일한 이름의 변수에 자동 저장
	) {
		try {
			BoardVo vo2 = boardDao.selectOne(vo.getNo());
			if (vo.getPasswd().equals(vo))
				boardDao.update(vo);
			model.addAttribute("msg", "수정 성공!");
		} catch (Exception e) {
			model.addAttribute("msg", "수정 오류 발생!");
			model.addAttribute("err", e);
			e.printStackTrace();
		}
		return "board/update_result";
	}

	// 게시물 삭제 폼
	@RequestMapping(value = "/board/delete")
	public String delete(Model model, @RequestParam int no) {
		BoardVo vo = boardDao.selectOne(no);
		model.addAttribute("vo", vo);

		return "board/delete";
	}

	// 게시물 삭제 작업
	@RequestMapping(value = "/board/delete", method = RequestMethod.POST)
	public String delete_post(Model model, @RequestParam BoardVo vo) {
		int no = vo.getNo();
		BoardVo vo2 = boardDao.selectOne(no);

		try {
			if (vo2.getPasswd().equals(vo.getPasswd())) {
				boardDao.delete(no);
				model.addAttribute("msg", "암호가 일치합니다. 삭제 성공!");
			} else {
				model.addAttribute("msg", "암호가 일치하지 않습니다. 삭제 실패!");
			}
		} catch (Exception e) {
			model.addAttribute("msg", "오류 발생!");
			model.addAttribute("err", e);
			e.printStackTrace();
		}

		return "board/delete_result";
	}

}
