package com.biz.iolist;

import com.biz.iolist.service.IolistService;
import com.biz.iolist.service.IolistServiceImpV3;

public class IolistEx_03 {

	public static void main(String[] args) {
		
		IolistService is = new IolistServiceImpV3();
		String fileName = "src/com/biz/iolist/���Ը�������.txt";
		
		try {
			is.read(fileName);
			is.list();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
