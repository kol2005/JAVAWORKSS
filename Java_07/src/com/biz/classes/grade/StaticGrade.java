package com.biz.classes.grade;

/*
 * � class�� ����� 
 * �������, �޼��忡 
 * �Ѱ��� static �̶�� Ű���带 ���̸�
 * class �� static class �� �ȴ�.
 * 
 * static class �� �ȴٴ� ��
 * - ������Ʈ�� RUN(������ �� ����)�ϸ�
 * 	JVM �� �ڵ����� Ŭ������ ����, ����, �ʱ�ȭ�Ͽ�
 * 	����Ҽ� �ֵ��� �̸� �غ�����شٴ� ����
 */
public class StaticGrade {
	
	//�������
	public static String strNum;
	public static String strName;
	public static int intKor;
	public static int intEng;
	public static int intMath;
	
	public static void sum() {
		//staticGrade Ŭ������ sum() �޼����� ��ü�κ�
		
		int sum = intKor + intEng + intMath;
		System.out.println("���� : " + sum);
		
	}
	
	
	
	
	
	
}
