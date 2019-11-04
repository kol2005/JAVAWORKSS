package com.biz.pay.exec;

public class PayEx_1 {

	public static void main(String[] args) {
		
		int intpay = 3758750;
		int intcount = 50000;
		int pcount = 0;
		while(true) {
			
			if(intcount == 50000 || intcount == 5000 || intcount == 500 || intcount == 50) {//5만원,5천원,5백원,50원
				if(intpay == 0)break;
				pcount = intpay/intcount;
				System.out.println(intcount+"원권 "+pcount+"매");
				intpay = intpay-(intcount*pcount);
				intcount = intcount/5;
			}else if(intcount == 10000 || intcount == 1000 || intcount == 100 || intcount == 10) {//1만원,1천원,1백원,10원
				if(intpay == 0)break;
				pcount = intpay/intcount;
				System.out.println(intcount+"원권 "+pcount+"매");
				intpay = intpay-(intcount*pcount);
				intcount = intcount/2;
			}
			//System.out.println();
			
		}

	}

}
