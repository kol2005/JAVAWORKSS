package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListMakeServiceV1 {

	private List<String> strList;

	public ListMakeServiceV1() {
		strList = new ArrayList<String>();
	}

	/*
	 * 외부에서 strList 를 가져가도록 보내주는 method
	 */
	public List<String> getStrList() {
		return strList;
	}

	public void makeStrList() {
		
		/*
		 * A-001 ~ A-020 까지 순서대로 문자열을 만들자
		 * 그리고 strList 에 순서대로 추가하여 List를 만들자
		 */
		for (int i = 1; i < 20; i++) {
			String str = String.format("A-%03d", i);
			strList.add(str);

		}

	}

}
