package com.biz.classes.string;

public class String_03 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		//���ڿ��� ����(����)�� Ȯ���ؼ� ���� intLength �� ����
		int intLength = strNation.length();
		char cSearch = 'o';
		int index = 0;

		// i���� 0 ~ intLength - 1 �̶�� ����
		//0��°���� intLength - 1 ��° ���� ��� ������
		//�����ϴ� ���� �ݺ� �����ϰڴ�
		for (int i = 0 ; i < intLength ; i++) {
		char cA = strNation.charAt( i );
		if (cA == cSearch)
			System.out.println( i + " �� ��ġ�� ����");

		}
	}

}
