package com.biz.string.exec;

public class StringEx_01 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		// strNation �� ��� ���ڿ���
		// ���ĺ� ������ (�ѱ��ھ�) �߶�
		// strS1 �迭�� ��ƶ�
		String[] strS1 = strNation.split("");//17���� �迭
		
		for(String s : strS1) {
			System.out.println(s);
		}
		
		// strNation �� ��� ���ڿ���
		// space (" ") �������� �߶�
		// strS2 �迭�� ��ƶ�
		String[] strS2 = strNation.split(" ");//3���� �迭
		System.out.println("0:"+ strS2[0]);
		System.out.println("1:"+strS2[1]);
		System.out.println("2:"+strS2[2]);
		
		// ������ ���� �׳� �����϶�
		try {
			System.out.println("3:"+strS2[3]);	
		} catch (Exception e) {
			// �ڵ� ����
			// ���� exception �� �߻��ϸ�
			// ������ �����϶�
		}
		try {
			System.out.println("3:"+strS2[3]);
		} catch (Exception e) {
			
			// try {} ���� �ڵ尡 ����Ǵ� �������� 
			// exception �� �߻��ϸ�
			// JVM �� catch(e) {} ������
			//	exception ������ �����Ѵ�
			// 	�̶� exception ������ ���� e �� �޾Ƽ� ������ �ִ�
			//	e ������ printStackTrace() method ��
			//	� exception �� �߻��ߴ��� �ܼ��� console ��
			//	�����ִ� ����� �����Ѵ�
			e.printStackTrace();
		}

	}

}
