package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_03 {

	public static void main(String[] args) {
		
		Map<String,Integer> mapAge = new HashMap<String,Integer>();
		
		mapAge.put("È«±æµ¿", 33);
		mapAge.put("ÀÌ¸ù·æ", 22);
		mapAge.put("¼ºÃáÇâ", 16);
		mapAge.put("Àå±æ»ê", 55);
		mapAge.put("ÀÓ²©Á¤", 45);
		
		System.out.println("¼ºÃáÇâÀÇ ³ªÀÌ : "+ mapAge.get("¼ºÃáÇâ"));

	}

}
