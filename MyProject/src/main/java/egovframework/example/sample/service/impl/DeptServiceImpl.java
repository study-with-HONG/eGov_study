package egovframework.example.sample.service.impl;

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
}