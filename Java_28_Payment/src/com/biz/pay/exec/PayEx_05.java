package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.domain.PayVO;
import com.biz.pay.service.PaperPrintServiceV1;
import com.biz.pay.service.PaperReadServiceV1;

class PayEx_05 {

	public static void main(String[] args) {

		//
		//FileReader fileReader = new FileReader(paylist);
		PaperReadServiceV1 rs = new PaperReadServiceV1();
		PaperPrintServiceV1 ps = new PaperPrintServiceV1();
		
		String filePath = "src/com/biz/pay/급여목록.txt";
		
		try {
			List<PayVO> list = rs.read(filePath);
			ps.print(list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
