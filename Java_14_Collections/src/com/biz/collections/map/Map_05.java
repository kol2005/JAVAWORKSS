package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.biz.collections.model.GradeVO;

public class Map_05 {

	public static void main(String[] args) {
		
		/*
		 * Map ������ ����
		 * �����͸� �����Ҷ� key, value �� ��(pair) ���� put �� �ϸ�
		 * �����͸� ��ȸ(ã��)�Ҷ� key ��������
		 * ������ ���� ã�� �� �ִ�
		 * �����Ͱ� � ��ġ(index)�� �ִ��� ����
		 * �������� �˻��ϴ� ����˻� ����� �����Ѵ�
		 */
		Map<String,GradeVO> grades = new HashMap<String,GradeVO>();
		
		GradeVO vo = new GradeVO();
		//vo = new GradeVO();
		vo.setStrName("ȫ�浿");
		vo.setIntKor(90);
		vo.setIntEng(95);
		vo.setIntMath(77);
		
		grades.put("ȫ�浿", vo);
		
		vo = new GradeVO();
		vo.setStrName("�̸���");
		vo.setIntKor(50);
		vo.setIntEng(50);
		vo.setIntMath(70);
		
		grades.put("�̸���", vo);
		
		vo = new GradeVO();
		vo.setStrName("������");
		vo.setIntKor(30);
		vo.setIntEng(35);
		vo.setIntMath(37);
		
		grades.put("������", vo);
		
		// Map �� ����� ������ ��ü�� ��ȸ�ϰ��� �Ҷ�
		// �⺻������ Map �� ����� ����Ʈ�� ��ȸ�ϴµ�
		// ������ �κ��� �ִ�
		// �׷��� Ʈ���� ���µ�
		
		// 1. Map �����Ϳ� ����� key�� ���� ���
		//		Set �� ��´�
		// 2. key �� for �ݺ������� ó���Ϸ�
		//		�� �׸��� get(key) �޼��带 ����
		//		���� �о��
		Set<String> gradeKeys = grades.keySet();
		for(String s : gradeKeys) {
			
			GradeVO v = grades.get(s);
			System.out.println(v.toString());
		}

	}

}
