package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodService;

public class MethodEx_04 {

	public static void main(String[] args) {
		
		// MethodService Ŭ������ ����ؼ�
		// ms ��ü�� �����Ѵ�.
		// MethodService Ŭ������ ���Ե�
		// �������, method�� ����ϱ� ���� �غ�
		MethodService ms = new MethodService();
		int retNum = ms.getintsum(30,40);
		System.out.println("30 x 40 = "+retNum);

	}

}
