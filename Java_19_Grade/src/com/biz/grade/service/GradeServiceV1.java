package com.biz.grade.service;

import java.util.Map;
import java.util.Set;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.utill.LineMake;
/*
 * ===========================================================
 * �й� �̸�	����	����	����	����	���	����
 * ===========================================================
 * 
 * ===========================================================
 */
public class GradeServiceV1 {
	
	Map<String, StudentVO> stdList;
	Map<String, ScoreVO> scList;
	
	public GradeServiceV1() {
		//�⺻������
	}
	public GradeServiceV1(Map<String,ScoreVO> scList) {
		// scList �� ȣ���� ������ ���� �޴� ������
		this.scList = scList;
	}
	public GradeServiceV1(Map<String,ScoreVO> scList,Map<String,StudentVO> stdList) {
		// scList �� stdList �� ȣ���� ������ ���� �޴� ������
		this.scList = scList;
		this.stdList = stdList;
	}
	
	public void setScList(Map<String,ScoreVO> scList) {
		this.scList = scList;
	}
	public void setStdList(Map<String, StudentVO> stdList) {
		this.stdList = stdList;
	}
	
	public void list() {
		
		int length = 80;
		
		 System.out.println(LineMake.make("=", length));
		 System.out.println("�����϶�ǥ");
		 System.out.println(LineMake.make("=", length));
		 System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����\t��ȭ��ȣ"); 
		 System.out.println(LineMake.make("-", length));
		 
		 Set<String> keys = scList.keySet();
		 for(String key : keys) {
			 ScoreVO scVO = scList.get(key);
			 /*
			  * scVO �� �й�(Num) �� key ������ �Ͽ�
			  * stdList �� ���� �л����� (StudentVO) �� �����Ͽ�
			  * �л������� �̸�(Name)�κ��� List �� ���� ǥ��
			  */
			 StudentVO stVO = stdList.get(scVO.getNum());
			 
			 System.out.print(scVO.getNum()+"\t");
			 System.out.print(stVO.getName()+"\t");
			 System.out.printf("%3d\t",scVO.getKorScore());
			 System.out.printf("%3d\t",scVO.getEngScore());
			 System.out.printf("%3d\t",scVO.getMathScore());
			 System.out.printf("%3d\t",scVO.getSumScore());
			 System.out.printf("%3.1f\t",scVO.getAverage());
			 System.out.printf("%3d\t",scVO.getRank());
			 System.out.println(stVO.getTel());
			 
			 
		 }
		 System.out.println(LineMake.make("=", length));
		 
	}
}
