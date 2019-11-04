package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;

public class MethodEx_04 {

	public static void main(String[] args) {
		
		MakeListService ms = new MakeListService();
		
		/*
		 *  MakeListService Ŭ������ getListAll() method �� ȣ���ؼ�
		 *  �����ΰ��� �����Ϸ��� �ڵ带 �ۼ��ߴ�
		 *  getListAll() method �� ��� ���ǵǾ� �ִ��� �˼��� ���
		 *  ������ ȣ���� �ߴ���
		 *  �ƹ��� ������ ����
		 */
		ms.getListAll();
		
		// eclipse �� assist ����� Ȱ���Ͽ�
		// ms.get ( . ��������) �̶�� �Է��ߴ���
		// getListAll() method �� ���ǵ� ���¸� �� �� �־���
		
		// ms.getListAll() : List<Integer> - MakeListService
		
		// �� ������ �������� getListAll() �� List<Integer> type ��
		// � �����͸� return ���ֵ��� ������(�ۼ�) �Ǿ��ٴ� ����
		// �� �� �ְ� �Ǿ���
		// List<Integer>type �� aList ������ �����ϰ�
		// = ms.getListAll() ���·� method �� ȣ���Ͽ�
		// getListAll() method �� return �ϴ� ����
		// aList ������ �����ϵ��� �ڵ带 �ϼ��ߴ�
		List<Integer> intList = ms.getListAll();
		
		

	}

}
