package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_05 {

	public static void main(String[] args) {
		
		//Scanner Ŭ������ ��ü�� ����
		//new Scanner() �����ڿ��� System.in �� ����
		//������ ����(Dependency Inject)��� �Ѵ�
		Scanner scanner = new Scanner(System.in);
		
		String[] list = new String[3];
		
		String strList = "";
		
		for(int i = 0 ; i < 3 ; i++) {
		System.out.println("==================");
		System.out.println((i+1)+"�� �л�");
		System.out.print("���� >>");
		String strKor = scanner.nextLine();
		
		System.out.print("���� >>");
		String strEng = scanner.nextLine();
		
		System.out.print("���� >>");
		String strMath = scanner.nextLine();
		
		strList += (i+1) + "\t";
		strList += (strKor) + "\t";
		strList += (strEng) + "\t";
		strList += (strMath) + "\n";
		
	}
		
		System.out.println("====================");
		System.out.println("����ǥ");
		System.out.println("--------------------");
		System.out.println("�й�/t����/t����/t����");
		System.out.println(strList);
		System.out.println("====================");
		
		
	}

}
