package com.biz.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_02 {

	public static void main(String[] args) {
		
		// ����� ������ �����ϰ� �����ϸ�
		// �ߺ��� ���� ������(�ߺ�����) �����Ѵ�
		Set<String> strSet = new HashSet<String>();
		//strSet = new TreeSet<String>();
		
		strSet.add("ȫ�浿");
		strSet.add("�̸���");
		strSet.add("������");
		strSet.add("�庸��");
		strSet.add("�Ӳ���");
		strSet.add("����");
		strSet.add("�庸��");
		strSet.add("�Ӳ���");
		strSet.add("����");
		
		System.out.println(strSet);
		
		// �ߺ����� ���·� �����ϸ�
		// ����Ǵ� ���� ����(��������)�Ѵ�
		Set<String> strSet1 = new TreeSet<String>();
		
		strSet1.add("ȫ�浿");
		strSet1.add("�̸���");
		strSet1.add("������");
		strSet1.add("�庸��");
		strSet1.add("�Ӳ���");
		strSet1.add("����");
		strSet1.add("�庸��");
		strSet1.add("�Ӳ���");
		strSet1.add("����");
		
		System.out.println(strSet1);

	}

}
