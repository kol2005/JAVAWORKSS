package com.biz.classes.user;

//public static int nCount = 0;

public class User_033 {
	
	/*
	 * class ���� ����(scope)
	 * class ������� ����
	 * 
	 * class ������� ������ ���� ������
	 * ���ʿ� �ѹ� count �� ȣ��ɶ�
	 * ����,����,�ʱ�ȭ �� �� 
	 * �ڵ尡 ���̻� ������� �ʴ´�
	 * 
	 * �� �ڵ忡���� count() �޼��尡 ȣ��Ǹ�
	 * nCount �� 1�� �����ǵ��� �Ǿ� �ִ�.
	 * 
	 * ���� ������Ʈ�� ����Ǵ� ����
	 * count() �޼��带 ȣ���ϸ�
	 * nCount �� ��� 1�� �����ϰ� 
	 * �� ����� console�� ǥ�õȴ�
	 */
	public static int nCount = 0;
	
	public static void count() {
		// count() �ż��尡 ȣ��ɶ�����
		//nCount �� ���� �����̵ǰ� 0���� clear
		//int nCount = 0;
		nCount ++;
		System.out.println(nCount + " ��° ȣ��");
		
		
	}
	
	
}
