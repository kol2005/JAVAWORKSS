package com.biz.for_if;

public class If_08 {

	public static void main(String[] args) {
		
		int intage = 121;
		//������ ������ 0�� �̻� 120�� ������ ����
		//intage >= 0, intage <= 120
		//����ϴµ� intage�� ��� ���� �ش� ���ǿ� ���� ������
		//�޽����� ǥ���Ͻÿ�
		
		if( intage >= 0 && intage <= 120 ) {
			System.out.println("���ǿ� ����");
		}
		
		if (intage < 0 || intage > 120) {
			System.out.println("���̴� 0������ 120�� ������ ����");
			System.out.println("���� �� : " + intage);
		} else {
			System.out.println("���ǿ� ����!!");
		}
		

	}

}
