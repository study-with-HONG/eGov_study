package egovframework.example.sample.service.impl;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

	@Override	// 부서 데이터 입력
	public String insertDept(DeptVO vo) throws Exception {
		return null;
	}

}