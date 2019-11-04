package com.biz.grade.service;

import java.util.Random;

import com.biz.grade.model.GradeVO;

public class GradeVoService {

	private GradeVO[] gradeVO;
	Random rnd;

	public GradeVoService(int length) {

		gradeVO = new GradeVO[length];
		for (int i = 0; i < gradeVO.length; i++) {
			gradeVO[i] = new GradeVO();

		}
		rnd = new Random();
	}// GradeVoService() end

	// Random�� �̿��� ���� ����
	public void input() {

		// gradeVO ��ü �迭�� ������ŭ �ݺ��ϰڵ�
		for (int i = 0; i < gradeVO.length; i++) {

			// �й��� 00001 ~ 00???
			String strNum = String.format("%05d", (i + 1));
			gradeVO[i].strNum = strNum;

			// 51���� 100������ ���� ���ڸ� ����
			int intKor = rnd.nextInt(50) + 51;
			gradeVO[i].intKor = intKor;

			gradeVO[i].intEng = rnd.nextInt(50) + 51;
			gradeVO[i].intMath = rnd.nextInt(50) + 51;

		}

	}// input() end

	public void total() {

		// ����� ����Ͽ� gradeVO�� intAvg ������ ����

		for (int i = 0; i < gradeVO.length; i++) {
			int intSum = gradeVO[i].intKor;
			intSum += gradeVO[i].intEng;
			intSum += gradeVO[i].intMath;
			gradeVO[i].intSum = intSum;
			gradeVO[i].intAvg = intSum / 3;
		}
	}

	/*
	 * 
	 */
	public void view() {

		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumsum = 0;
		int sumAvg = 0;
		
		System.out.println("====================================================================");
		System.out.println("�����϶�ǥ");
		System.out.println("====================================================================");
		System.out.println("�й�\t����\t����\t����\t����\t���\t����");
		System.out.println("--------------------------------------------------------------------");
		for (int i = 0; i < gradeVO.length; i++) {
			System.out.printf("%s\t", gradeVO[i].strNum);
			System.out.printf("%3d\t", gradeVO[i].intKor);
			System.out.printf("%3d\t", gradeVO[i].intEng);
			System.out.printf("%3d\t", gradeVO[i].intMath);
			System.out.printf("%3d\t", gradeVO[i].intSum);
			System.out.printf("%3d\t", gradeVO[i].intAvg);
			System.out.printf("%3d\n", gradeVO[i].intRank);
			sumKor += gradeVO[i].intKor;
			sumEng += gradeVO[i].intEng;
			sumMath += gradeVO[i].intMath;
			sumsum += gradeVO[i].intSum;
			sumAvg += gradeVO[i].intAvg;
		}
		System.out.println("====================================================================");
		//System.out.println("\t\t����\t��ü����\t��ü���");
		System.err.printf("\t%3d\t%3d\t%3d\t%3d\t%3d\n",sumKor,sumEng,sumMath,sumsum,sumAvg/gradeVO.length);
		
		
	}// view() end

	// ������ �������� �������� ������ �����ϰ�
	// 1~�迭���� ��ŭ ���� ���� intRank; ������ �����Ͽ�
	// ������ �ο�
	// ��, ������ ó���� ���� �ʴ´�
	public void rank() {
		for (int i = 0; i < gradeVO.length; i++) {
			for (int j = i + 1; j < gradeVO.length; j++) {
				if (gradeVO[i].intSum < gradeVO[j].intSum) {

					// GradeVO Ŭ������ �̿��Ͽ�
					// _temp �ӽ� ��ü�� �����ϰ�
					// gradeVO[i] �� _temp ��ü�� ����
					// gradeVO[i] �� ���Ե� �����������
					// ��°�� _temp ������ ���簡 �ȴ�
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
				}
			}
		} // for i end
		for (int i = 0; i < gradeVO.length; i++) {
			gradeVO[i].intRank = i + 1;
		}
	}// rank() end

	// �й� ������ �ٽ� ������
	public void sort() {
		for (int i = 0; i < gradeVO.length; i++) {
			for (int j = i + 1; j < gradeVO.length; j++) {
				if (Integer.valueOf(gradeVO[i].strNum) > Integer.valueOf(gradeVO[j].strNum)) {
					GradeVO _temp = gradeVO[i];
					gradeVO[i] = gradeVO[j];
					gradeVO[j] = _temp;
				}
			}
		}
	}
}
