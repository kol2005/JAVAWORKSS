package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {
		
		// scanner ����
		// System.in
		//		Ű����� JVM ���̿��� Ű������ �����ȣ��
		//		��ǻ���� ������ ������ ��ȯ��Ű�� ������
		//		�����ϴ� Ŭ����
		// new Scanner() : ������ �޼����� �д´�.
		//		scanner ��ü�� ����Ҽ� �ֵ���
		//		����, �ʱ�ȭ�� �����Ѵ�.
		Scanner scanner = new Scanner(System.in);
		
		//String(Ŭ����) �� ������ ���� �� �����ϴ� ���� ����
		String strNation = new String("���ѹα�");
		
		// String �� ������ Ŭ����������
		// ��� ���Ǽ��� ���ؼ� �Ϲ� ����ó�� ����, �����Ҽ� �ֵ���
		//������ �������� ������ ������� �ִ�
		String strKorea = "���ѹα�";
		
		String strKeyIn = new String(); // = ""
		
		/*
		 * �� �ڵ尡 ������ �Ǹ� ������Ʈ�� ��� ������ ���߰�
		 * Ű���忡�� �����ΰ� �ԷµǱ⸦ ��ٸ���
		 * Enter Ű�� ���������� ���� ��ٸ��⸸ �Ѵ�
		 */
		strKeyIn = scanner.nextLine();
		System.out.println("Ű���忡�� �Էµ� ���ڿ� : " + strKeyIn);
		

	}

}
