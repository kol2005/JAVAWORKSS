package com.biz.lombok.service;

import java.util.List;

import com.biz.lombok.domain.StudentVO;

public abstract class StudentViewServiceV1 {

	protected List<StudentVO> stdList;
	
	/*
	 * �ܺο��� �� �����ϱ�
	 */
	public void setStdList(List<StudentVO>stdList) {
		this.stdList = stdList;
	}
	
	/*
	 * stdList�� �ֿܼ� ���̱�
	 */
	public abstract void view();
	
	/*
	 * strName ���ڿ��� �Ű������� �޾Ƽ� 
	 * strName ���ڿ��� ��ġ�ϴ� �л��̸��� �ִ� ����Ʈ�� ���̱�
	 */
	public abstract void view(String strName) throws Exception ;
	
	/*
	 * intGrade �������� �Ű������� �޾Ƽ�
	 * intGrade �������� ��ġ�ϴ� �г��� ����Ʈ�� ���̱�
	 */
	public abstract void view(int intGrade);
	
	/*
	 * �ΰ��� �������� �Ű������� �޾Ƽ�
	 * grGrade ���� lessGrade ������ �г� ����Ʈ�� ���̱�
	 */
	public abstract void view(int grGrade, int lessGrade);
	
}
