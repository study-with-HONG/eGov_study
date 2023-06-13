package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.CodeVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("codeDAO")
public class CodeDAO extends EgovAbstractDAO{
	/* 코드 정보 입력 */
	public String insertCode(CodeVO vo) {
		return (String) insert("codeDAO.insertCode", vo);
	}
}