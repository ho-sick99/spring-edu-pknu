package com.jhmoon.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindNumberController {
	/**
	 * 정답 (컴퓨터 난수)
	 */
	private int com_num = (int) (Math.random() * 100 + 1); // (int) (Math.random() * 100 + 1)로 난수 생성 가능 - 1번째 방법
	private int count = 0;

//	public FindNumberController() {
//		com_num = (int) (Math.random() * 100 + 1); // 처음 접속시의 난수 생성 - 2번째 방법
//	}

	@RequestMapping("find_number")
	public String find_number(Model model, @RequestParam(required = false, defaultValue = "-1") int num) {
//		if (num == -1) { // 처음 접속시의 난수 생성 - 3번째 방법
//			com_num = (int) (Math.random() * 100 + 1); // 1~100사이 난수 생성
//		}

		String msg = ""; // 결과 판정
		count++;

		if (count > 10) {
			msg = "당신은 바보입니다. 정답은 " + com_num + "입니다. 새로운 숫자를 맞춰보세용";
			com_num = (int) (Math.random() * 100 + 1);
			count = 0;
		} else if (num < com_num) {
			msg = num + " : 정답은 더 높은 숫자입니다.";
		} else if (num > com_num) {
			msg = num + " : 정답은 더 낮은 숫자입니다.";
		} else {
			msg = "정답입니다! " + count + "번 만에 맞췄습니다. 정답을 새로운 숫자로 변경하였습니다. 다시 도전해 보세요!";
			com_num = (int) (Math.random() * 100 + 1);
			count = 0;
		}

		model.addAttribute("msg", msg);
		model.addAttribute("num", num);
		model.addAttribute("com_num", com_num);
		model.addAttribute("count", count);

		return "findNumber";
	}
}
