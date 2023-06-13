package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
		return "MYdept/deptWrite";
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
		
		return "MYdept/deptSave";
	}
	
	/* 부서 목록 출력 */
	@RequestMapping("deptList.do")
	public String selectDeptList(DeptVO vo, ModelMap model) throws Exception{
		List<?> list = service.selectDeptList(vo);
		
		// jsp에 전달할 데이터 포장
		//			jsp에서 사용할 변수명, 실제 데이터 변수명
		model.addAttribute("list", list);
		
		// 여기로 전달
		return "MYdept/deptList";
	}
	
	/* 부서 상세 내용 */
	@RequestMapping("deptDetail.do")
	public String selectDeptDetail(int dnum, ModelMap model) throws Exception{
		DeptVO vo = service.selectDeptDetail(dnum);
		
		System.out.println("@@@ 선택한 부서 번호 : " + dnum);
		System.out.println("@@@ 보여줄 부서 번호 : " + vo.getDnum());
		
		model.addAttribute("vo", vo);
		
		// 여기로 전달
		return "MYdept/deptDetail";
	}
	
	/* 수정 전 부서 정보 불러오기 */
	@RequestMapping("deptUpdate.do")
	public String selectDeptUpdate(int dnum, ModelMap model) throws Exception{
		DeptVO vo = service.selectDeptDetail(dnum);
		
		model.addAttribute("vo", vo);
		
		// 여기로 전달
		return "MYdept/deptUpdate";
	}
	
	/* 부서 정보 수정 */
	@RequestMapping("deptUpdate.do")
	public String updateDept(DeptVO vo) throws Exception{
		int result = service.updateDept(vo);
		
		if(result == 1) {
			System.out.println("@@@ 부서 정보 수정 완료");
		}else {
			System.out.println("@@@ 부서 정보 수정 실패");
		}
		
		return "";
	}
	
	/* 부서 정보 삭제 */
	@RequestMapping("deleteDept.do")
	public String deleteDept(int dnum) throws Exception{
		int result = service.deleteDept(dnum);
		
		if(result == 1) {
			System.out.println("@@@ 부서 정보 삭제 완료");
		}else {
			System.out.println("@@@ 부서 정보 삭제 실패");
		}
		
		return "";
	}
}