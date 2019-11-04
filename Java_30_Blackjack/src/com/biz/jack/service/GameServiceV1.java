package com.biz.jack.service;

import java.util.List;
import java.util.Scanner;

import com.biz.jack.domain.DeckVO;
import com.biz.jack.utils.BlackjackUtils;

public class GameServiceV1 {

	DeckServiceV1 ds;
	List<DeckVO> deckList;
	Scanner scanner;
	
	public GameServiceV1() {
		ds = new DeckServiceV1();
		ds.makeDeck();
		
		// ������ �����ϱ� ���� 1���� ī�带 �����
		deckList = ds.getDeck();
		scanner = new Scanner(System.in);
		
	}
	
	public boolean gameStart(String playerName) {
		
		System.out.println(BlackjackUtils.getStringLong("=", 100));
		System.out.println("Game Start !!!");
		System.out.println(BlackjackUtils.getStringLong("=", 100));
		
		PlayerServiceV1 ���� = new PlayerServiceV1(deckList);
		PlayerServiceV1 Ÿ¥ = new PlayerServiceV1(deckList,playerName);
		
		for(int i = 0 ; i < 2 ; i++) {
			����.hit();
			Ÿ¥.hit();
		}
		// ���� ������ ������ 16�� �����̸� �ǹ������� �ѹ� �� hit
		����.hit();
		
		while(true) {
			//if(Ÿ¥.sumValue() > 21) break;
			int �������� = ����.sumValue();
			int Ÿ¥���� = Ÿ¥.sumValue();
			
			if(Ÿ¥.sumValue() == ����.sumValue()) {
				System.out.println("�������� ���� �¸�!!!");
			}
			System.out.println("===============================");
			System.out.println("1.Hit 2.stand 3.��������");
			System.out.println("-------------------------------");
			System.out.print("����>> ");
			String strM = scanner.nextLine();
			int intM = Integer.valueOf(strM);
			
			if(intM == 1) {
				Ÿ¥.hit();
				����.hit();	
			}else {
				Ÿ¥���� = Ÿ¥.sumValue();
				�������� = ����.sumValue();
				// �������
				if(Ÿ¥.sumValue() == ����.sumValue()) {
					System.out.println("�������� ���� �¸�!!!");
				}else if(Ÿ¥.sumValue() > ����.sumValue()) {
					System.out.println(playerName + "�¸�!!");
				}else {
					System.out.println("���� �¸�!!!");
				}
				System.out.println(BlackjackUtils.getStringLong("*", 100));
				System.out.println("�������� : " + ����.sumValue());
				System.out.println("Ÿ¥���� : " + Ÿ¥.sumValue());
				System.out.println(BlackjackUtils.getStringLong("*", 100));

			}
			if(Ÿ¥.sumValue() > 21) {
				System.out.println("�����¸�!!!");
				System.out.println("�ƹ�Ű�� ��������......");
				scanner.hasNextLine();
				return true;
			}
			if(����.sumValue() > 21) {
				System.out.println(playerName + "�¸�!!!");

			}
			if(Ÿ¥.sumValue() > 21 || ����.sumValue() > 21) {
				System.out.println("�ƹ�Ű�� ��������......");
				scanner.hasNextLine();
				return true;
			}
			if(intM == 2) return true;
			else if(intM == 3) return false;


		}
		
	}
	
}
