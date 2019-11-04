package com.biz.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_01 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		Set<String> strSet = new HashSet<String>();
		
		// List �� �߰��� ������� ����ȴ�
		// �߰��� �����Ͱ� ��� �� ������ �ȴ�
		strList.add("ȫ�浿");
		strList.add("�̸���");
		strList.add("������");
		strList.add("�庸��");
		strList.add("�Ӳ���");
		strList.add("����");		
		strList.add("�Ӳ���");
		strList.add("����");		
		
		
		// Set�� � ���������� �𸣰����� �� ����� ����
		// �̹� ����� ���� �ٽ� ������� �ʴ´�
		// �ߺ��� ������ ����
		strSet.add("ȫ�浿");
		strSet.add("�̸���");
		strSet.add("������");
		strSet.add("�庸��");
		strSet.add("�Ӳ���");
		strSet.add("����");
		strSet.add("�庸��");
		strSet.add("�Ӳ���");
		strSet.add("����");		


		System.out.println(strList.toString());
		System.out.println(strSet);
		
		// List �� �����͸� Set �� �����ͷ� ��ȯ
		// List �� ��� �����Ϳ��� �ߺ����� �����ϰ�
		// ����Ʈ�� ��� ���� ���
		Set<String> strSet1 = new HashSet<String>(strList);
		System.out.println(strSet1);
		
		strList = new ArrayList<String>(strSet1);
		System.out.println(strList);
		
	}

}
