package my.web.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudyController {
	
	@RequestMapping("/test.do")
	public String test() {
		return "MyStudy/test";
	}
}