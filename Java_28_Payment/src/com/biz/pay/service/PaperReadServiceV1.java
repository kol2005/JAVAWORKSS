package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PayVO;

public class PaperReadServiceV1 {
	
	List<PayVO> payList;
	
	public PaperReadServiceV1(){
		payList = new ArrayList<PayVO>();
	}
	

	public List<PayVO> read(String filePath) throws Exception {
		
		FileReader fileReader = new FileReader(filePath);
		BufferedReader buffer = new BufferedReader(fileReader);
		//String paylist = "src/com/biz/pay/급여목록.txt";
		
		PayVO vo = new PayVO();
			while(true) {
				vo = new PayVO();
				String str = buffer.readLine();
				if(str==null)break;
				String[] strsplit = str.split(":");
				
				vo.setStrnum(strsplit[0]);//사원번호
				vo.setPay(Integer.valueOf(strsplit[1]));//급여
				payList.add(vo);
				//System.out.println(strsplit[0]+":"+strsplit[1]);
			}
			
		buffer.close();
		fileReader.close();
		return payList;
		
	}
	
}
