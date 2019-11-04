package com.biz.arrays.exec.score;

import java.util.Random;

import com.biz.array.model.ScoreVO;

/*
 * ScoreEx_01 Ŭ����������
 * ScoreVO Ŭ������ ��ü�� ������ ��
 * ��������� ���� �����ϴ� �ڵ尡 ��������ֵ�
 * 
 * �̶� ScoreVO Ŭ���� ���忡�� �ٶ󺸸�
 * ScoreEx_01 Ŭ������ �ܺ� Ŭ������� �Ѵ�
 * ScoreVO�� �̿��ؼ� ���� �ڵ带 �����ϴ� ����
 * (Ŭ����, �޼���)���� ScoreVO�� �ܺζ�� �Ѵ�
 */
public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreVO[] sVO = new ScoreVO[20];
		Random rnd = new Random();
		
		// ����� sVO�� �� ��Ҹ� �ʱ�ȭ�ϰ� 
		//���� ������ ���� ������ setting
		for(int i = 0 ; i < sVO.length ; i++) {
			
			//�� ������ ������ �޸� �ϱ� ���ؼ�
			//���񺰷� ������ �����Ѵ�.
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			String strNum = String.format("%03d", i+1);
			
			sVO[i] = new ScoreVO();
			sVO[i].strNum = strNum;
			sVO[i].intKor = intKor;
			sVO[i].intEng = intEng;
			sVO[i].intMath = intMath;
			
			//int intSum = intKor + intEng + intMath
			int intSum = intKor;
			intSum += intEng;
			intSum += intMath;
			
			//ScoreVO.intSum ���������
			//���������ڸ� private���� �����Ͽ��� ������
			// �ܺο��� �ش� ������ ���� �� �� ����.
			//sVO[i].intSum = intSum;
			
		}
		System.out.println("========================");
		System.out.println("�й�\t����");
		System.out.println("------------------------");
		for(int i = 0 ; i < sVO.length ; i++) {
			System.out.printf("%s\t%d\n",sVO[i].strNum,sVO[i].sum());
			
		}
		System.out.println("========================");

	}

}
