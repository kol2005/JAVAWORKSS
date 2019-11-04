package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListRecServiceV1 {
	private List<String> myStrList;
	private List<String> recStrList;

	public ListRecServiceV1() {

	}
	
	/*
	 * myStrList : ListServiceV1 ���� ���Ƿ� ������ List
	 * recStrList : �ܺο��� ���ԵǴ� List
	 */
	public ListRecServiceV1(List<String> recStrList) {
		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;

	}
	
	public void setStrStrList(List<String> recStrList) {
		this.recStrList = recStrList;
	}
	
	public void viewList() {
		for (String str : this.recStrList) {
			System.out.println(str);
		}
	}

}
