package com.biz.pay.Exec;

import com.biz.pay.service.PaperPrintServiceV1;

public class PayEx_03 {

	public static void main(String[] args) {
		
		PaperPrintServiceV1 pp = new PaperPrintServiceV1();
		String payFile = "src/com/biz/pay/pay.txt";
		
		pp.setPayFile(payFile);
		try {
			pp.makePaperList();
			pp.viewpaper();
			pp.printPaper();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
