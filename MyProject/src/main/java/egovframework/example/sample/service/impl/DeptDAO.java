package egovframework.example.sample.service.impl;

import java.util.List;

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

	/* 부서 목록 출력 */
	public List<?> selectDeptList(DeptVO vo) throws Exception{
		return list("deptDAO.selectDeptList", vo);
	}

	/* 부서 상세 내용*/
	public DeptVO selectDeptDetail(int dnum) {
		return (DeptVO) select("deptDAO.selectDeptDetail", dnum);
	}
}