package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_01 {

	public static void main(String[] args) {
		
		/*
		 * Collection �����ӿ�ũ��
		 * 		List,Set ���� �ٸ� ������ ������ �����̴�
		 * List,Set �� �Ѱ��� type ���� ����Ʈ�� �����ϴ� �����ε�
		 * Map �� 2���� type �� �ڷḦ �� ������ ����Ʈ�� �����ϸ�
		 * 	Key, Value ��� ��Ư�� ������ ������ �ִ�
		 */
		Map<String,String> strMap = new HashMap<String,String>();
		
		// Map �� ������ �߰�
		strMap.put("1", "ȫ�浿");
		strMap.put("3", "������");
		strMap.put("2", "�̸���");
		strMap.put("5", "����");
		strMap.put("9", "�Ӳ���");
		
		System.out.println(strMap.get("9"));
		
		
	}
}
