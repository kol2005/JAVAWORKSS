package com.biz.pay.Exec;

import java.util.List;

import com.biz.pay.domain.PaperVO;
import com.biz.pay.service.PaperMakeServiceV1;

public class PayEx_02 {

	public static void main(String[] args) {
		
		PaperMakeServiceV1 pm = new PaperMakeServiceV1();
		
		// ���ο��� ���޹��� �޿��ݾ� 3786790���� ����
		// ȭ��ż��� ����Ͽ� paperList�� ��� ���� ���̴�
		pm.make(3786790);
		
		List<PaperVO> paperList = pm.getPaperList();
		for(PaperVO vo : paperList) {
			System.out.printf("%s\t%d\n",vo.getPaper(),vo.getCount());
		}
		
	}
}
