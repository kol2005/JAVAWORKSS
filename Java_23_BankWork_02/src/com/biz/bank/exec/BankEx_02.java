package com.biz.bank.exec;

import java.util.Scanner;

import com.biz.bank.service.BankService;
import com.biz.bank.service.BankServiceImpV2;

public class BankEx_02 {

	public static void main(String[] args) {
		
		BankService bs = new BankServiceImpV2();
		Scanner scanner = new Scanner(System.in);
		String bookFile = "src/com/biz/bank/활빈당은행장고원장.txt";
		//((BankServiceImpV1)bs).bookFile=bookFile;
		
		try {
			/*
			 * 파일에서 원장을 읽은 후 업무를 진행하는 과정에서
			 * 만약 어떤 원인으로 app 이 중단되면
			 * 그동안 수행한 입, 출금내역이 메모리에만 있기 때문에
			 * 모두 사라져 버리고
			 * 
			 * app 을 새로 시작하면 처음으로 
			 * 		다시 데이터가 초기화 되어 버린다
			 * 
			 * 그래서, 입출금이 완료되는 순간
			 * 		원장정보를 저장하여 언제든지 app을 새로 시작하면
			 * 		이전 업무 수행 다음부터 진행할 수 있도록 할 것이다
			 * 
			 * 그리고, 반복문내에서 업무 선택 전에
			 * 		원장을 읽어 리스트를 생성하는 일을 먼저 수행한다
			 */
			while(true) {
				
				// 계좌원장에서 데이터 읽어오기
				bs.readBook(bookFile);
				
				System.out.println("=================================================");
				System.out.println("활빈당 종합 은행 v1");
				System.out.println("=================================================");
				System.out.println("1.원장리스트 2.계좌조회 3.입금 4.출금 0.종료");
				System.out.println("-------------------------------------------------");
				System.out.print("입력>>");
				String strMenu = scanner.nextLine();
				int intMenu = Integer.valueOf(strMenu);
				if(intMenu == 0)break;
				else if(intMenu == 1) {
					//bs.bookList();
				}else if(intMenu == 2) {
					bs.viewAcc();
				}else if(intMenu == 3) {
					// 입금처리 후에 원장저장을 수행하도록 해도 되지만
					// 코드를 작성하는 중에 원장저장 method 호출을
					// 빼먹을 수도 있기 때문에 input() method 에서
					// bookWriter() method 를 호출하도록 코드를 작성
					bs.input();
					//bs.bookWriter(bookFile);
				}else if(intMenu == 4) {
					bs.output();
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	

	}

}
