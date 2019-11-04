package com.biz.method.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeListService {

	Random rnd = new Random();
	List<Integer> intList;
	
	public List<Integer> getListAll() {
		
		int num1 = rnd.nextInt();
		int num2 = rnd.nextInt();
		int num3 = rnd.nextInt();
		int num4 = rnd.nextInt();
		int num5 = rnd.nextInt();
		
		intList = new ArrayList<Integer>();
		
		intList.add(num1);
		intList.add(num2);
		intList.add(num3);
		intList.add(num4);
		intList.add(num5);
		
		return intList;
		
	}
	
	/*
	 * ȣ���ϴ� ������ � �������� �Ķ���ͷ� ������ �ָ�
	 * 		==>> getListAll(10)
	 * length �Ű������� ���� �ް�
	 * 		==>> length �� ����� ���� 10�̴�
	 * 
	 * ����������ŭ ���� ������ �����Ͽ� intList�� �߰��ϰ�
	 * 		==>> 10���� ������ �����ϰ� intList �� �߰�
	 * 
	 * ȣ���� ������ return �ϵ��� �ۼ�
	 * 		==>> �������� 10�� ��� intList �� return �϶�
	 */
	public List<Integer> getListAll(int length){
		intList = new ArrayList<Integer>();
		for(int i = 0 ; i < length ; i++) {
			int num = rnd.nextInt();
			intList.add(num);
		}
		return intList;
	}
	
}
