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
		System.out.print("이름 >>");
		String strName = scan.nextLine();
		System.out.print("주소 >>");
		String strAddr = scan.nextLine();
		System.out.print("전화번호 >>");
		String strTel = scan.nextLine();
		System.out.print("학과 >>");
		String strDept = scan.nextLine();
		System.out.print("학년 >>");
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
		
		System.out.print("이름 >>");
		String strName = scan.nextLine();
		System.out.print("주소 >>");
		String strAddr = scan.nextLine();
		System.out.print("전화번호 >>");
		String strTel = scan.nextLine();
		System.out.print("학과 >>");
		String strDept = scan.nextLine();
		System.out.print("학년 >>");
		String strGrade = scan.nextLine();

		int intGrade = 0;
		try {
			intGrade = Integer.valueOf(strGrade);
		} catch (Exception e) {
			System.out.println("학년은 숫자만 입력하세요");
			
			while(true) {
				System.out.println("학년을 다시 입력(종료 : -1) > ");
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
		System.out.println("학번\t이름\t주소\t전화번호\t학과\t학년");
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
