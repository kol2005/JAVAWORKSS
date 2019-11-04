package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankServiceV2;

public class BankExec_04 {

	public static void main(String[] args) {
		
		BankServiceV2 bs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		//계좌번호
		String strAccNum = "0001";
		// balance : 잔고(예금잔고)
		int intBalance = 100000;
		
		// 계좌번호가 0001 이고, 잔고가 1000000 인 새로운 계좌 인스턴스를 만들어라
		bs = new BankServiceV2(strAccNum,intBalance);
		
		while(true) {
		
		System.out.println("===========================================");
		System.out.println("광한루 은행");
		System.out.println("===========================================");
		System.out.println("1.조회 2.입금 3.출금 0.종료");
		System.out.println("-------------------------------------------");
		System.out.print("선택>>");
		String strMenu = scanner.nextLine();
		int intMenu = Integer.valueOf(strMenu);
		
		if(intMenu == 0) {
			System.out.println("업무종료");
			break;
		}
		/*
		 * Java 에서는
		 * switch(문자열, 숫자, 문자...) 가능
		 * 하지만 문자열일 경우 약간의 문제 발생 가능성 있음
		 */
		switch (intMenu) {
		case 1:// label, goto 명령을 사용할때 쓰는 키워드
			System.out.println("계좌조회");
			break;
		case 2:
			System.out.println("입금처리");
			break;
		case 3:
			System.out.println("출금처리");
			break;

		
		
		}
			
		}
		

	}

}
