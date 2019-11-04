package com.biz.method;

import java.util.List;

import com.biz.method.service.MakeListService;
import com.biz.method.service.ViewListService;

public class MethodEx_06 {

	/*
	 * MakeListService Ŭ������ getListAll(23) method �� ȣ���Ͽ�
	 * �������� 23�� ��� ����Ʈ�� �����
	 * 
	 * �� ����Ʈ�� ViewListService Ŭ������ 
	 * 		setListAllAndView(����Ʈ) method �� ȣ���Ͽ�
	 * ����Ʈ�� console �� �����ְ� 
	 * 		����Ʈ�� ���Ե� ������ ������ ������� return �޾Ƽ�
	 * 		��򰡿� ����ϰڴ�
	 */
	public static void main(String[] args) {
		
		MakeListService ms = new MakeListService();
		
		List<Integer> aList = ms.getListAll(25);
		
		// ������ aList �� ViewListSerivce Ŭ������ ���ǵ�
		// ...View() method ���� ������ 
		// ����Ʈ�� console �� ���̰� �ʹ�
		ViewListService vs = new ViewListService();
		int aa = vs.setListAllAndView(aList);
		System.out.println("AA : " + aa);
		
	}
}
