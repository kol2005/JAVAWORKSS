package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_03 {

	public static void main(String[] args) {
		
		Map<String,Integer> mapAge = new HashMap<String,Integer>();
		
		mapAge.put("ȫ�浿", 33);
		mapAge.put("�̸���", 22);
		mapAge.put("������", 16);
		mapAge.put("����", 55);
		mapAge.put("�Ӳ���", 45);
		
		System.out.println("�������� ���� : "+ mapAge.get("������"));

	}

}
