package com.biz.pay.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import com.biz.pay.domain.PayVO;

public class PaperPrintServiceV1 {
	
	

	public void print(List<PayVO> list) throws Exception {
		
		FileWriter fileWriter = new FileWriter("src/com/biz/pay/급여명세서.txt");
		BufferedWriter buffer = new BufferedWriter(fileWriter);
		
		buffer.write("===================================\n");
		buffer.write("사원번호\t\t급여\n");
		buffer.write("===================================\n");
		System.out.println("===================================");
		System.out.println("사원번호\t\t   급여");
		System.out.println("===================================");
		for(PayVO vo : list) {
			
			buffer.write(vo.getStrnum()+"\t\t\t"+vo.getPay()+"원\n");
			System.out.println(vo.getStrnum()+"\t\t\t"+vo.getPay()+"원");
		}
		buffer.close();
		fileWriter.close();

		
	}
	
}
