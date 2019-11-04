package com.biz.pay;

import java.text.DecimalFormat;

public class PayServiceV1 {
	private int[] money =new int[] {
			50000,10000,5000,1000,500,100,50,10
	};
	
	/*
	 * ȭ������� ������� ������ �迭�� �����ϰ�
	 * ȭ��ż��� ����ϴ� ���
	 */
	public void array(int nPay) {
		
		DecimalFormat payform = new DecimalFormat("###,###,###,###");
		String strPay = payform.format(nPay);
		
		DecimalFormat paperform = new DecimalFormat("###,###");
		
		System.out.println("=================================");
		System.out.printf("�޿����ɾ� : %s\n",strPay);
		System.out.println("=================================");
		for(int i = 0 ; i < money.length ; i++) {
			int nCount = nPay / money[i]; // �ż� ���
			nPay = nPay - money[i] * nCount; // ����*���� ��ŭ ����
			System.out.printf("%8s ���� %4d��\n",paperform.format(money[i]),nCount);
		}
		System.out.println("=================================");
	}
}
