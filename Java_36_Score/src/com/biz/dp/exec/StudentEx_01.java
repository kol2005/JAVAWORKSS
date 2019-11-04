package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.StudentVO;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		/*
		 * �ڹ� ��������(Java Beans Pattern : �ڹ��� �������� �ڵ�)
		 */
		StudentVO stdVO = new StudentVO();
		stdVO.setSt_num("001");
		stdVO.setSt_name("ȫ�浿");
		stdVO.setSt_tel("010-1111-2222");
		stdVO.setSt_addr("����Ư����");
		stdVO.setSt_grade(3);
		stdList.add(stdVO);
		
		// setter�� �̿��ؼ� �ʵ忡 ���� �����ϰ�
		// List�� �߰�
		stdVO = new StudentVO();
		stdVO.setSt_num("002");
		stdVO.setSt_name("�̸���");
		stdVO.setSt_tel("010-1111-2222");
		stdVO.setSt_addr("����Ư����");
		stdVO.setSt_grade(3);
		stdList.add(stdVO);
		
		// �����ڸ� �̿��ؼ� �ʵ尪�� �ʱ�ȭ �ϸ鼭 ��ü�� �����ϰ�
		// ���� ��ü�� ��Ҵٰ� List�� �߰�
		stdVO = new StudentVO("003","������","010-2222-2222","������",3,"005");
		stdList.add(stdVO);
		
		// ������ ������ü�� ������ �ʰ� 
		// add() method�� ���� ������ �ڵ带 �ۼ��ؼ�
		// List�� �߰�
		stdList.add(new StudentVO("004","�Ӳ���","010-3333-2222","������",3,"005"));
		stdList.add(new StudentVO("004","�Ӳ���","010-3333-2222","������",3,"005"));
		stdList.add(new StudentVO("004","�Ӳ���","010-3333-2222","������",3,"005"));
		stdList.add(new StudentVO("004","�Ӳ���","010-3333-2222","������",3,"005"));
		stdList.add(new StudentVO("004","�Ӳ���","010-3333-2222","������",3,"005"));
		
		// �����ڸ� �̿��ϴ� ��ü����
		// 1. �������� �Ű������� ���� ���� ��Ȯ�� �ν��ؾ߸�
		//		������ ���� ���� �߰��Ҽ� �ִ�
		// 2. ���� ���� �߰����� �ʾƵ� �� �ʵ� ����
		//		�ǹ������� ��� �߰��ؾ��ϴ� ������ �ִ�
		

	}

}
