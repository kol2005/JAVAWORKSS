package com.biz.for_if;

public class If_02 {

	public static void main(String[] args) {
		
		/*
		 * main() �޼��� scope ���� ����� ����
		 * main ������ ����
		 * main() aptjem {} �������� �����Ӱ�
		 *  ������ ���� (�б�, ����) �� ����
		 */
		int numM = 100;
		if(3 == 3) {
			/*
			 * if keyword ������ ������ scope ���� ����� ����
			 * if ���� �������� ������ ����
			 */
			int numIf = 200;
			
			System.out.println("numM : " + numM);
			System.out.println("numIf : " + numIf);
			
		}
		System.out.println("numM : " + numM);
		
		/*
		 *  if ������ ����� numIf ������
		 *  if ���� �ۿ����� �����Ҽ� ����
		 */
		//System.out.println("numIf : " + numIf);
	
		
		
	}

}
