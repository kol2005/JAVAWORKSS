package com.biz.thread.exec;

import java.util.Scanner;

import com.biz.thread.classes.RunThreadV1;

/*
 * ���μ���
 * �Ѱ��� ��ǻ��(�Ǵ� OS)���� �۵��Ǵ� ���α׷���
 * (��: hwp, excel, ���ǿ���)
 * 
 * Multi process, Tasking
 * ���μ����� ���ÿ� �۵��Ǵ� ȯ��
 * 
 * Multi Thread
 * �Ѱ��� Process ���ο��� ���� ������ ��(job)���� �����ϰ�
 * �̵��� ���ÿ� �۵��ϵ��� �ϴ� ȯ��
 * 
 * ī���忡�� ���� �Է��� �ϵ��� ��ٸ��鼭
 * �� �ٸ� �������� 1���� 100���� ������ �����Ͽ� �ֿܼ� ���̵��� �ϰ�ʹ�
 */
public class ThreadEx_01 {

	public static void main(String[] args) {
		
		RunThreadV1 rt = new RunThreadV1();
		
		Scanner scanner = new Scanner(System.in);
		rt.start();
		System.out.print("�ƹ����ڳ� �Է� >> ");
		

		
		// blocking �Ǿ���
		// �ڵ尡 ����Ǵ� ���ȿ� � �κп��� ���̻� �������� ���ϰ�
		// ���߾ ������� �Է��� ��ٸ��� ���°� �ȴ�
		String strAny = scanner.nextLine();
		System.out.println("�Է��� ���� : " + strAny);
		
		Integer.valueOf(strAny);

	}

}
