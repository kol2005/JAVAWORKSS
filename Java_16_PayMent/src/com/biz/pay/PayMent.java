package com.biz.pay;

public class PayMent {

	/*
	 * 화폐매수 계산
	 */
	public static void main(String[] args) {
		
		int pay = 3785870;
		int mo = 50000;
		// 5만원권 매수
		int count = (int)(pay / mo); //5만원 매수
		System.out.println(mo+"원권 : "+count);
		pay = pay - count * mo; // 5만원 매수를 제외한 금액
		
		// 1만원권 매수
		mo = mo/5; //10000
		count = (int)(pay/mo); // 1만원권 매수
		System.out.println(mo + "원권 : "+ count);
		pay = pay - count * mo; // 1만원권 매수 제외한 금액
		
		// 5천원권 매수
		mo = mo / 2; // 5000원권
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 5천원권 매수 제외한 금액
		
		mo = mo / 5; //1000원권
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 1천원권 매수 제외한 금액
		
		mo = mo / 2; //500원권
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 500원권 매수 제외한 금액
		
		mo = mo / 5; //100원권
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 100원권 매수 제외한 금액
		
		mo = mo / 2; //50원권
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 50원권 매수 제외한 금액
		
		mo = mo / 5; //10원권
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 10원권 매수 제외한 금액
		
		mo = mo / 2; //5원권
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 5원권 매수 제외한 금액
		
		mo = mo / 5; //1원권
		count = (int)(pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // 1원권 매수 제외한 금액
		
		

	}

}
