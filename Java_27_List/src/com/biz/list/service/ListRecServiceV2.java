package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

public class ListRecServiceV2 {
	
	/*
	 * recStrList �� �ܺο��� ���Ե� List
	 * 	- ListRecServiceV2 �� ������ ��ü���� ��� �����ϴ� List
	 * 	- �ٸ� ��ü���� recStrList ����(������) �����ϸ�
	 * 	- ��� ��ü(�ν��Ͻ�)�� ������ �ִ� recStrList ���� ���� ����
	 * 
	 * myStrList �� ��ü���� new ArrayList() �� ������ List
	 * 	- ListRecServiceV2 �� ��ü�� �����ϸ鼭
	 * 		new ArrayList() �� ������ �ϱ� ������
	 * 	- ���� ��ü(�ν��Ͻ�)���� �ڽ��� myStrList�� ������ �ص�
	 * 	- �ٸ� ��ü(�ν��Ͻ�)���� �ƹ��� ������ ����
	 */
	private List<String> recStrList;
	private List<String> myStrList;
	

	private String name;
	
	/*
	 * myStrList : ListServiceV1 ���� ���Ƿ� ������ List
	 * recStrList : �ܺο��� ���ԵǴ� List
	 */
	public ListRecServiceV2(List<String> recStrList, String name) {
		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;
		this.name = name;
	}
	
	public void remove() {
		
		// myStrList �� recStrList �� 0��° ��Ҹ� �����ϰ�
		// �� �÷��̾ �ްԵǴ� ī��
		this.myStrList.add(this.recStrList.get(0));
		
		// recStrList �� 0��° ��Ҹ� ����
		// ���迡�� Desk �� ��ü
		this.recStrList.remove(0);
	}
	
	public void viewList() {
		
		System.out.println("=========================================");
		System.out.println(this.name);
		System.out.println("-----------------------------------------");
		System.out.println(recStrList.toString());
		System.out.println(myStrList.toString());
		/*
		for (String str : this.recStrList) {
			System.out.println(str);
		}
		*/
		
	}

}
