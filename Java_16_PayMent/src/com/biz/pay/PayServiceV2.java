package com.biz.pay;

import java.text.DecimalFormat;

public class PayServiceV2 extends PayServiceV1 {

	/*
	 * protected�� ������ ���������
	 * �� Ŭ����(PayServiceV2)�� ��ӹ��� Ŭ�����鿡��
	 * �����Ͽ� ����Ҽ� �ִ�
	 */
	protected int nMoney = 50000;
	protected DecimalFormat payperform = new DecimalFormat("###,###,###,###");
	/*
	 * PayServiceV1 ���� �ۼ��� array(int nPay)method �� 
	 * ����Ҽ� ����
	 */
	
	/*
	 * while �ݺ����� ����ؼ� ����
	 * 
	 */
	public void whilePay(int nPay) {
		
		
		int intSw = 0;


		this.headerView(nPay);

		while(true) {
			//ȭ��ż� ����� �����ϴ� ��������
			// nPay ���� �˻��Ͽ� 5�� �̸����� �ݾ��� ������
			// ���̻� ������ �������� ����
			if(nPay < 5)break;
			
			int nCount = nPay / nMoney; //�ż����
			nPay -= nCount *nMoney; // nPay = nPay - nCount * nMoney
			if(intSw == 0) {
				nMoney /= 5; // nMoney \ nMoney / 5
				intSw = 1;
			}else {
				nMoney /= 2; // nMoney \ nMoney / 2
				intSw = 0;
			}
				//nCount = nPay / nMoney; // �ż� ���
				//nPay = nPay - nMoney * nCount; // ����*���� ��ŭ ����
				//System.out.printf("%8s ���� %4d��\n",nMoney,nCount);
			}
			System.out.println("===================================");
			
		}
		
	protected void headerView(int nPay) {
		
		DecimalFormat payform = new DecimalFormat("###,###,###,###");
		String strPay = payform.format(nPay);
		
		
		System.out.println("=================================");
		System.out.printf("�޿����ɾ� : %s\n",strPay);
		System.out.println("=================================");
		
	}
}
