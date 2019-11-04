package com.biz.iolist;

import com.biz.iolist.service.IolistServiceImpV1;

public class Iolist_01 {

	public static void main(String[] args) {
		
		IolistServiceImpV1 io = new IolistServiceImpV1();
		String fileName = "src/com/biz/iolist/매입매출정보.txt";
		try {
			io.read(fileName);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
