package com.biz.classes.arrays;

import java.util.Random;

public class Lottos {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] lottos = new int[6];
		
		// �ζǹ�ȣ 6���� ��� �����ߴ��� Ȯ���ϱ� ���� ����
		int nLottoIndex = 0;
		while(true) {
			
			//1���� 45���� ���� ���� ����
			int lotNum = rnd.nextInt(45) + 1;
			//���� ������ ��ȣ��
			//�̹� ������ ��ȣ�߿� �ֳ�? �� Ȯ��
			int index;
			for(index = 0 ; index < lottos.length ; index++) {
				
				//lottos �迭�� ����� ����
				//���� ������ ���� ���� ���� �ֳ�?
				if(lottos[index] == lotNum)break;
				
			}
			
			//���� ���� ����
			if(index >= lottos.length)
				
				//nLottoIndex ��ġ��
				//���� ������ ���� ä����
				//��ġ���� 1 �������Ѷ�
				lottos[nLottoIndex++] = lotNum;
			
			if(nLottoIndex >= lottos.length)break;
		}
		System.out.println("����� �ζǹ�ȣ : ");
		for(int i = 0 ; i < lottos.length ; i++) {
			System.out.print(lottos[i] + ", ");
		}

	}

}
