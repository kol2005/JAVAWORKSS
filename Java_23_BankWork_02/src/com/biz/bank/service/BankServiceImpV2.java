package com.biz.bank.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.biz.bank.domain.BankInfo;

public class BankServiceImpV2 extends BankServiceImpV1 {
	
	@Override
	public void output() throws Exception {
		// TODO 출금처리
		
		this.viewAcc();// 계좌조회
		
		if(bookVO == null)return;
		
		System.out.print("출금액>>");
		String strOutput = scanner.nextLine();//키보드에서 출금액 입력
		int intOutput = Integer.valueOf(strOutput);//입력받은 출금액 숫자로 변환
		int intBalance = bookVO.getBalance();//VO에서 잔액 받아오기
		if(intBalance < intOutput) {//잔액보다 출금액이 많으면 되돌아가기
			System.out.println("잔액이 부족합니다");
			return;
		}
		if( intOutput < 0) {
			System.out.println("출금액은 0원 이상이어야 함!!");//출금액이 - 음수면 되돌아가기
			return;
		}
		intBalance -= intOutput;//잔액 - 출금액
		bookVO.setBalance(intBalance);//잔액 - 출금액 계산후 남은 잔액 VO 에 다시 담기
		
		// 거래일자, 구분 설정
		// Java 1.8 에서 새롭게 등장한 날짜 클래스
		// Date 클래스에서 발생한 날짜 관련 여러가지 이슈가
		// 상당부분 해소된 새로운 클래스
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String lastDate = localDate.format(df);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark(BankInfo.REMARK.OUTPUT);
		this.accListWrite(BankInfo.REMARK.OUTPUT,intOutput);
		this.bookWriter(bookFile);
		
		//bookVO.setBalance(bookVO.getBalance() - intOutput); 
	}
	
}
