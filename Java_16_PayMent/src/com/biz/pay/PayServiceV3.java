package com.biz.pay;

public class PayServiceV3 extends PayServiceV2 {

	// array(int pay)
	// whilePay(int pay)

	// V2�� whilePay �� ���� �ȵ�� �ٽ� �����ؼ� ����� ����

	@Override
	public void whilePay(int nPay) {

		this.headerView(nPay);

		int intSw = 1;

		// while(��������) { }
		// ���������� �����ϴ� ���� { } �ڵ带 �����϶�
		while (true) {

			if (nPay < 5)
				break;

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
