package com.biz.arrays.exec.score;

import com.biz.array.model.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		ScoreVO sVO = new ScoreVO();
		
		//method �� �ܼ� ȣ��
		//ȣ���� �ϵ� ���� ����� Ȯ������ �ʴ´�.
		sVO.add();
		sVO.add_ret();
		
		//return ���� �ִ� method �� ȣ��
		//ȣ���� �ϰ� ����� Ȯ���Ѵ�
		//add_ret() �� return �� num ������ ����
		// console�� ���̴� �ڵ�
		System.out.println(sVO.add_ret());
		
		//return ���� �ִ� method�� ȣ�� 2
		//ȣ���� �ϰ� ����� ������ �޴´�(��´�)
		int result = sVO.add_ret();

	}

}
