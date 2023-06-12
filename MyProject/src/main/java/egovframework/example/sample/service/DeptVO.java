package egovframework.example.sample.service;

public class DeptVO {
	// 객체지향 : 캡슐화(접근지정자 세팅)
	private String dnum;	// 부서번호
	private String dname;	// 부서이름
	private String dloc;	// 부서 지역
	
	public String getDnum() {
		return dnum;
	}
	public void setDnum(String dnum) {
		this.dnum = dnum;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
}