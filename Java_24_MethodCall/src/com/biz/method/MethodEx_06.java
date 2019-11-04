package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;
import com.biz.method.service.ViewListService;

public class MethodEx_06 {

	/*
	 * MakeListService 클래스의 getListAll(23) method 를 호출하여
	 * 정수값이 23개 담긴 리스트를 만들고
	 * 
	 * 그 리스트를 ViewListService 클래스에 
	 * 		setListAllAndView(리스트) method 를 호출하여
	 * 리스트를 console 에 보여주고 
	 * 		리스트에 포함된 정수의 개수가 몇개인지를 return 받아서
	 * 		어딘가에 사용하겠다
	 */
	public static void main(String[] args) {
		
		MakeListService ms = new MakeListService();
		
		List<Integer> aList = ms.getListAll(25);
		
		// 생성된 aList 를 ViewListSerivce 클래스에 정의된
		// ...View() method 한테 보내서 
		// 리스트를 console 에 보이고 싶다
		ViewListService vs = new ViewListService();
		int aa = vs.setListAllAndView(aList);
		System.out.println("AA : " + aa);
		
	}
}
