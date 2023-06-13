package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Repository;
import egovframework.example.sample.service.DeptVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("deptDAO")
//sql과 연결하는 메소드(insert, select, update, delete)를 사용하기 위해 EgovAbstractDAO 상속
public class DeptDAO extends EgovAbstractDAO{
	/* 부서 정보 입력 */
	public String insertDept(DeptVO vo) throws Exception {
		//						sql에서 사용할 아이디
		return (String) insert("deptDAO.insertDept", vo);
	}
}