package com.biz.string;

public class String_05 {

	public static void main(String[] args) {
		
		int num = 30;
		
		// num ������ 30�� ����ֳ�?
		// �� ����� bYes �� ��ƶ�
		boolean bYes = num == 30;
		
		if(bYes)
			System.out.println("num���� 30�� ����ִ�");
		else
			System.out.println("num���� 30�� ��� ���� �ʴ�");
		
		num = 50;
		int num1 = 30;
		
		bYes = num == num1;
		
		String strNation = "Korea";
		String strKorea = "Korea";
		
		bYes = strNation == strKorea;
		if(bYes)
			System.out.println("�� ���ڿ� ��ġ");
		else
			System.out.println("�� ���ڿ� �ٸ�");
		
		if(strNation == strKorea)
			System.out.println("�� ���ڿ� ��ġ");
		else
			System.out.println("�� ���ڿ� �ٸ�");
		/*
		 * ���ڿ� ������ �Ϲ�(Primitive)�� �޸� Ŭ������ �����̴�
		 * Ŭ������ ������ ���� �ý��� ������ 
		 * �۵��Ǵ� ����� �ణ �ٸ���
		 * 
		 * ���� ������ ���Ҷ� EQ(==)�� ����ؼ��� �ȵȴ�
		 * EQ�� ����ؼ� �񱳸� �ϸ� ���� �������� �ұ��ϰ�
		 * ���� �������� ��Ÿ���� ��찡 �ִ�
		 * 
		 * �׷��� ���ڿ� �񱳴� EQ(==)�� ������� �ʰ�
		 * ������ method�� ����ؼ� ���Ѵ�
		 */
		
		//�� ���ڿ� ������ ��� ���� ��ġ�Ѱ�?
		bYes = strNation.contentEquals(strKorea);
		bYes = strKorea.contentEquals(strNation);
		
		// ��ҹ��ڿ� ������� �ܾ���� ��ġ�Ѱ�?
		bYes = strNation.equalsIgnoreCase(strKorea);
		bYes = strKorea.equalsIgnoreCase(strNation);
		
		
		
		

	}

}
