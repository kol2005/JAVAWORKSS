package com.biz.var;

public class PloatVar_03 {

	public static void main(String[] args) {
		
		int intKor = 90;
		int intEng = 87;
		int intMath = 67;
		
		int intSum = intKor + intEng + intMath;
		float fAvg = intSum / 3.0f;
		
		// %d : ���������� ����ϴ� ESCAPE ���ڿ�
		// %f : �Ǽ������� ����ϴ� ESCAPE ���ڿ�
		// %5d : ��ü���̸� 5�ڸ��� �ϰ�, ���������� �� �� ���ʿ� ��ĭ �����
		// %5.2 : ��ü���̸� 5�ڸ��� �ϰ�, �Ҽ������� 2�ڸ����� ǥ���ϰ�
		//			���������� �� �� ���ʿ� ��ĭ �����
		System.out.println("================");
		System.out.println("����ǥ");
		System.out.println("----------------");
		System.out.printf("���� : %5d\n",intKor);
		System.out.printf("���� : %5d\n",intEng);
		System.out.printf("���� : %5d\n",intMath);
		System.out.println("----------------");
		System.out.printf("���� : %5d\n",intSum);
		//System.out.printf("��� : %f\n",fAvg);
		System.out.printf("��� : %5.2f\n",fAvg);
		System.out.println("================");
		
		
		
		
	}

}
