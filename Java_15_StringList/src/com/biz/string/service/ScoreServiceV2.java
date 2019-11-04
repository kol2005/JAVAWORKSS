package com.biz.string.service;

import java.util.List;

import com.biz.string.domain.ScoreVO;
import com.biz.string.domain.StudenVO;

/*
 * ScoreServiceV1 �� ������������ ����ϴ� Service�̴�
 * ���⿡ ���������� ����ϸ鼭
 * �й������� ��������
 * �л�����(�̸�)�� ���� �����ִ� list() method �� �� ���� ����
 * 
 * ============================================
 * �й� �̸� ���� ���� ���� ���� ���
 * ============================================
 * 
 */
public class ScoreServiceV2 extends ScoreServiceV1 {

	// ����������
	// public : ������ ������ �� �ִ�
	// private : class scope, ���� class ������ ���ٰ���
	// protected : ���� class �� ��ӹ��� class ������ ���ٰ���
	// ������� : package scope, ���� package �������� public ó�� �������ϰ�
	//				�ٸ� package������ private ó�� ������ �Ѵ�
	
	// Java ���Ͽ�����
	// Ư���� ��찡 �ƴϸ�
	// ����������� private �̳� protected �� �����ϵ���
	// ����
	
	// List<ScoreVO> scList protected ���·�
	// ��ӹ޾� �����ϰ� �ִ�
	private List<StudenVO> stdList = null;
	
	
	@Override
	public void list() {
		System.out.println("=====================================================");
		System.out.println("�����϶�ǥ");
		System.out.println("=====================================================");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("-----------------------------------------------------");
		//scList �� ����, �ʱ�ȭ �κ��� ������ ������
		//ScoreServiceV1 ���� protected ���·� ��ӹ޾ұ� ������
		// �����Ͽ� ���� ���� �� �ִ�
		for(ScoreVO scVO : scList) {
			// �й��� scVO �� ����
			String strNum = scVO.getStrNum();
			//�й����� �л������� ��ȸ
			StudenVO stVO = this.searchStd(strNum);
			
			String strName;
			String strAddr;
			String strTel;
			if(stVO==null) {
				strName = "(����)";
				strAddr = "(����)";
				strTel = "(����)";
			}else {
				strName = stVO.getStrName();
				strAddr = stVO.getStrAddr();
				strTel = stVO.getStrTel();
			}
			System.out.print(scVO.getStrNum()+"\t");
			System.out.print(strName + "\t");
			System.out.printf("%3d\t",scVO.getIntKor());
			System.out.printf("%3d\t",scVO.getIntEng());
			System.out.printf("%3d\t",scVO.getIntMath());
			System.out.printf("%3d\t",scVO.getIntTotal());
			System.out.printf("%3d\n",scVO.getIntAvg());
			
		}
		System.out.println("=========================================================");
		
	}

	// ScoreServiceV2 �� ��������� ����� stdList ��
	// StudentService.. ���� ���� ���õ� ����Ʈ �̴�
	// StudentService ���� ���õ� ����Ʈ��
	// ScoreService ���� ����ϱ� ���ؼ�
	// main() method ���� StudentService �� ����
	//		stdList �� getter �Ͽ�
	//		setstdList() �޼��带 ����
	//		ScoreService �� �����Ѵ�
	public void setStdList(List<StudenVO> stdList) {
		this.stdList = stdList;
	}
	
	
	// �й��� �Ű������� �ް�,
	// stdList �� �ش� �й��� �л������� �ִ��� ã�Ƽ�
	// StudenVO �� �������ִ� method
	private StudenVO searchStd(String strNum) {
		
		for(StudenVO stVO : stdList) {
			if(stVO.getStrNum().equals(strNum)) {
				return stVO;
			}
		}
		return null;
		
	}
	
}
