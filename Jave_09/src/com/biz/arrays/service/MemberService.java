package com.biz.arrays.service;

import com.biz.array.model.MemberVO;

public class MemberService {

	// MemberVO �� �迭�� ����
	// ���� �迭�� ������ �������� ���� ����
	private MemberVO[] mVO;

	// Ŭ������ ������ method
	// return type Ű���尡 ���� method
	// method�� �̸��� Ŭ���� �̸��� ����
	// Ŭ������ ��ü�� ����(���� + �ʱ�ȭ)�Ҷ�
	// �ڵ����� ȣ��Ǿ� ����Ǵ� method
	public MemberService() {

		// 1. �迭 10���� �����
		mVO = new MemberVO[10];

		// 2. �迭�� ������ŭ �ݺ��ϸ鼭
		for (int i = 0; i < mVO.length; i++) {

			// 3. �� ��Ҹ� ��ü�� �����ϰ�
			mVO[i] = new MemberVO();

			// 4. ���Ƿ� �̸��� �����Ͽ�
			// �迭 ����� strName ������ ����
			mVO[i].strName = String.format("KO%03d", i);
		}
	}

	public MemberService(int length) {

		// length �� ��ŭ �迭 ����
		mVO = new MemberVO[length];

		for (int i = 0; i < mVO.length; i++) {
			mVO[i] = new MemberVO();
			mVO[i].strName = String.format("K-%05d", i);
			mVO[i].strTel = String.format("010-%04d-%04d", i + 1, i + 1);

		}
	}

	public MemberVO[] getMemberVO() {
		return mVO;
	}

	public void memberListView() {
		System.out.println("===============================");
		System.out.println("�̸�\t��ȭ��ȣ");
		System.out.println("-------------------------------");
		for (int i = 0; i < mVO.length; i++) {
			System.out.printf("%s\t%s\n", mVO[i].strName, mVO[i].strTel);
		}
		System.out.println("===============================");
	}
}
