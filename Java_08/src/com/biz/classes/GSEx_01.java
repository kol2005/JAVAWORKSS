package com.biz.classes;

import com.biz.classes.model.GradeScoreVO;

public class GSEx_01 {

	public static void main(String[] args) {
		
		GradeScoreVO[] gsVO = new GradeScoreVO[10];
		for(int i = 0 ; i < gsVO.length ; i ++) {
			gsVO[i] = new GradeScoreVO();
		}
		gsVO[0].strNum = "001";
		gsVO[0].intKor = 99;
		gsVO[0].intEng = 88;
		gsVO[0].intMath = 87;
		
		// total() �޼��带 ȣ���ϸ�
		// ������ ������ ����� �Ŀ�
		//�ڽ��� total ��������� ���� ������ �д�
		//���������� ����Ҷ�
		//total ������ ���� ������
		//������ ǥ�� �Ҽ� �ִ�
		gsVO[0].total();
		
		// average() �޼��带 ȣ���ϸ�
		//������ ����� ����� �Ŀ�
		//�ڽ��� average ��������� ���� ������ �д�
		//average ������ ���� ������
		//����� ǥ�� �Ҽ� �ִ�
		gsVO[0].average();
		
		gsVO[1].strNum = "002";
		gsVO[1].intKor = 59;
		gsVO[1].intEng = 87;
		gsVO[1].intMath = 84;
		gsVO[1].total();
		gsVO[1].average();
		
		gsVO[2].strNum = "003";
		gsVO[2].intKor = 93;
		gsVO[2].intEng = 58;
		gsVO[2].intMath = 17;
		gsVO[2].total();
		gsVO[2].average();
		
		gsVO[3].strNum = "004";
		gsVO[3].intKor = 9;
		gsVO[3].intEng = 85;
		gsVO[3].intMath = 7;
		gsVO[3].total();
		gsVO[3].average();
		
		
		System.out.println("==================================================");
		System.out.println("�����϶�ǥ");
		System.out.println("--------------------------------------------------");
		System.out.println("�й�\t����\t����\t����\t����\t���");
		System.out.println("--------------------------------------------------");
		for(int i = 0 ; i < gsVO.length ; i++) {
			System.out.print(gsVO[i].strNum + "\t");
			System.out.printf("%3d\t",gsVO[i].intKor);
			System.out.printf("%3d\t",gsVO[i].intEng);
			System.out.printf("%3d\t",gsVO[i].intMath);
			System.out.printf("%3d\t",gsVO[i].total);
			System.out.printf("%5.2f\n",gsVO[i].average);
		}
		System.out.println("==================================================");
		
	}

}
