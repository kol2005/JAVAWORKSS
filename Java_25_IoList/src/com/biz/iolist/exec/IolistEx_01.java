package com.biz.iolist.exec;

import com.biz.iolist.MakeProductServiceV1;

public class IolistEx_01 {

	public static void main(String[] args) {
		
		MakeProductServiceV1 ms = new MakeProductServiceV1();
		
		String strProFileName = "src/com/biz/iolist/�����̸�.txt";
		String strProWriteFile = "src/com/biz/iolist/��ǰ����.txt";
		
		try {
			ms.getProductList(strProFileName, strProWriteFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
