package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_03 {

	/*
	 * StudentVO Ŭ������ ����Ͽ�
	 * �л� 10���� �Ż������� �޸𸮿� �����ϰ�
	 *  ==> ��. StudentVO�� ��ü�� 10�� ����
	 * �л� ������ �л� ����Ʈ�� Ȯ���ϰ� �ʹ�
	 * 1. �л�Ŭ������ ��ü�� �����ϴ� ��ɹ��� 10�� ����
	 * 2. �迭�� �̿��ϴ� ���
	 */
	public static void main(String[] args) {
		
		//************************
		// �迭�� ����
		//------------------------
		//StudentVO[] : ���ݺ��� �迭�� �����ϰڴ�.
		//new StudentVO[10] : StudentVO Ŭ������ 10�� �����Ͽ� ����Ҽ� �ֵ���
		//					�޸𸮸� �غ��϶�
		// new StudentVO() ������ �޼���ʹ� �ٸ� �������
		StudentVO[] stVO = new StudentVO[10];
		
		//����� ��ü�� ����Ҽ� �ֵ��� �ʱ�ȭ�۾��� ����
		/*
		 * ����� �迭�� ��ҿ� ����(�б�, ����)�� �Ϸ���
		 * ����� index�� �������� �����ؾ� �Ѵ�
		 * 
		 * stVO[0] : stVO �迭�� 0�� ��ġ�� �ִ� ��ҿ�
		 * 			�����ϰڴٶ�� ����
		 */
		
		/*
		 * �� �������� stVO �迭�� 10���� �޸� ��Ҹ�
		 * ����ϰڴ� ��� ���� �� �����̴�
		 * �� ��Ȳ���� stVO�� �� ��������� ���� (�б�, ����) ��
		 * �õ��ϸ� ���� stVO ��ҵ��� �ʱ�ȭ�� ���� �ʾ�
		 * exception(�������, run time error)�� �߻��Ѵ�.
		 */
		stVO[0].strNum = "001";
		stVO[0].strName = "ȫ�浿";
		
		System.out.println(stVO[0].strName);
				
		//stVO[1] = new StudentVO();
		
		//stVO[2]
		

	}

}
