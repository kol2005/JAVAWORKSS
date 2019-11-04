package com.biz.pay.exec;

import com.biz.pay.service.PaperMakeServiceV2;
import com.biz.pay.service.PaperWriterServiceV1;

class PayEx_04 {

	public static void main(String[] args) {

		PaperMakeServiceV2 pms = new PaperMakeServiceV2();
		PaperWriterServiceV1 pws = new PaperWriterServiceV1();
		
		
		
		try {
			pms.make(3758750);
			pws.print(pms.getPaperList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
