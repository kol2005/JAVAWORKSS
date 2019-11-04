package com.biz.jack.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

/*
 * ���ӿ��� ����� 1���� ����ī�带 ����
 */
public class DeckServiceV1 {
	
	// ������ 1���� ī�带 List �� ����
	List<DeckVO> deckList;
	String suit = "���̾Ƹ��(��):��Ʈ(��):�����̵�(��):Ŭ�ι�(��)";
	String[] arrSuit = new String[] {"���̾Ƹ��(��)","��Ʈ(��)","�����̵�(��)","Ŭ�ι�(��)"};
	String denomination = "A234567890KQJ";
	
	public DeckServiceV1() {
		this.deckList = new LinkedList<DeckVO>();		
	}
	public List<DeckVO> getDeck(){
		
		int nSize = deckList.size();
		for(int i = 0 ; i < nSize ; i++) {
			Collections.shuffle(this.deckList);	
		}
		
		for(DeckVO vo : deckList) {
		Collections.shuffle(this.deckList);
		}
		
		return this.deckList;
	}
	
	public void makeDeck() { 
		
		String[] denoms = denomination.split("");
		for(String suit : arrSuit) {
			for(String denom : denoms) {
				// �� ī�尡 ���Ե� value �� ����
				// value ���� denoms �� �������� ����
				// 2~9������ ���̴� �� �״��
				// A�� 1�� JQK �� 10����
				int intValue = 0;
				
				try {
					// ���� 2~90������ ���� ������ ������ ����ȯ�� �ɰ��̴�
					// ������ A, JKQ�� Exception �� �߻��� �� ���̴�
					intValue = Integer.valueOf(denom);
					if(intValue == 0)intValue = 10;
				} catch (Exception e) {
					if(denom.equals("A"))intValue = 1;
					else intValue = 10;//JQK �϶�
				}
				
				DeckVO dVO = new DeckVO();
				dVO.setSuit(suit);
				dVO.setDenomination(denom);
				dVO.setValue(intValue);
				deckList.add(dVO);
				
				
				
			}
		}
		
		
	}

}
