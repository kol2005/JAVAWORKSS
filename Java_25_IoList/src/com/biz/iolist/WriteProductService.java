package com.biz.iolist;

import java.io.PrintWriter;
import java.util.List;

public class WriteProductService {

	List<String> productList;
	
	public WriteProductService() {
	}
	
	public WriteProductService(List<String> productList) {
		this.productList = productList;
	}
	
	public void setProList(List<String> productList) {
		this.productList = productList;
	}
	
	public void productWrite(String proWriteFile) throws Exception {
		
		if(productList == null) {
			System.out.println("상품이름 리스트가 없음");
			return;
		}
		
		PrintWriter fileOut = new PrintWriter(proWriteFile);
		for(String pro : productList) {
			
			fileOut.println(pro);
		}
		fileOut.close();
	}
	
	
	
}
