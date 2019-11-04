package com.biz.jack.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.jack.domain.DeckVO;

public class PlayerServiceV1 {
	
	// �� �÷��̾�(��������)�� ���� ī�带 ������ List
	List<DeckVO> myDeckList;
	
	// deck���� ���徿 �÷��̾�� ������ ī���
	List<DeckVO> pubDeckList;
	String playerName ;
	
	public PlayerServiceV1(List<DeckVO> deckList) {
		this(deckList,"����");
	}
	

	
	public PlayerServiceV1(List<DeckVO> deckList, String playName) {
		
		this.myDeckList = new ArrayList<DeckVO>();
		this.pubDeckList = deckList;
		this.playerName = playName;
		
		
	}
	// �ڽ��� ���� ī���� ������ ����ϴ� method
	public int sumValue() {
		int sumValue = 0;
		for(DeckVO vo : myDeckList) {
			sumValue += vo.getValue();
		}
		return sumValue;
	}
	// �� player ���� hit �� ������ ������ method
	public void hit() {
		if(this.playerName.equals("����")&&this.sumValue()>16) {
			System.out.println("�������� : " + this.sumValue());
			System.out.println("���� Hit ����!!");
		}else {
			//���� ī�带 �� ī�� ����Ʈ�� �߰�
			myDeckList.add(pubDeckList.get(0));
			
			// ���� ī�忡�� ù�� 1���� ����
			pubDeckList.remove(0);
		}
		System.out.println("======================================");
		System.out.println(playerName);
		System.out.println("--------------------------------------");
		
		//���� �������� ī�� ����Ʈ�� �����ֱ�
		for(DeckVO vo : myDeckList) {
			System.out.println(vo);
		}
		System.out.println("--------------------------------------");
		System.out.println("�������� : " + this.sumValue());
		}
}
