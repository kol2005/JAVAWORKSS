package com.biz.string;

import com.biz.string.StringService;
import com.biz.string.service.StringServiceImpV1;

public class String_01 {

	/*
	 * main() method
	 * �ڹٿ��� ������ method
	 * 1. main() method �� ��Ģ������ ������Ʈ���� 1����
	 * 		Ŭ�������� �־�� �Ѵ�
	 * 2. ��Ŭ���� ���� ���� ����������
	 * 		���� Ŭ������ main() method�� �ִ� ���� ���
	 * 3. ���� ������ ���� RUN �� ����������
	 * 		� Ŭ������ main() method �� ������ ��������
	 * 		���� �ٸ���
	 * 4. ��Ŭ���������� ���� ��Ŀ���� �ִ� Ŭ������
	 * 		main() method �� ���� ���� ����ȴ�
	 * 5. ���� ��Ŀ���� �ִ� Ŭ������
	 * 		main() method �� ������
	 * 		���� �������� �����ߴ� Ŭ������ main() method ��
	 * 		����ȴ�
	 */
	public static void main(String[] args) {
		
		StringService strService = new StringServiceImpV1();
		strService.input();
		strService.list();
		strService.view();
		
		
		
		

	}

}
