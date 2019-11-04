package com.biz.files.domain;

public class NameVO {

	private String strName1;
	private String strName2;
	public String getStrName1() {
		return strName1;
	}
	public void setStrName1(String strName1) {
		this.strName1 = strName1;
	}
	public String getStrName2() {
		return strName2;
	}
	public void setStrName2(String strName2) {
		this.strName2 = strName2;
	}
	@Override
	public String toString() {
		return "NameVO [strName1=" + strName1 + ", strName2=" + strName2 + "]";
	}
	
	
	
}
