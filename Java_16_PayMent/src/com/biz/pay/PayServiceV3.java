package com.biz.pay;

public class PayServiceV3 extends PayServiceV2 {

	// array(int pay)
	// whilePay(int pay)

	// V2의 whilePay 가 맘에 안들어 다시 정의해서 사용할 예정

	@Override
	public void whilePay(int nPay) {

		this.headerView(nPay);

		int intSw = 1;

		// while(참인조건) { }
		// 참인조건을 만족하는 동안 { } 코드를 실행하라
		while (true) {

			if (nPay < 5)
				break;

			int nCount = nPay / nMoney; // 매수계산
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
