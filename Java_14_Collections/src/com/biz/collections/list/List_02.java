package com.biz.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {
		
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("ȫ�浿");
		strList.add("�̸���");
		strList.add("������");
		strList.add("�Ӳ���");
		strList.add("����");
		strList.add("�庸��");
		
		System.out.println(strList);
		// strList ��ü�� �����ؼ�
		// �ٽ� strList �� �������ش�
		Collections.sort(strList);
		System.out.println(strList);
		
		//list �� ��� ���� �� ����� �� ����
		Collections.shuffle(strList);
		System.out.println(strList);
		

	}

}
