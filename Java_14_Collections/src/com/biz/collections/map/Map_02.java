package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_02 {

	public static void main(String[] args) {
		
		Map<String,String> strAddr = new HashMap<String,String>();
		
		strAddr.put("ȫ�浿", "����Ư����");
		strAddr.put("�̸���", "�ͻ��");
		strAddr.put("������", "������");
		strAddr.put("�庸��", "�س�");
		strAddr.put("����", "�¹���");
		strAddr.put("�Ӳ���", "�԰浵");
		
		System.out.println("�庸���� �ּ� : " + strAddr.get("�庸��"));


	}

}
