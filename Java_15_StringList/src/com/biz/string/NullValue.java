package com.biz.string;

import com.biz.string.domain.StudenVO;

/*
 * null ��, null value
 * type �� ���� (���� Ű����
 */

public class NullValue {

	public static void main(String[] args) {

		// ������ �����ϰ� �ʱ�ȭ �ϱ�
		
		// �������� Ű���� ù���ڰ� �ҹ��ڷ� ���۵Ǵ� ����
		// �̶� ����Ǵ� ������ primitive(�⺻��) ������� �Ѵ�
		// �⺻�� ������ clear �Ҷ���
		// ������ ������ clear �ؾ� �Ѵ�

		int num = 0;
		float fnum = 0.0f;
		boolean b = true;
		
		// �⺻�� ������ �迭�� ������ �ϸ�
		// �� ����(�迭)���� ���������� �ٲ��
		int[] nums = null;
		
		// �������� Ű���� ù���ڰ� �빮�ڷ� ���۵Ǵ� ����
		// �̶� ����Ǵ� ������ type �� (������, reference��)
		//		������� �Ѵ�
		// type �� ������ clear �Ҷ��� 
		//		null Ű���带 ����Ͽ� clear �Ҽ� �ִ�
		// type�� ������ clear ���� �ʰ�
		//		���� �ʱ�ȭ, ������ �ϱ⵵ �Ѵ�
		String s = "";
		s = new String();
		
		StudenVO studentVO = null; // clear
		studentVO = new StudenVO(); // �ʱ�ȭ, ����
		String sNull = null;
		
		Integer num1 = 0; // ���� 0�� ������ ���� ����
		Integer num2 = null; // �ƹ��� ���� ���� ����
		
		Float fnum1 = null;
		Double dNum1 = null;
		Boolean boo = null;
		Character cA = null;

	}

}
