package com.biz.arrays.exec.member;

import com.biz.array.model.MemberVO;
import com.biz.arrays.service.MemberService;

public class MemberEx_01 {

	public static void main(String[] args) {
		
		// ms ��ü�� �����ϴ� �ڵ尡 ����Ǹ�
		// MemberService�� ������ method�� ȣ��Ǿ� �����Ѵ�
		
		//������ �ڵ尡 ����Ǹ�
		//MemberVO ��ü�� 10�� �����ǰ�
		//�̸� ��������� ���õ� ���·� �����ϰ� �ȴ�
		MemberService ms = new MemberService();
		
		//MemberService���� MemberVO �迭�� �о�ͼ�
		//������ ����
		MemberVO[] mVOs = ms.getMemberVO();
		for(int i = 0 ; i < mVOs.length ; i++) {
			System.out.println(mVOs[i].strName);
		}
		

	}

}
