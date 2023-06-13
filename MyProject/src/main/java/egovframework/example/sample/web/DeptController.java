package egovframework.example.sample.web;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Controller
public class DeptController {
	@Resource(name="deptService")
	private DeptService service;
	
	/* 부서 입력창으로 이동 */
	@RequestMapping(value="/deptWrite.do") // 'value=' 생략 가능
	public String deptWrite() {
		return "dept/deptWrite";
	}
	
	/* 부서 정보 입력 */
	@RequestMapping("deptSave.do")
	public String insertDept(DeptVO vo) throws Exception{
		// 데이터 확인
		System.out.println("@@@ 부서번호 : " + vo.getDnum());
		System.out.println("@@@ 부서이름 : " + vo.getDname());
		System.out.println("@@@ 부서위치 : " + vo.getDloc());
		
		// db에 저장
		String result = service.insertDept(vo);
		
		if(result == null) {
			System.out.println("@@@ 저장완료 @@@");
		}else {
			System.out.println("@@@ 저장실패 @@@");
		}
		
		return "dept/deptSave";
	}
}