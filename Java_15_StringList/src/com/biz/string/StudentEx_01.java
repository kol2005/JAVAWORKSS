package com.biz.string;

import com.biz.string.domain.StudenVO;
import com.biz.string.StringService;
import com.biz.string.service.StudentServiceV1;

public class StudentEx_01 {

	public static void main(String[] args) {
		
		StringService stService = (StringService) new StudentServiceV1();
		
		stService.input();
		stService.list();
		
		// StudentServiceV1 Ŭ������
		// StringService �������̽��� ���ǵ��� ����
		// search() method �� �ִµ�
		// �� search() method �� ����ϱ� ���ؼ�
		// stService �� ��� studentServiceV1 �� ��ó��
		// �ٲٴ� ��
		StudenVO stdVO = ((StudentServiceV1)stService).search("00002");
		
		// search() method �� ȣ���ϸ鼭 �й� 00001 �� �Ű�����
		// �����Ͽ���
		
		// ���� �ش� �й��� �����Ͱ� ������
		// stdVO ���� �л������� ������� ���̴�
		
		//Ȥ�� �����͸� ��ã������
		//stdVO ���� null ���� ������� ���̴�
		
		if(stdVO == null) {
			System.out.println("ã�� ������ ����!!");
		} else {
			System.out.println(stdVO.toString());
		}
	}

}
