package com.biz.classes.model;

import com.biz.classes.student.AddressVO_List;

public class AddressVO_Test01 {

	public static void main(String[] args) {
		
		AddressVO_List address1 = new AddressVO_List();
		AddressVO_List address2 = new AddressVO_List();
		AddressVO_List address3 = new AddressVO_List();
		
		address1.strName = "畠掩疑";
		address1.strTel = "010-xxxx-xxxx";
		address1.strAdd = "韻爽韻蝕獣 けいし";
		address1.strmm = "疑持";
		
		address2.strName = "畠掩疑1";
		address2.strTel = "010-xxxx-xxxx";
		address2.strAdd = "韻爽韻蝕獣 けいし";
		address2.strmm = "莫";
		
		address3.strName = "畠掩疑2";
		address3.strTel = "010-xxxx-xxxx";
		address3.strAdd = "韻爽韻蝕獣 けいし";
		address3.strmm = "刊蟹";
		
		
		System.out.println("==========================================");
		System.out.println("爽社舛左");
		System.out.println("戚硯\t穿鉢腰硲\t爽社\t		淫域\t");
		address1.AddressList();
		address2.AddressList();
		address3.AddressList();
		
		
		

	}

}
