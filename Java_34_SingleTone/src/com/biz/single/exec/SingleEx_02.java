package com.biz.single.exec;

import com.biz.single.service.SafeSingleClassV1;

public class SingleEx_02 {

	public static void main(String[] args) {
		
		SafeSingleClassV1 ssc = SafeSingleClassV1.getInstance();
		
		ssc.setName("ȫ�浿");
		ssc.setNation("Republic of Korea");
		
		SafeSingleClassV1 ssc1 = SafeSingleClassV1.getInstance();
				
		System.out.println("�ʴ� ������? >> " + ssc1.getName());
		System.out.println("������ �ƴϳ� >> " + ssc1.getNation());

	}

}
