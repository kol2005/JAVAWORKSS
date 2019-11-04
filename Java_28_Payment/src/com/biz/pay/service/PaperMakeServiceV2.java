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
		
		String paper;// 액면가
		int count;// 매수

		count = 50000;// 대한민국 화폐단위 최상위 금액
		int sw = 1;

		while (true) {
			if (pay < 5)
				break;
			vo = new PaperVO();
			// 최초에 권명 50000 이므로
			// 매수는 5만원권 매수가 된다
			int 매수 = (int) (pay / count);
			System.out.printf("%d 원권 : %d\n", count, 매수);
			pay -= (매수 * count);

			vo.setPaper(매수+"");
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
