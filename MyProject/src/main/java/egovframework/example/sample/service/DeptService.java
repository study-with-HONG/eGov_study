package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	public String insertDept(DeptVO vo) throws Exception;		/* 부서 정보 입력 */
	public List<?> selectDeptList(DeptVO vo) throws Exception;	/* 부서 목록 출력 */
	public DeptVO selectDeptDetail(int dnum) throws Exception;	/* 부서 상세 내용 */
	
	
	
	public int updateDept(DeptVO vo) throws Exception;			/* 부서 정보 수정 */
	public int deleteDept(int dnum) throws Exception;			/* 부서 정보 삭제 */
}