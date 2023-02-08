package com.jhmoon.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FindGoldController {
	private int com_x = (int) (Math.random() * 10 + 1);
	private int com_y = (int) (Math.random() * 10 + 1);

	@RequestMapping("/findGold")
	public String findGold(Model model, @RequestParam(required = false, defaultValue = "-1") int x,
			@RequestParam(required = false, defaultValue = "-1") int y) {

		String msg = "";
		if (x > -1 && y > -1) {
			msg = "x = " + x + ", y = " + y;
			if (x == com_x && y == com_y) {
				msg += ". 금을 찾았습니다!";
			} else {
				int distance = (int) Math.sqrt((Math.pow(x - com_x, 2) + Math.pow(y - com_y, 2)));
				msg += ". 금과의 직선거리는 " + distance + "입니다!";
			}
		}

		model.addAttribute("msg", msg);

		return "findGold";
	}

}
