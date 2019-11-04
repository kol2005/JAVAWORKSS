package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.GradeVO;

public class GradeServiceImp_01 implements GradeService {

	// GradeVO Ŭ������ ����Ʈ�� ����
	private List<GradeVO> gradeList;

	Random rnd;

	public GradeServiceImp_01() {

		// ����Ʈ�� ����Ҽ� �ֵ��� ����
		gradeList = new ArrayList<GradeVO>();
		rnd = new Random();

	}
	
	// GradeVO �� gradeList �� �߰��ϴ� �ڵ�
	// input() method �� ȣ���Ҷ�
	// ������ ����Ʈ ������ �����ָ�
	// ������ size ������ �ް�
	// �� ������ŭ �����ؼ� gradeList �� �߰�
	public void input(int size) {
		
		for(int i = 0 ; i < size ; i++) {
			
			// 1. ������ ����
			String strNum = String.format("%05d", (i+1));
			int intKor = rnd.nextInt(50)+51;
			int intEng = rnd.nextInt(50)+51;
			int intMath = rnd.nextInt(50)+51;
			
			// 2. VO�� �ۼ�
			GradeVO gVO = new GradeVO();
			gVO.strNum = strNum;
			gVO.intKor = intKor;
			gVO.intEng = intEng;
			gVO.intMath = intMath;
			
			// 3. VO �� List �� �߰�
			gradeList.add(gVO);
			
		}
		
	}//input() end
	
	// ������ ����, ���
	public void total() {
		
		int nSize = gradeList.size();
		for(int i = 0 ; i < nSize; i++) {
			
			// gradeList �� i ��°�� ����Ǿ� �ִ�
			// gVO �� intKor ���� �о
			// total ������ ����
			int total = gradeList.get(i).intKor;
			
			// gradeList �� i ��°�� ����Ǿ� �ִ�
			// gVO intEng ���� �о 
			// total �� ����� ���� ���Ͽ�
			// �ٽ� total �� �����϶�
			total += gradeList.get(i).intEng;
			total += gradeList.get(i).intMath;
			
			// gradeList �� i ��°�� ����Ǿ� �ִ�
			// gVO intTotal ���������
			// total ������ ����� ���� �����϶�
			gradeList.get(i).intTotal = total;
			
			// gradeList �� i ��°�� ����Ǿ� �ִ�
			// gVO intAvg ���������
			// total / 3 ���� ����Ͽ� �����϶�
			gradeList.get(i).intAvg = total/3;
			
		}
		
		
	}
	
	public void view() {
		System.out.println("=============================================");
		System.out.println("���� �϶�ǥ");
		System.out.println("=============================================");
		System.out.println("�й�\t����\t����\t����\t����\t���\t����\t");
		System.out.println("---------------------------------------------");
		for(GradeVO vo : gradeList) {
			System.out.printf("%5s\t",vo.strNum);
			System.out.printf("%3d\t",vo.intKor);
			System.out.printf("%3d\t",vo.intEng);
			System.out.printf("%3d\t",vo.intMath);
			System.out.printf("%3d\t",vo.intTotal);
			System.out.printf("%3d\t",vo.intAvg);
			System.out.printf("%3d\n",vo.intRank);
		}
		System.out.println("=============================================");
		
	}

}
