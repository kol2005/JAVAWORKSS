package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperMakeServiceV2 {

	private List<PaperVO> paperList;

	public PaperMakeServiceV2() {
		paperList = new ArrayList<PaperVO>();
	}

	public void make(int pay) {

		PaperVO vo = new PaperVO();
		
		String paper;// �׸鰡
		int count;// �ż�

		count = 50000;// ���ѹα� ȭ����� �ֻ��� �ݾ�
		int sw = 1;

		while (true) {
			if (pay < 5)
				break;
			vo = new PaperVO();
			// ���ʿ� �Ǹ� 50000 �̹Ƿ�
			// �ż��� 5������ �ż��� �ȴ�
			int �ż� = (int) (pay / count);
			System.out.printf("%d ���� : %d\n", count, �ż�);
			pay -= (�ż� * count);

			vo.setPaper(�ż�+"");
			vo.setCount(count);
			//System.out.println(vo.getPaper()+":"+vo.getCount());
			paperList.add(vo);
			if (sw > 0) {
				count /= 5;
			} else {
				count /= 2;
			}
			sw *= (-1);
			}
		for(PaperVO vo1 : paperList) {
			System.out.println(vo1.getPaper()+":"+vo1.getCount());
		}
		
	}

	public List<PaperVO> getPaperList() {
		return paperList;
	}

	public void setPaperList(List<PaperVO> paperList) {
		this.paperList = paperList;
	}
	
}
