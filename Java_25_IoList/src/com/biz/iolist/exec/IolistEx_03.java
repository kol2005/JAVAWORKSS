package com.biz.iolist.exec;

import java.util.List;

import com.biz.iolist.MakeProductServiceV2;
import com.biz.iolist.WriteProductService;

public class IolistEx_03 {

	public static void main(String[] args) {
		
		String strProFileName = "src/com/biz/iolist/과자이름.txt";
		String strProWriteFile = "src/com/biz/iolist/상품정보.txt";
		
		MakeProductServiceV2 ms = new MakeProductServiceV2();

		
		try {
			List<String>productList = ms.getProductList(strProFileName);
			WriteProductService ws = new WriteProductService(productList);
			ws.productWrite(strProWriteFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
