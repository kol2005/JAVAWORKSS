package com.biz.lombok.exec;

import java.util.List;
import java.util.Scanner;

import com.biz.lombok.domain.StudentVO;
import com.biz.lombok.service.StudentServiceV1;
import com.biz.lombok.service.StudentViewServiceV1;
import com.biz.lombok.service.StudentViewServiceV2;

/*
 * �л�����.txt ������ �о
 * 1. ��� �л��� ����Ʈ�� �ֿܼ� ���̱�
 * 2. �̸��� �Է¹޾� �ش��ϴ� �л� ����Ʈ�� �ֿܼ� ���̱�
 * 3. �г��� �Է¹޾� �ش��ϴ� �г��� �л��鸸 �ֿܼ� ���̱�
 * 4. �ΰ��� ������ �Է¹޾� �ش� ������ 
 * 		�г⿡ �ش��ϴ� �л��鸸 �ֿܼ� ���̱� 
 */
public class StudentEx_02 {

	public static void main(String[] args) {
		
		StudentServiceV1 sRead = new StudentServiceV1();
		StudentViewServiceV1 sView = new StudentViewServiceV2();
		String strName = "src/com/biz/lombok/�л�����.txt";
		Scanner scanner = new Scanner(System.in);
		
		try {
			sRead.readStudent(strName);
			List<StudentVO> stdList = sRead.getStdList();
			sView.setStdList(stdList);
			sView.view();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			System.out.println("=========");
			System.out.println("�л������˻�");
			System.out.println("========");
			System.out.println("1.�̸� 2.�г� 3.�г���� 0.����");
			System.out.println("-------------------");
			System.out.print("����>>");
			String strn = scanner.nextLine();
			int intM = Integer.valueOf(strn);
			if(intM == 0)break;
			if(intM == 1) {
				System.out.print("����>>");
			}
		}
	}

}
