package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		// ���������� �̿��ؼ� ��ü�� list�� �߰�
		/*
		 * ������ VO ��ü�� ���� �����ؼ� add() �� �����ϴ� �ڹٺ��� ������ ȿ������ ���̰�
		 * �����ڸ� ����Ҷ� �߻��ϴ� ���庯���� �߸��� ���� �ߤ����Ǵ�
		 * ������ ������ ���̴�
		 * 
		 * ���� ��ü�� List�� �߰��Ҷ� ����� �� �ִ� ����
		 */
		scoreList.add(new ScoreVO.Builder().s_num("001").build());
		scoreList.add(new ScoreVO.Builder().s_num("001").s_kor(89).build());
		scoreList.add(new ScoreVO.Builder().s_num("001").s_kor(89).s_eng(99).build());
		scoreList.add(new ScoreVO.Builder().s_num("001").s_kor(89).s_eng(99).s_math(100).build());
		
		
		
		
	}

}
