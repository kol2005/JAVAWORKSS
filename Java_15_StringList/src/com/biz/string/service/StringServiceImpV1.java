package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.string.StringService;

public class StringServiceImpV1 implements StringService {

	List<String> strList;
	Scanner scan;
	Random rnd;
	
	/*
	 *  �Ű������� ���� ������ = super ������, �⺻������
	 *  1. �ʵ� (�������)�߿� ��ü���� ����Ҽ� �ֵ���
	 *  	�ʱ�ȭ, ���� �ڵ带 �ۼ��ϴ� ����
	 *  	: NullpointException�� �����ϱ� ���� �ڵ�
	 */
	public StringServiceImpV1() {
		strList = new ArrayList<String>();
		scan = new Scanner(System.in);
		rnd = new Random();
		
	}
	@Override
	public void input() {
		
		// 1. ������ �迭ũ�⸦ ���� ������ ��
		//		�� ����� ���� ����(�Ҵ�)�ϴ� ���
		String[] strStudent = new String[3];
		strStudent[0] = "ȫ�浿:����Ư����:010-111:33";
		strStudent[1] = "������:������:010-222:16";
		strStudent[2] = "�̸���:�ͻ��:010-333:18";
		
		// 2. �迭�� ����(�Ҵ�)�� ��Ұ� �̸� ������ ���
		//		�迭�� ũ�⸦ �������� �ʰ�
		//		��Ҹ� �����Ͽ� �迭�� ũ�⸦ �ڵ� ������ ��
		//		��Ҹ� ����(�Ҵ�, ä���ֱ�) �ϴ� ���
		String[] strNation = new String[] {"���ѹα�","�̱�","������","����","����"};
		
		for(int i = 0 ; i < strStudent.length ; i ++) {
			System.out.println(strStudent[i]);
		}
		for(int i = 0 ; i < strNation.length ; i ++) {
			System.out.println(strNation[i]);
		}

	}

	@Override
	public void list() {
		

	}

	@Override
	public void view() {
		

	}

}
