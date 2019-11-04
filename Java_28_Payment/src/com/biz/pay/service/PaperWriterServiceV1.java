package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperWriterServiceV1 {
	
	

	public void print(List<PaperVO> list) throws Exception {
		//FileWriter fileWriter = new FileWriter(FileWriter);
		//BufferedWriter buffer = new BufferedWriter(fileWriter);
		PrintWriter pWriter = new PrintWriter("src/com/biz/pay/È­Æó¸Å¼ö.txt");
		
		PaperVO vo = new PaperVO();
		//paperList.getPaper
		
		for(PaperVO vo1 : list) {
		pWriter.println(vo1.getCount()+":"+vo1.getPaper());
		//System.out.println(vo1.getCount()+":"+vo1.getPaper());
		
		}
		pWriter.flush();
		pWriter.close();
	}
	
}
