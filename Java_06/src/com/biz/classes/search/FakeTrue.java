package com.biz.classes.search;

import java.util.Scanner;

public class FakeTrue {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		Scanner scanner = new Scanner(System.in);
		int intLength = strNation.length();
		
		//���ڿ� ����
		System.out.println(strNation);
		System.out.println("1���� ���ڿ��� �Է��ϼ���");
		System.out.print("���� >>");
		
		String strS = scanner.nextLine();
		
		int index = 0;
		for(index = 0 ; index < intLength ; index++) {
			String strAt = strNation.substring(index, index+1);
			if(strAt.equalsIgnoreCase(strS))
				System.out.println(index + " ��°���� ã��");
			else
				System.out.println("�� ã��");
			break;
				
		}
	}

}
