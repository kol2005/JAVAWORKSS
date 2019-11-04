package com.biz.classes.service;

import java.util.Random;

import com.biz.classes.model.GradeScoreVO;

/*
 * ~~Service Ŭ����
 * ���� Ŭ������ �����͸� Ȱ���Ͽ�
 * �پ��� ������ �����ϴ� Ŭ�������� ��Ī�ϴ� ���̻�
 */
public class GradeScoreService {
	
	/*
	 * gradeScoreVO ��� (��ü)������
	 * GradeScoreService Ŭ�������� method ������
	 * �а�, ���⸦ �ϰ� �ִ�
	 * 
	 * ����
	 * GSEx_03���� gradeScoreVO ��������� �б�, ���⸦
	 * �����Ѵٸ� �翬�� �� ������ public Ű����� ������ �ؾ��Ѵ�
	 * 
	 * �׷��� ���� �ڵ�󿡼�
	 * GradeScoreService �� �ƴѰ�����
	 * gradeScoreVO ��������� �������� �ʴ´�.
	 * 
	 * �̷����� �ƿ� �ٸ� ������ gradeScoreVO ���������
	 * ����, �������� ���ϵ��� �ص� �ȴ�
	 * ���� gradeScoreVO ������ 
	 * �ٸ� ������ �������� ���ϵ��� Ű���带 
	 * private�� ������ �Ѵ�
	 * 
	 * private : public �� ������ ����, ���� �Ҽ� �ִٴ� �ǹ�
	 * 			private �� ���� Ŭ�������� �޼��忡����
	 * 			����, ������ �����ϵ��� �����ϴ� Ű�����̴�
	 */
	private GradeScoreVO[] gradeScoreVO;
	
	public void newVO(int length) {
		
		//length ������ ��� ���ڸ�ŭ
		//GradeScoreVO �迭�� ����
		//gradeScoreVO�� �Ҵ��Ѵ�
		gradeScoreVO = new GradeScoreVO[length];
	}
	
	public void makeScore() {
		Random rnd = new Random();
		
		for(int i = 0 ; i < gradeScoreVO.length ; i++) {
			gradeScoreVO[i] = new GradeScoreVO();
			
			String strNum = String.format("%03d", i+1);
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			gradeScoreVO[i].strNum = strNum;
			gradeScoreVO[i].intEng = intEng;
			gradeScoreVO[i].intMath = intMath;
			gradeScoreVO[i].intKor = intKor;
			
			gradeScoreVO[i].total();
			gradeScoreVO[i].average();
			
			
		}
	}//makeScore end
	public void scoreList() {
		System.out.println("==================================================");
		System.out.println("�����϶�ǥ");
		System.out.println("--------------------------------------------------");
		System.out.println("�й�\t����\t����\t����\t����\t���");
		System.out.println("--------------------------------------------------");
		for(int i = 0 ; i < gradeScoreVO.length ; i++) {
			System.out.print(gradeScoreVO[i].strNum + "\t");
			System.out.printf("%3d\t",gradeScoreVO[i].intKor);
			System.out.printf("%3d\t",gradeScoreVO[i].intEng);
			System.out.printf("%3d\t",gradeScoreVO[i].intMath);
			System.out.printf("%3d\t",gradeScoreVO[i].total);
			System.out.printf("%5.2f\n",gradeScoreVO[i].average);
		}
		System.out.println("==================================================");
		
	}
}
