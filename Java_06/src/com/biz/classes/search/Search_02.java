package com.biz.classes.search;

import java.util.Scanner;

public class Search_02 {

	/*
	 * ������ ���ڿ��߿� ���Ե� 1���� ���ڿ��� ã�� Ŭ����
	 * 
	 * 1. ���� ���ڿ��� �����ϰ�
	 * 2. Ű���忡�� 1���� ���ڿ��� �Է¹ް� 
	 * 3. �ش��ϴ� ���ڿ��� ���° ��ġ�� �ֳ�?
	 */
	
	public static void main(String[] args) {
	
		Search_01 ss = new Search_01();
		Scanner scanner = new Scanner(System.in);
		
		//Search_01 Ŭ������ ��������� strNation��
		//�ʿ��� ���ڿ��� ����
		ss.strNation = "UNITED NATION";
		
		
		//Search_01 ss = new Search_01();
		
		/*
		 * ���ѹݺ����� ����ؼ� ����Ǵ� �ڵ��ε�
		 * �ʿ��Ҷ� �����Ҽ� �ִ� �ڵ带 �ۼ�
		 */
		
		//for �� �Ϲ������� ���۰��� �ִ밪�� ������ ���
		//����ϰ� � ���ǿ� ���� ����, �Ǵ� ���� �ݺ��� �����Ҷ���
		//while() ��ɹ��� ����Ѵ�
		
		//for (;;) {
		while(3==3) {
		
		ss.main();
		
		System.out.println("����Ϸ��� �ƹ�Ű�� ��������");
		System.out.println("�����Ϸ��� END�� �Է��ϼ���");
		String anyKey = scanner.nextLine();
		if(anyKey.equals("END"))break;
		}
		System.out.println("GAME OVER!!");
		
		}
		
		
		
		

	}


