package com.biz.arrays.exec.method;

import com.biz.array.model.MemberVO;

public class MethodEx_02 {

	public static void main(String[] args) {
		
		MemberVO mVO = new MemberVO();
		mVO.strName = "ȫ�浿";
		mVO.strTel = "010-111-1234";
		mVO.setIntAge(33);
		
				
		System.out.println("�̸�:" + mVO.strName);
		System.out.println("��ȭ��ȣ:" + mVO.strTel);
		System.out.println("����:" + mVO.getIntAge());

	}

}
