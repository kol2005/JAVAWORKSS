package com.biz.classes.model;

import com.biz.classes.student.AddressVO_List;

public class AddressVO_Test01 {

	public static void main(String[] args) {
		
		AddressVO_List address1 = new AddressVO_List();
		AddressVO_List address2 = new AddressVO_List();
		AddressVO_List address3 = new AddressVO_List();
		
		address1.strName = "ȫ�浿";
		address1.strTel = "010-xxxx-xxxx";
		address1.strAdd = "���ֱ����� ������";
		address1.strmm = "����";
		
		address2.strName = "ȫ�浿1";
		address2.strTel = "010-xxxx-xxxx";
		address2.strAdd = "���ֱ����� ������";
		address2.strmm = "��";
		
		address3.strName = "ȫ�浿2";
		address3.strTel = "010-xxxx-xxxx";
		address3.strAdd = "���ֱ����� ������";
		address3.strmm = "����";
		
		
		System.out.println("==========================================");
		System.out.println("�ּ�����");
		System.out.println("�̸�\t��ȭ��ȣ\t�ּ�\t		����\t");
		address1.AddressList();
		address2.AddressList();
		address3.AddressList();
		
		
		

	}

}
