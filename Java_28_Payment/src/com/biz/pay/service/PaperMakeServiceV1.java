package com.biz.pay.service;

public class PaperMakeServiceV1 {

	public void make(int pay) {

		String paper;// �׸鰡
		int count;// �ż�

		count = 50000;// ���ѹα� ȭ����� �ֻ��� �ݾ�
		int sw = 1;

		while (true) {
			if (pay < 5)
				break;
			// ���ʿ� �Ǹ� 50000 �̹Ƿ�
			// �ż��� 5������ �ż��� �ȴ�
			int �ż� = (int) (pay / count);
			System.out.printf("%d ���� : %d\n", count, �ż�);
			pay -= (�ż� * count);
			if (sw > 0) {
				count /= 5;
			} else {
				count /= 2;
			}
			sw *= (-1);
		}
	}
}
