package com.biz.list.service;

import java.util.List;

public class ListEx_02 {

	public static void main(String[] args) {
		
		ListMakeServiceV1 lm = new ListMakeServiceV1();
		lm.makeStrList(); // list ����
		List<String> strList = lm.getStrList();
		
		ListRecServiceV2 ȫ�浿 = new ListRecServiceV2(strList, "ȫ�浿");
		ListRecServiceV2 �̸��� = new ListRecServiceV2(strList, "�̸���");
		ListRecServiceV2 ������ = new ListRecServiceV2(strList, "������");
		
		
		ȫ�浿.viewList();
		ȫ�浿.remove();
		�̸���.viewList();
		�̸���.remove();
		������.viewList();
		������.remove();
		
		ȫ�浿.viewList();
		ȫ�浿.remove();
		
		ȫ�浿.viewList();
		�̸���.viewList();
		������.viewList();
	}

}
