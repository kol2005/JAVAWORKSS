package com.biz.classes.arrays;

import com.biz.classes.service.ArrayScanService;

public class Array_05 {

	public static void main(String[] args) {
		// Ŭ������ ��ü�� �����Ҷ�
		//new ArrayScanService(10) ������ �޼��带 ȣ���ϸ�
		//ArrayScanService Ŭ������ ���ǵ�
		//������ �޼��带 ȣ��ȴ�
		ArrayScanService aService = new ArrayScanService(10);
		
		aService.scanArray();
		
		
	}
}
