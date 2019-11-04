package com.biz.pay.service;

public class PaperMakeServiceV1 {

	public void make(int pay) {

		String paper;// 액면가
		int count;// 매수

		count = 50000;// 대한민국 화폐단위 최상위 금액
		int sw = 1;

		while (true) {
			if (pay < 5)
				break;
			// 최초에 권명 50000 이므로
			// 매수는 5만원권 매수가 된다
			int 매수 = (int) (pay / count);
			System.out.printf("%d 원권 : %d\n", count, 매수);
			pay -= (매수 * count);
			if (sw > 0) {
				count /= 5;
			} else {
				count /= 2;
			}
			sw *= (-1);
		}
	}
}
