package com.biz.classes;

import com.biz.classes.grade.GradeVO;
import com.biz.classes.grade.StaticGrade;

public class StartMain {

	public static void main(String[] args) {
		
		/*
		 * static class��
		 * ����, ����, �ʱ�ȭ ������ �ڵ����� �ʰ�
		 * ���� 'Ŭ����.~~~' ������� �����Ҽ� �ִ�.
		 */
		StaticGrade.strNum = "001";
		StaticGrade.strName = "ȫ�浿";
		
		StaticGrade.intKor = 90;
		StaticGrade.intEng = 88;
		StaticGrade.intMath = 77;
		
		/*
		 * non static class��
		 * �ݵ�� ����(�б�, ����)���� 
		 * �븮�ڸ� ����, ����, �ʱ�ȭ ������ �ڵ��ؾ� �Ѵ�
		 * �븮�� : ��ü, Object, instance ��� �Ѵ�
		 * �븮�ڴ� Ŭ������ ����ǰ�̴�
		 * 
		 * �븮�ڰ� ����, ����, �ʱ�ȭ �Ǹ�
		 * �븮�ڴ� �Ϲ� ������ ���� ������� ���ȴ�.
		 */
		GradeVO grade01 = new GradeVO();
		grade01.strNum = "002";
		grade01.strName = "������";
		
		grade01.intKor = 99;
		grade01.intEng = 99;
		grade01.intMath = 99;
		
		StaticGrade.sum();
		
		
		
		
		
		
		
		
		/*
		 * grade01�� ����������
		 * GradeNew�� ������(ǰ)������
		 * ���� ������ �޸� ��ҿ� �����ϹǷ�
		 * grade01���� ����, ������ ���� ��ġ�� �ʴ´�
		 */
		GradeVO grade02 = new GradeVO();
		GradeVO grade03 = new GradeVO();
		GradeVO grade04 = new GradeVO();
		GradeVO grade05 = new GradeVO();
		
		grade01.sum();
		
		

	}

}
