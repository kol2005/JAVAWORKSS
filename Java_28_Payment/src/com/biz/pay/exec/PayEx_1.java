package com.biz.pay.exec;

public class PayEx_1 {

	public static void main(String[] args) {
		
		int intpay = 3758750;
		int intcount = 50000;
		int pcount = 0;
		while(true) {
			
			if(intcount == 50000 || intcount == 5000 || intcount == 500 || intcount == 50) {//5����,5õ��,5���,50��
				if(intpay == 0)break;
				pcount = intpay/intcount;
				System.out.println(intcount+"���� "+pcount+"��");
				intpay = intpay-(intcount*pcount);
				intcount = intcount/5;
			}else if(intcount == 10000 || intcount == 1000 || intcount == 100 || intcount == 10) {//1����,1õ��,1���,10��
				if(intpay == 0)break;
				pcount = intpay/intcount;
				System.out.println(intcount+"���� "+pcount+"��");
				intpay = intpay-(intcount*pcount);
				intcount = intcount/2;
			}
			//System.out.println();
			
		}

	}

}
