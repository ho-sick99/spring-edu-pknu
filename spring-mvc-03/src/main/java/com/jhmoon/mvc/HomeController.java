package com.jhmoon.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET) // value -> 경로(기본경로(http... 포트번호)는 생략)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate); // (키, 값)

		return "home";
	}

	@RequestMapping(value = "/hi") // default method -> GET
	public String hi(
			Model model, 
			@RequestParam(value = "myname2", required = false) String myname, // parameter 이름과 변수명이 다를 경우 value 속성 사용  
			@RequestParam(required = false, defaultValue = "0") int age) { // 요청 핸들러 메서드
		model.addAttribute("msg", myname + "님, 반갑습니다!");
		model.addAttribute("age", age);

		// 접두어(prefix) 지정 안할 시 -> /WEB-INF/views/hi.jsp
		// 접미어(suffix: jsp) 지정 안할 시 -> hi.jsp
		return "hi";
	}// end hi
}
