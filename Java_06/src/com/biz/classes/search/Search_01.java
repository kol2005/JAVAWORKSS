package com.biz.classes.search;

import java.util.Scanner;

public class Search_01 {

	/*
	 * ������ ���ڿ��߿� ���Ե� 1���� ���ڿ��� ã�� Ŭ����
	 * 
	 * 1. ���� ���ڿ��� �����ϰ�
	 * 2. Ű���忡�� 1���� ���ڿ��� �Է¹ް� 
	 * 3. �ش��ϴ� ���ڿ��� ���° ��ġ�� �ֳ�?
	 */
	
	//������� ������ ����� ������
	//���� Ŭ����(Search_02)�� �ƴѰ�����
	//���� ����(�б�, ����)�� �����ϴ�
	//��, public Ű���尡 ���ԵǾ� �־�� �Ѵ�
	public String strNation ;
	public void main() {
		//strNation ������ ������� �������� �̵�!!
		//String strNation = "Republic of Korea";
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
			if(strAt.equalsIgnoreCase(strS))break;
				
		}
		/*
		 * ���� ���ڿ��� ���Ե� ���ڰ� ������
		 * index < 17 
		 * ���� ���ڿ��� ���Ե� ���ڰ� ������
		 * index == 17
		 */
		System.out.println(index);
		
		//index�� �˻��ϴ� ������ �ڵ�
		if(index < intLength)
			System.out.println(index + " ��° ���� ã��");
		else
			System.out.println("���� ���ڿ�!!!");
		
		//���� �� ������ �ڵ�
		if(index == intLength)
			System.out.println("���� ���ڿ�!!!");
		else
			System.out.println(index + " ��° ���� ã��");
		
		

	}

}
