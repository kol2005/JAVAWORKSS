package com.biz.list.addr;

import com.biz.list.service.AddrService;
import com.biz.list.service.AddrServiceImp;
import com.biz.list.service.AddrServiceImpV2;

public class AddrEx_02 {

	public static void main(String[] args) {
		
		// �Ϲ����� �ڵ� ���
		AddrServiceImp addr1 = new AddrServiceImp();
		
		addr1.input();
		addr1.list();
		addr1.view(2);
		
		// ��ü���� �ٿ� �ڵ�
		AddrService addr2 = new AddrServiceImpV2();
		addr2.input();
		addr2.list();
		addr2.view(1);
		

	}

}
