package com.biz.classes.string;

import java.util.Scanner;

public class String_08 {

	/*
	 * strNation �� ����� ���ڿ��� �����ְ�
	 * �Ѱ��� ���ڸ� Ű����� �Է¹ް�
	 * �Է��� ���ڰ� ���° ��ġ�� �ִ����� ã�ƺ���
	 */
	public static void main(String[] args) {
		
		// Ű���忡�� �Է��� ���ڿ��� �������� ���� ����
		Scanner scanner = new Scanner(System.in);
		String strNation = "Republic of Korea";
		int intLength = strNation.length();
		
		System.out.println("��ü ���ڿ� : " + strNation);
		System.out.println("ã�� ���ڸ� �Է��ϼ���");
		System.out.print("���� >> ");
		String strSearch = scanner.nextLine();
		System.out.println("�Է��� ���� : " + strSearch);
		
		//���ڿ��� ������ŭ ã�⸦ �ݺ��ϰڴ�
		for(int i = 0 ; i < intLength ; i++) {
			//1. strNation ���ڿ����� 0������ intLength -1 ����
			// �ѱ��ھ� ����
			
			String strAt = strNation.substring(i,i+1);
			
			//2.����� 1���� ���ڿ��� Ű���忡�� �Է��� ���ڿ���
			// ���ϱ�(������?)
			if (strAt.equalsIgnoreCase(strSearch))
				System.out.println(i + " ��° ��ġ���� ã��");
			
			//if(strNation.substring(i, i+1).equals(strSearch))// ���ۺ�.���� �Է��Ѱ� = �Է��Ѱ�
				//System.out.println("�Էµ� ���� " + i + "��°�� ����");
			
		}
		
		
		

	}

}
