package com.biz.classes;

import java.util.Scanner;

public class PrimeService {

	/*
	 * main() �޼��忡��
	 * PrimeService.checkPrime(����) �������� ����
	 * ������ num ������ �� ���� �޴´�
	 * num ������ �ִ� ���� �Ҽ�(prime) ���� �˻��Ѵ�
	 */
	public void checkPrime(int num) {
		
		
		int index;
		for(index = 2 ; index < num ; index++) {
			if(num % index == 0)break;
		}
		//index ??
		if(index >= num) {
			System.out.println(num + "�� �Ҽ�(Prime)�̴�!!");
		}else { System.out.println(num + "�� �Ҽ��� �ƴϴ�!!");
		
		}
		
		

	}

}
