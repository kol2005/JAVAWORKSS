package com.biz.arrays.exec.method;

import com.biz.arrays.service.MethodProtoType;

public class MethodEx_03 {

	public static void main(String[] args) {
		
		MethodProtoType mt = new MethodProtoType();
		
		/*
		 * mt Ŭ�������� view() �޼��尡 �����ٵ�
		 * �Ƹ��� 
		 * public void view() {		} ���� �� ���̴�
		 */
		mt.view();
		
		/*
		 * public int ret() { return 0;	} �����̴�
		 */
		int n = mt.ret();
		
		/*
		 * public void (int num1, int num2) {	
		 * }
		 *  ���� �� ���̴�
		 */
		mt.mret(30,40);
		
		/*
		 * ���� mret() �޼��带 �� �ٽ� ȣ���ߴµ�
		 * �� ȣ�� ��ɹ��� ���ؼ� mret() method() ��
		 * public int mret(int num1, int num2) { return 0; }
		 * �޼������� Ȯ�εȴ�.
		 */
		int m = mt.mret(50,30);
		
	}

}
