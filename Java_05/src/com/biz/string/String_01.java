package com.biz.string;

public class String_01 {

	public static void main(String[] args) {
		
		// ���ڿ� ���� ����� �� �Ҵ�
		//String Ŭ���� Ű���带 ����ؼ�
		//strNation ���ڿ� ������ �����ϸ�
		//String Ŭ������ ���ԵǾ� �ִ� �޼��� ���߿�
		//�Ϻθ� strNation ���ڿ� ������ �����޴´�
		//
		//strNation.method() �������� �ش��ϴ� �޼������
		//����ؼ� ���� ����� ������ �� �ִ�
		String strNation = "Republic of Korea";
		String s = "Korea";
		
		
		int num = 3;
		
		//String.length()
		//strNation ���ڿ� ������ �����ϰ� �ִ�
		//���ڿ� Republic of Korea �� ���� ������
		//ī��Ʈ�Ͽ� �ִ� ���
		int intLength = strNation.length();
		System.out.println("strNation ���ڿ� ���� : " + intLength);
		
		//������ ������� �ʰ� �ٸ� method()�� �����ϴ� ��������
		//����� ���� �ִ�
		System.out.println(strNation.length());
		
		strNation = "���ѹα�";
		System.out.println(strNation.length());
		
		String s1 = "Korea";
		String s2 = "���ѹα�";
		
		//�ΰ��� ���ڿ� ������ �����(������) ���ڿ���
		//��ü ������ ���ΰ�
		int sum = s1.length() + s2.length();
		System.out.println("���ڿ��� ���� �� : " + sum);
		
		
		
	}

}
