package com.biz.string.exec;

public class PayMent_01 {

	public static void main(String[] args) {
		
		int pay = 3785870;
		int mo = 50000;
		int count = 0;
		
		for(int i = pay ; i > 0 ; i++) {
			
			count = (int)(pay / mo); //5���� �ż�
			System.out.println(mo+"���� : "+count);
			pay = pay - count * mo; // 5���� �ż��� ������ �ݾ�
			if(mo == 50000 || mo == 5000 || mo == 500 || mo == 50){
				mo=mo / 5;
				//return;
				} else {
					mo=mo / 2;
				}
				//if(mo == 10000 || mo == 1000 || mo == 100 ){
				//mo=mo / 2;
				////return;
				//}
			if(pay == 0)break;
		}
		//System.out.println(pay);
	}

}
