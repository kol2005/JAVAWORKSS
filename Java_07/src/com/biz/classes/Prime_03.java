package com.biz.classes;

public class Prime_03 {
	
	// 2~100 ���� ������ �Ҽ����� ����Ʈ ����
	public static void main(String[] args) {
		
		for(int i = 2 ; i <= 100000 ; i++) {
			
			// 2���� i-1���� ������ ���� i���� ������
			//�������� �ѹ��� 0�� �ƴϸ� �Ҽ�
			int index;
			for(index = 2 ; index < i ; index++) {
				if(i % index == 0)break;
			}
			if(index >= i)
				System.out.println("Prime : " + i);
				
		}
	}
	
}
