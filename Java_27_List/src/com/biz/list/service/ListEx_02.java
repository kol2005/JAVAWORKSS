package com.biz.list.service;

import java.util.List;

public class ListEx_02 {

	public static void main(String[] args) {
		
		ListMakeServiceV1 lm = new ListMakeServiceV1();
		lm.makeStrList(); // list 积己
		List<String> strList = lm.getStrList();
		
		ListRecServiceV2 全辨悼 = new ListRecServiceV2(strList, "全辨悼");
		ListRecServiceV2 捞根锋 = new ListRecServiceV2(strList, "捞根锋");
		ListRecServiceV2 己冕氢 = new ListRecServiceV2(strList, "己冕氢");
		
		
		全辨悼.viewList();
		全辨悼.remove();
		捞根锋.viewList();
		捞根锋.remove();
		己冕氢.viewList();
		己冕氢.remove();
		
		全辨悼.viewList();
		全辨悼.remove();
		
		全辨悼.viewList();
		捞根锋.viewList();
		己冕氢.viewList();
	}

}
