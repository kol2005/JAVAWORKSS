package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankAccService;
import com.biz.bank.service.BankAccServiceV2;

public class BankAccEx_02 {

	public static void main(String[] args) {
		
		BankAccService bs = new BankAccServiceV2();
		Scanner scanner = new Scanner(System.in);
		String strBookFile = "src/com/biz/bank/���¿���.txt";
		
		while(true) {
			System.out.println("==============================================");
			System.out.println("�ѱ����� ������ �ý��� v2");
			System.out.println("==============================================");
			System.out.println("1.��ȸ 2.�Ա� 3.��� 4.��ü��ȸ 0.����");
			System.out.println("----------------------------------------------");
			System.out.print("��������>>");
			String strMenu = scanner.nextLine();
			int intMenu = Integer.valueOf(strMenu);
				try {
					if(intMenu == 0) {
						//BankAccServiceV2 bs2 = (BankAccServiceV2)bs;
						//bs2.writeAccBook(strBookFile);
						bs.writeAccBook(strBookFile);
						
						//((
						break;
					}
					else if(intMenu == 1)bs.viewAcc();
					else if(intMenu == 2)bs.input();
					else if(intMenu == 3)bs.output();
					else if(intMenu == 4)bs.bankBookList();
				
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		scanner.close();
		System.out.println("��������");
		
	}

}
