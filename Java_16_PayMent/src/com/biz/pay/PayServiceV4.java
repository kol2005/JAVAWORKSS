package com.biz.pay;

public class PayServiceV4 extends PayServiceV2 {

	public void whilePay(int nPay) {

		this.headerView(nPay);

		int intSw = 1;

		/*
		 * ���ǹ� (if, while, for)�� �ڵ��Ҷ�
		 * �ε�ȣ(<>) �� EQ(=) �� ���� ����ؾ��� ���ǹ���
		 * �ε�ȣ�� ����ؼ� ����� �ִٸ�
		 * �ε�ȣ�� ����ؼ� �ڵ��� �ض�
		 */
		// while(nPay >= 5) {
		while (nPay > 1) {// 5���� ��� ������ �ɱ��?

			// 5���� ��� ������ �ɱ��? yes
			// if(nPay < 5 ) break;

			int nCount = nPay / nMoney; // �ż����
			nPay -= nCount * nMoney; // nPay = nPay - nCount * nMoney
			if (intSw == 1) {
				nMoney /= 5; // nMoney \ nMoney / 5
			} else {
				nMoney /= 2; // nMoney \ nMoney / 2
				intSw = 0;
			}
			intSw = intSw * (-1);

		}
	}

}
