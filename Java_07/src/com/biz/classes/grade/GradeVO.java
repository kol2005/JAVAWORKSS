package com.biz.classes.grade;

/*
 * dynamic class �� ��� ���Ǹ� �ϴµ�
 * dynamic �̶�� �ǹ̷� �ؼ��ϸ� ������� �ִ�
 * 
 * static�� �ƴ� class �� ��� ���ظ� ����.
 */
public class GradeVO {
	
	/*
	 * ��ü�� ����
	 * 1. ������ ���ؼ� ������ ���� �����͵���
	 * 	(�й�, �̸�, �������� ��)
	 * 	������ ����
	 * 	==> ���������� �Ѵ�
	 * 
	 * 2. ��������� ���ʷ��Ͽ� ������ ���ؼ�
	 * 	������ �ִ� �׸���� ���Ͽ�
	 * 	method()�� ����
	 * 	(�Ϻ� ��� �޼����� �Ѵ�)
	 * 
	 * 3. ó���ϰ����ϴ� ���(������...)�� ��ü�� �����ϴ�
	 * 	�ܰ踦 '�߻�ȭ'��� �Ѵ�
	 * 	�߻�ȭ�� ��ü���� �� �̿��� ���α׷��ֿ���
	 * 	�ſ� �߿��� �����̴�
	 */
	
	//������� ��
	public String strNum;
	public String strName;
	public int intKor;
	public int intEng;
	public int intMath;
	
	public void gradeList() {
		// %d : ���� (int, long)
		// %f : �Ǽ� (float, double)
		// %c : ���� (char)
		// %s : ���ڿ� (String)
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\n",
				strNum,strName,intKor,intEng,intMath,intKor+intEng+intMath);
	}
	
	public void sum() {
		
		int sum = intKor + intEng + intMath;
		System.out.println("���� : " + sum);
		System.out.println("���� : " + sum/3);
	}
	
	
}
