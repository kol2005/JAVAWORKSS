package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListMakeServiceV1 {

	private List<String> strList;

	public ListMakeServiceV1() {
		strList = new ArrayList<String>();
	}

	/*
	 * �ܺο��� strList �� ���������� �����ִ� method
	 */
	public List<String> getStrList() {
		return strList;
	}

	public void makeStrList() {
		
		/*
		 * A-001 ~ A-020 ���� ������� ���ڿ��� ������
		 * �׸��� strList �� ������� �߰��Ͽ� List�� ������
		 */
		for (int i = 1; i < 20; i++) {
			String str = String.format("A-%03d", i);
			strList.add(str);

		}

	}

}
