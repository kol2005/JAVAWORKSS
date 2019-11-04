package com.biz.iolist;

import com.biz.iolist.service.IolistServiceImpV2;

public class Iolist_02 {

	public static void main(String[] args) {
		
		IolistServiceImpV2 io = new IolistServiceImpV2();
		String fileName = "src/com/biz/iolist/매입매출정보.txt";
		
		
		try {
			io.read(fileName);
			io.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
