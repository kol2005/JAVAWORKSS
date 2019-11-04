package com.biz.pay.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import com.biz.pay.domain.PayVO;

public class PaperPrintServiceV1 {
	
	

	public void print(List<PayVO> list) throws Exception {
		
		FileWriter fileWriter = new FileWriter("src/com/biz/pay/�޿�����.txt");
		BufferedWriter buffer = new BufferedWriter(fileWriter);
		
		buffer.write("===================================\n");
		buffer.write("�����ȣ\t\t�޿�\n");
		buffer.write("===================================\n");
		System.out.println("===================================");
		System.out.println("�����ȣ\t\t   �޿�");
		System.out.println("===================================");
		for(PayVO vo : list) {
			
			buffer.write(vo.getStrnum()+"\t\t\t"+vo.getPay()+"��\n");
			System.out.println(vo.getStrnum()+"\t\t\t"+vo.getPay()+"��");
		}
		buffer.close();
		fileWriter.close();

		
	}
	
}
