package com.biz.pay;

public class PayServiceV5 extends PayServiceV4{
	
	// array(int nPay)
	// whilePay(int nPay
	// for�� �̿��� �ڵ�
	public void forPay(int nPay) {
		
		this.headerView(nPay);
		
		for(int i = 0;nPay > 1 ;i++) {
		int nCount = nPay / nMoney;
		nPay -= nCount * nMoney;
		
		System.out.printf("%8s ���� %4d��\n",payperform.format(nMoney),nCount);
			if(i%2 == 0) {
				nMoney /= 5;
			}else {
				nMoney /=2;
			}
			
		}	
		System.out.println("==================================");
	}
	
	
	
	
}
