package egovframework.example.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;

@Controller
public class DeptController {
	@Resource(name="deptService")
	private DeptService service;
	
	// 부서 정보 입력창으로 이동
	@RequestMapping(value="/deptWrite.do") // 'value=' 생략 가능
	public String deptWrite() {
		return "dept/deptWrite";
	}
	//commit and push error
}