package com.biz.method.service;

import java.util.List;

public class ViewListService {

	public void setListAll() {
		
		System.out.println("���� �ϴ����� �ϳ��� ���ٳ�!!");
		
	}
	
	/*
	 *  �������� ??�� ����ִ� list �� �Ű������� ���� �ް�
	 *  1. list �� �ֿܼ� �����ְ�
	 *  2. list �� ���Ե� �������� ������� return
	 */
	public int setListAllAndView(List<Integer>intList) {
		
		int nSize = intList.size();
		for (int i:intList) {
			System.out.println(i);
		}
		return nSize;
		
	}
}
