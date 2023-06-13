package egovframework.example.sample.service;

public class CodeVO {
	private int code;	 // 일련번호
	private int groupid; // 코드 분류
	private int name;	 // 코드 이름
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
}