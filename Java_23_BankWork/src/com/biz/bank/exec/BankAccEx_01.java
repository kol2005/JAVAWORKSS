package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankAccServiceV1;

public class BankAccEx_01 {

	public static void main(String[] args) {
		
		BankAccServiceV1 bs = new BankAccServiceV1("0001",10000);
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====================================");
			System.out.println("�������� ������ v1.0");
			System.out.println("=====================================");
			System.out.println("1.��ȸ 2.�Ա� 3.��� 0.����");
			System.out.println("-------------------------------------");
			System.out.print("��������>>");
			String strMenu = scanner.nextLine();
			int intMenu = Integer.valueOf(strMenu);
			if(intMenu==0)break;
			else if(intMenu == 1) {
				bs.viewAcc();
			}else if(intMenu == 2) {
				bs.input();
			}else if (intMenu == 3) {
				bs.output();
			}
		}
		System.out.println("���õ� �����߽��ϴ�");

	}

}
