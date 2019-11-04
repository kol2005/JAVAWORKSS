package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.string.StringService;
import com.biz.string.domain.StudenVO;

public class StudentServiceV1 implements StringService {

	List<StudenVO> stdList;
	public StudentServiceV1(){
		stdList = new ArrayList<StudenVO>();
		
	}
	@Override
	
	/*
	 * �л������� ���ڿ����·� ������ �ִ�
	 * students �迭�� �̸� ������ �ΰ�
	 * �迭�� ����� ���ڿ��� split() ���� �����Ͽ�
	 * �� �׸񺰷� �����
	 * 
	 * �л����� ����Ʈ�� ����µ� ����� ��
	 */
	public void input() {
		
		String[] students = new String[]
			
				{
						"ȫ�浿:����Ư����:010-111-:33",
						"������:������:010-222:16",
						"�̸���:�ͻ��:010-333:18"
				};
		// students �迭�� 0��° ��ҿ� ����� ���ڿ���
		// Ŭ��(:)�� �������� �����Ͽ�
		// �迭�� �����϶�
		students[0].split(":");
		// stdArray[0] => "ȫ�浿"
		
		//�й� ������ ���� ����
		int intNum = 1;
		String[] stdArray =students[0].split(":");
		for(String s : students) {
			
			// intNum ���� ���ڿ� �й�����
			// 1�� ����
			StudenVO stdVO = new StudenVO();
			String strNum = String.format("%05d", intNum++);
			
			// students ��Ұ� ��� s ������
			//		Ŭ��(:)���ڿ��� �����Ͽ�
			//		stdArray �迭�� ���
			//		
			stdArray = s.split(":");
			stdVO.setStrNum(strNum);
			
			
			stdVO.setStrName(stdArray[0]);
			stdVO.setStrAddr(stdArray[1]);
			stdVO.setStrTel(stdArray[2]);
			stdVO.setIntAge(Integer.valueOf(stdArray[3]));
			
			stdList.add(stdVO);
			
		}
		
	}

	@Override
	public void list() {
		
		System.out.println("===========================================");
		System.out.println("�л����");
		System.out.println("===========================================");
		System.out.println("�й�\t�̸�\t�ּ�\t��ȭ\t����");
		System.out.println("-------------------------------------------");
		for (StudenVO vo : stdList) {
			System.out.print(vo.getStrNum()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getStrAddr()+"\t");
			System.out.print(vo.getStrTel()+"\t");
			System.out.print(vo.getIntAge()+"\n");
			
		}
		System.out.println("===========================================");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}
	
	//�й����� �л������� ��ȸ�ϴ� method()
	public StudenVO search(String strNum) {
		for(StudenVO stdVO : stdList) {
			if(stdVO.getStrNum().equals(strNum)) {
				System.out.println("ã�Ҵ�");
				return stdVO;
			}
		}
		return null;
	}
	
	public List<StudenVO> getScoreList(){
		return stdList;
		
	}

}
