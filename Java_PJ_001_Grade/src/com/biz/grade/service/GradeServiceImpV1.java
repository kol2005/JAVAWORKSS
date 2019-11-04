package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.gradevo.GradeVO;


public class GradeServiceImpV1 implements GradeService {

	
	
	
	List<GradeVO> gradeVO;
	Scanner scan = new Scanner(System.in);

	public GradeServiceImpV1() {
	gradeVO = new ArrayList<GradeVO>();
	
	}
	
	
	@Override
	public void input() {
		
		//
		GradeVO vo = new GradeVO();
		
		//int nSize = gradeVO.size();
		//String strNum = "";
		//for(int i = 0 ; i < nSize ; i ++) {
		//	nSize++;
		//	strNum = nSize+"";
		//}
		

		//String strNum = StrNum;
		//strNum = StrNum;
		//String strNum = ;
		System.out.print("�̸� >>");
		String strName = scan.nextLine();
		System.out.print("�ּ� >>");
		String strAddr = scan.nextLine();
		System.out.print("��ȭ��ȣ >>");
		String strTel = scan.nextLine();
		System.out.print("�а� >>");
		String strDept = scan.nextLine();
		System.out.print("�г� >>");
		String strGrade = scan.nextLine();;
		int intGrade = Integer.valueOf(strGrade);
		
		//vo.setStrNum(strNum);
		vo.setStrName(strName);
		vo.setStrAddr(strAddr);
		vo.setStrTel(strTel);
		vo.setStrDept(strDept);
		vo.setIntGrade(intGrade);
		
		gradeVO.add(vo);
		
	}

	@Override
	public void input(int count) {
		for(int i = 0 ; i < count ; i++) {
			String strNum = String.format("%04d", (i+1));
			this.input(strNum);
		}
		

	}
	
	public void input(String strNum) {
		GradeVO vo = new GradeVO();
		vo.setStrNum(strNum);
		
		System.out.print("�̸� >>");
		String strName = scan.nextLine();
		System.out.print("�ּ� >>");
		String strAddr = scan.nextLine();
		System.out.print("��ȭ��ȣ >>");
		String strTel = scan.nextLine();
		System.out.print("�а� >>");
		String strDept = scan.nextLine();
		System.out.print("�г� >>");
		String strGrade = scan.nextLine();

		int intGrade = 0;
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("�г��� ���ڸ� �Է��ϼ���");
			
			while(true) {
				System.out.println("�г��� �ٽ� �Է�(���� : -1) > ");
				String s = scan.nextLine();
				try {
					intGrade = Integer.valueOf(s);
					if(intGrade == -1)break;
					break;
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		//int intGrade = Integer.valueOf(strGrade);
		}
		
		//vo.setStrNum(strNum);
		vo.setStrName(strName);
		vo.setStrAddr(strAddr);
		vo.setStrTel(strTel);
		vo.setStrDept(strDept);
		vo.setIntGrade(intGrade);
		
		gradeVO.add(vo);
		
			
		
}
	@Override
	public void list() {
		System.out.println("=================================");
		System.out.println("�й�\t�̸�\t�ּ�\t��ȭ��ȣ\t�а�\t�г�");
		System.out.println("=================================");
		int nSize = gradeVO.size();
		for(GradeVO vo : gradeVO) {
		//for(int i = 0 ; i < nSize ; i++) {
			System.out.print(vo.getStrNum());
			System.out.print("\t"+vo.getStrName());
			System.out.print("\t"+vo.getStrAddr());
			System.out.print("\t"+vo.getStrTel());
			System.out.print("\t"+vo.getStrDept());
			System.out.println("\t"+vo.getIntGrade());
			
		}

	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}


}
