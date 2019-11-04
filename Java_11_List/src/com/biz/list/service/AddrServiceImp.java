package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.AddrVO;

public class AddrServiceImp implements AddrService {

	private List<AddrVO> addrList;

	@Override
	public void input() {

		// input() method �� ����

		// input() methos ���� ���ϵ��� �ڵ带
		// �ۼ��ϴ� ��

		// ���¸� ������� input() method ��
		// ��ü���� �ڵ带 �ۼ��ϴ� ��
		addrList = new ArrayList<AddrVO>();

		AddrVO aVO = new AddrVO();

		aVO.setStrName("ȫ�浿");
		aVO.setStrTel("02-111-1111");
		aVO.setStrAddr("����Ư����");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-1111-1111");

		addrList.add(aVO);

		aVO = new AddrVO();
		aVO.setStrName("�̸���");
		aVO.setStrTel("063-110-1111");
		aVO.setStrAddr("������");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-1111-1111");

		addrList.add(aVO);

		aVO = new AddrVO();
		aVO.setStrName("������");
		aVO.setStrTel("063-333-3333");
		aVO.setStrAddr("������");
		aVO.setStrEmail("kol2005@naver.com");
		aVO.setStrHP("010-3333-3333");

		addrList.add(aVO);

	}

	@Override
	public void list() {

		System.out.println("=============================================");
		System.out.println("\t\t��\t��\t��");
		System.out.println("=============================================");
		System.out.println("�̸�\t��ȭ\t�ּ�\tEmail\t�ڵ���");
		System.out.println("=============================================");
		int nSize = addrList.size();
		System.out.println("=============================================");

		for (AddrVO vo : addrList) {
			System.out.printf("%s\t", vo.getStrName());
			System.out.printf("%s\t", vo.getStrTel());
			System.out.printf("%s\t", vo.getStrAddr());
			System.out.printf("%s\t", vo.getStrEmail());
			System.out.printf("%s\n", vo.getStrHP());

		}
	}

	@Override
	public void view(int num) {

		if (num > addrList.size() - 1) {
			System.out.println("�����Ͱ� ����");
			return;// view() method ���� ��!!!
		}
		AddrVO aVO = addrList.get(num);

		System.out.println("�̸� : " + aVO.getStrName());
		System.out.println("��ȭ : " + aVO.getStrTel());
		System.out.println("�ּ� : " + aVO.getStrAddr());
		System.out.println("�̸��� : " + aVO.getStrEmail());
		System.out.println("�ڵ��� : " + aVO.getStrHP());

	}

}
