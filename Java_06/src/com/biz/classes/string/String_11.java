package com.biz.classes.string;

public class String_11 {

	public static void main(String[] args) {
		
		/*
		 * 1���� 100���� �����߿��� 7�� ����� 2��°�� ��Ÿ����
		 * �� ���� ǥ���Ͻÿ�
		 */
		int nCount = 0;
		int intMax = 100;
		int intMul = 7; // ���
		int intSearch = 3; //���°
		
		for (int i = 1 ; i < intMax ; i++) {		
			if(i % intMul == 0) nCount ++;
				if(nCount == intSearch) {
					System.out.println(nCount + ":" + i);
					break;
				}
		}
		/*
		 * �ڵ带 �����Ҷ� ���߿� �ٸ� �뵵�� Ȱ���� ���� ���ο� �ΰ�
		 * �ϵ��ڵ��ϴ� �ͺ��ٴ� ������ Ȱ���϶�
		 */

	}

}
