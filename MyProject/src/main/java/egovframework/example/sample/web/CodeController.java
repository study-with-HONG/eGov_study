package egovframework.example.sample.web;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import egovframework.example.sample.service.CodeService;
import egovframework.example.sample.service.CodeVO;

@Controller
public class CodeController {
	@Resource(name="codeService")
	private CodeService service;
	
	/* 코드 입력 화면으로 이동 */
	@RequestMapping("/codeWrite.do")
	public String codeWrite() {
		return "MYcode/codeWrite";
	}
	
	/* 코드 정보 입력 */
	@RequestMapping("/codeSave.do")
	public String insertCode(CodeVO vo) throws Exception{
		String result = service.insertCode(vo);
		
		if(result == null) {
			System.out.println("@@@ 코드 저장 완료");
		} else {
			System.out.println("@@@ 코드 저장 실패");
		}
		
		// 저장 완료하면 여기로 이동
		return "redirect:codeList.do";
	}
}