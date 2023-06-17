package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Service("deptService")
public class DeptServiceImpl implements DeptService{
	@Resource(name="deptDAO")
	private DeptDAO dao;
	
	@Override	/* 부서 정보 입력 */
	public String insertDept(DeptVO vo) throws Exception {
		return dao.insertDept(vo);
	}
	
	@Override	/* 부서 목록 출력 */
	public List<?> selectDeptList(DeptVO vo) throws Exception {
		return dao.selectDeptList(vo);
	}

	@Override	/* 부서 상세 내용 */
	public DeptVO selectDeptDetail(int dnum) throws Exception {
		return dao.selectDeptDetail(dnum);
	}

	
	
	
	
	@Override	/* 부서 정보 수정 */
	public int updateDept(DeptVO vo) throws Exception {
		return dao.updateDept(vo);
	}

	@Override	/* 부서 정보 삭제 */
	public int deleteDept(int dnum) throws Exception {
		return dao.deleteDept(dnum);
	}
}