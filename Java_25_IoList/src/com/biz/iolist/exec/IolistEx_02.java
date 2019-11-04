package com.biz.iolist.exec;

import java.util.List;

import com.biz.iolist.MakeProductServiceV2;
import com.biz.iolist.WriteProductService;

public class IolistEx_02 {

	public static void main(String[] args) {
		
		String strProFileName = "src/com/biz/iolist/�����̸�.txt";
		String strProWriteFile = "src/com/biz/iolist/��ǰ����.txt";
		
		MakeProductServiceV2 ms = new MakeProductServiceV2();
		WriteProductService ws = new WriteProductService();
		
		try {
			List<String>productList = ms.getProductList(strProFileName);
			ws.setProList(productList);
			ws.productWrite(strProWriteFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
