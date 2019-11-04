package com.biz.classes.student;

/*
 * main(), �޼��尡 ���� class
 * ����ó�� (data ó��)�� �ϱ����ؼ�
 * �����͸� �����ϰ�, �б� ,���� ���� �����ϴ� Ŭ����
 * ȥ�ڴ� �ƹ��ϵ� ���� ���Ѵ�.
 * �ݵ�� ��𰡿� �ִ� main() �޼��忡��
 * ����, ����, �ʱ�ȭ�� ������ �� 
 * ���Ե� ��������� ���� ����, �б⸦ �����ϰ�
 * ���Ե� method�� ȣ���Ͽ� ����� �����Ѵ�.
 */

/*
 * class�� ����� ��Ģ
 * 1. �Ѱ��� ����(Ŭ����)����
 * 	class Ű���尡 Ư���� ��찡 �ƴϸ�
 * 	1���� �����ؾ� �Ѵ�
 * 2. ������ �̸� Ŭ���� �̸��� ����
 * 	���� �� ������ Student.java �̴�
 * 3. Ŭ���� �̸��� ù���ڴ� �빮���̴�
 * 4. method �� ���� Ŭ������
 * 	����������� ���� �� �ִ�
 * 	��ɹ�, ���� �� ��� �͵� �־�� �ȵȴ�
 * 
 */

public class Student {
	
	//�й�,�̸�,���г⵵,����,�г� �׸��� �ʿ��ϴ�
	// == �̷��� ��������� �ʿ��ϴ�
	// �г� = 2019 - ���г⵵ �������� ���Ѵ�.
	public String strNum;
	public String strName;
	public int intYear; //���г⵵
	public String strDept;
	public int intGrade;
	
	//�л� ������ �������� ��ɱ��� = �޼��� ����, ����
	public void viewInfo() {
		System.out.println("�й� : " + strNum);
		System.out.println("�̸� : " + strName);
		System.out.println("���г⵵ : " + intYear);
		System.out.println("���� : " + strDept);
		System.out.println("�г� : " + (2019 - intYear));
	}
	
	public void list() {
		System.out.printf("%s\t%s\t%d\t%s\t%d\n",
				strNum,strName,intYear,strDept,2019-intYear);
		
	}
	
	
}
