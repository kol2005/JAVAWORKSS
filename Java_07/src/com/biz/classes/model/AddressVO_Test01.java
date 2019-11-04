package com.biz.classes.model;

import com.biz.classes.student.AddressVO_List;

public class AddressVO_Test01 {

	public static void main(String[] args) {
		
		AddressVO_List address1 = new AddressVO_List();
		AddressVO_List address2 = new AddressVO_List();
		AddressVO_List address3 = new AddressVO_List();
		
		address1.strName = "È«±æµ¿";
		address1.strTel = "010-xxxx-xxxx";
		address1.strAdd = "±¤ÁÖ±¤¿ª½Ã ¤±¤¤¤·";
		address1.strmm = "µ¿»ı";
		
		address2.strName = "È«±æµ¿1";
		address2.strTel = "010-xxxx-xxxx";
		address2.strAdd = "±¤ÁÖ±¤¿ª½Ã ¤±¤¤¤·";
		address2.strmm = "Çü";
		
		address3.strName = "È«±æµ¿2";
		address3.strTel = "010-xxxx-xxxx";
		address3.strAdd = "±¤ÁÖ±¤¿ª½Ã ¤±¤¤¤·";
		address3.strmm = "´©³ª";
		
		
		System.out.println("==========================================");
		System.out.println("ÁÖ¼ÒÁ¤º¸");
		System.out.println("ÀÌ¸§\tÀüÈ­¹øÈ£\tÁÖ¼Ò\t		°ü°è\t");
		address1.AddressList();
		address2.AddressList();
		address3.AddressList();
		
		
		

	}

}
