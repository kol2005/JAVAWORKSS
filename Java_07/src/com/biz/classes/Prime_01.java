package com.biz.classes;

import java.util.Scanner;

public class Prime_01 {

	/*
	 * ���(num)�� �Ҽ����� �ƴ����� �˾ƺ���
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� >> ");
		String strNum = scanner.nextLine();
		
		int num = Integer.valueOf(strNum);
		
		int index;
		for(index = 2 ; index < num ; index++) {
			if(num % index == 0)break;
		}
		//index ??
		if(index >= num) {
			System.out.println(num + "�� �Ҽ�(Prime)�̴�!!");
		}else { System.out.println(num + "�� �Ҽ��� �ƴϴ�!!");
		
		}
		
		

	}

}
