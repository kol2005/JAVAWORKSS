package com.biz.grade;

import com.biz.grade.domain.StudentVO;
import com.biz.grade.service.StudentServiceV1;

public class StudentEx_02 {

	public static void main(String[] args) {
		
		StudentServiceV1 ss = new StudentServiceV1();
		String stdFileName = "src/com/biz/grade/�л����.txt";
		
		try {
			ss.read(stdFileName);
			StudentVO stdVO = ss.getStudent("A001");
			if(stdVO != null) {
				System.out.println(stdVO.toString());
			}
			//ss ��ü�� getStudent() �޼��带 �����ϰ�
			// �� ���(stdVO)dp toString() �޼��带 �����϶�
			// class �� chainning �ڵ�
			System.out.println(ss.getStudent("A002").toString());
			
			// stdVO ��ü�� �ް�
			// stdVO �� toString() method �� �����ϴ� �ڵ带
			stdVO = ss.getStudent("A010");
			System.out.println(stdVO.toString());
			// class channing �� �̿��ؼ� ���ٷ� ǥ��
			System.out.println(ss.getStudent("A010").toString());
			
			// A020 �ڵ尡 ������ null ���� ǥ��
			System.out.println(ss.getStudent("A020"));
			// �ش� key ���� ������(StudentVO)�� ���� ���
			// null �̶�� ǥ�ð� �ǰų�,
			// exception �� �߻��� �� �ֱ� ������
			// �̸� ���� ���������� �˻��Ͽ�
			// �׿� ���� ������ ó���� �����Ѵ�
			stdVO = ss.getStudent("A020");
			if(stdVO != null) {
				System.out.println(stdVO.toString());
			}else {
				System.out.println("A020 �л� ����!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
