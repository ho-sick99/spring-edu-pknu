package com.jhmoon.mvc02;

import java.util.ArrayList;
import java.util.HashSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/today_lotto")
	public String today_lotto(Model model) {
		// 로또
		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size() < 6) {
			int r = (int) (Math.random() * 45 + 1);
			hs.add(r);
		}
		ArrayList<Integer> lottos = new ArrayList<Integer>(hs);
		model.addAttribute("lottos", lottos);

		return "today_lotto"; // 반환값에 suffix와 prefix를 붙여 jsp경로와 파일명이 결정됨
	}
}
