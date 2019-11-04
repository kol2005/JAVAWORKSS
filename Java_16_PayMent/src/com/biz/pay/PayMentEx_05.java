package com.biz.pay;

public class PayMentEx_05 {

	public static void main(String[] args) {
		
		PayServiceV5 ps = new PayServiceV5();
		
		int nPay = 59730100;
		ps.array(nPay);
		//ps.whilePay(nPay);
		ps.forPay(nPay);

	}

}
