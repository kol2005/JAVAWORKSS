package com.biz.files;

import com.biz.files.Service.NameServiceV3;

public class NameEx_02 {

	public static void main(String[] args) {
		
		/*
		 * �̸�����Ʈ.txt �� ��������Ʈ.txt ������ �о ����Ʈ�� �����
		 * �� ����Ʈ�� ������ ���� �����Ͽ�
		 * 3������ �ѱ���� �̸��� �����ϰ�
		 * �ѱ����̸�.txt ���Ϸ� �����Ͻÿ�
		 * 
		 * ��, 
		 * 1. ������ ���ڴ� �����ϰ� �ѱ� 1���ڸ� ���
		 * 2. �ѱ����̸� ����Ʈ�� 100���� �ۼ��Ͻÿ�
		 * 
		 * 3. �̸�����Ʈ.txt �� ������ �̸�������
		 * 		��������Ʈ.txt �� ������ ���� ������ ��ġ���� �ʵ��� �Ͻÿ�
		 * 
		 * 4. Service Ŭ������ �ۼ��Ͽ� ������ �����Ͻÿ�
		 */
		
		System.out.printf("���� : %d\n",System.currentTimeMillis());
		
		String nameFile = "src/com/biz/files/�̸�����Ʈ.txt";
		String famFile = "src/com/biz/files/��������Ʈ.txt";
		String korNameFile = "src/com/biz/files/�ѱ����̸���.txt";
				
		NameService ns = new NameServiceV3();
		
		try {
			ns.readNameList(nameFile);
			ns.readFamList(famFile);
			ns.writeNameFile(korNameFile,10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("--------------------------------------");
		System.out.printf("���� : %d\n",System.currentTimeMillis());
		
	}

}
