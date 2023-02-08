package com.jhmoon.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
	@RequestMapping("/simple_calc")
	public String simple_calc() {
		return "simple_calc";
	}

	@RequestMapping("/action_calc")
	public String action_calc(Model model, @RequestParam int n1, @RequestParam int n2, @RequestParam String op) {
		double res = 0;
		switch (op) {
		case "+":
			res = n1 + n2;
			break;
		case "-":
			res = n1 - n2;
		case "*":
			res = n1 * n2;
		case "/":
			res = n1 / n2;
		default:
			break;
		}

		model.addAttribute("msg", n1 + op + n2 + "=" + res);
		return "action_calc";
	}
}
