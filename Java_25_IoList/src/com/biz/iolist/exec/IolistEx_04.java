package com.biz.iolist.exec;

import com.biz.iolist.service.IolistService;

public class IolistEx_04 {

	public static void main(String[] args) {
		
		IolistService is = new IolistService();
		
		String proFileName = "src/com/biz/iolist/��ǰ����.txt";
		
		try {
			is.readProduct(proFileName);
			is.buyMake();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
