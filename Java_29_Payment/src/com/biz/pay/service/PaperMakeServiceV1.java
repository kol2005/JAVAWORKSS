package com.biz.pay.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

/*
 * �޿��׿� ���� ȭ��ż��� ����� �ϰ�
 * �� ����� List �� �㵵�� ����
 */
public class PaperMakeServiceV1 {
	
	List<PaperVO> paperList;
	
	public List<PaperVO> getPaperList(){
		return this.paperList;
	}
	/*
	 * �ܺο��� �޿����� �Ű������� ���Թް�
	 * ȭ��ż��� ����� ���� List �� ���
	 */
	public void make(int pay) {
		
		paperList = new ArrayList<PaperVO>();
		int paper = 50000; //���ѹα� ȭ���� �ְ���� �׸鰡
		
		int sw = 1;
		
		// ���ѹݺ����� �����ؼ� ȭ��ż��� ��� ����
		while(true) {
			if(pay < 5)break;
			//1. paper �׸鰡�� ���� ȭ��ż��� ���
			// pay �� ���Ե� paper �� �ż�
			int paperCount = (int)(pay/paper);
			
			// PaperVO �� �ϴ� ���
			PaperVO pVO = new PaperVO();
			pVO.setPaper(paper+"");//�׸鰡
			pVO.setCount(paperCount);//�ż�
			
			// pVO �� paperList �� ���
			paperList.add(pVO);
			
			// ���� pay ���� �׸鰡�� ����� �� 
			// �׸鰡 �ݾ׸�ŭ�� �����ؼ�
			// ���� �׸鰡 �ż��� ����ϵ��� ����
			pay -= (paper * paperCount);
			
			// ���ʿ� 5����, 1����, 5õ�� ������ �׸鰡�� ����ϰ�
			// �� �׸鰡�� ���� �ż��� ����ؾ� �ϱ� ������
			// paper ������ 5�������� 1������ �ǵ��� ����� ����
			if(sw > 0) {
				paper/=5;		
			}else {
				paper/=2;
			}
		sw *= (-1); // 1, -1, 1, -1, ��� ��ȭ
		

		}
		
	}
	
	
	
}
