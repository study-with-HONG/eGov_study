package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	public String insertDept(DeptVO vo) throws Exception;		/* 부서 정보 입력 */
	public List<?> selectDeptList(DeptVO vo) throws Exception;	/* 부서 목록 출력 */
}