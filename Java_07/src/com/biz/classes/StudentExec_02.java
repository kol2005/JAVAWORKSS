package com.biz.classes;

import com.biz.classes.student.StudentVO;

public class StudentExec_02 {

	public static void main(String[] args) {
		
		StudentVO stVO = new StudentVO();
		
		stVO.strNum = "001";
		stVO.strName = "ȫ�浿";
		
		stVO.intYear = 2012;
		stVO.strDept = "����";
		
		//view() �޼��带 ȣ���Ҷ�
		//(����) �⵵�� �����ϸ�
		//�⵵�� ���� ���̸� �ڵ� ����ؼ� �����ָ� ���ڴ�
		//
		stVO.view(2030);
		

	}

}
