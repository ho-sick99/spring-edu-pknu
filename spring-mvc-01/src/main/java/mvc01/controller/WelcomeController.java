package mvc01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/home.do") // 매핑될 url
	public String home() { // 메서드명은 처리하는 url과 무관, 허나 관리, 디버깅시의 편의를 위해 보통 비슷한 이름으로 지정
		// SQL 처리 코드...
		
		// 결과를 만들 jsp 경로/이름 반환
		// jsp의 기준폴더는 webapp
		return "home.jsp";
	}
}
