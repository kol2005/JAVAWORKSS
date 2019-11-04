package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.ScoreVO;

public class ScoreEx_01 {

	public static void main(String[] args) {

		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();

		ScoreVO scoreVO = new ScoreVO();
		
		// Build
		ScoreVO scoreBVO = new ScoreVO.Builder().s_num("001").s_kor(90).s_eng(80).s_math(70).build();
		scoreList.add(scoreVO);
		scoreList.add(new ScoreVO.Builder().s_num("002").s_kor(99).s_eng(95).s_math(100).build());

		// ��ü�� �����ϸ鼭 �ʵ� ���� �����ϴ� �������� ���
		// + �ʵ��̸��� ���� setter() method �� ���ؼ� ���� �����ϴ� ���
		// ������ ��Ƹ��� ����
		// 1. �����ڸ� ���� �����Ҷ� � �ʵ忡 ���� �����ϴ���
		//		�Ҹ�Ȯ�Ͽ� �߸� ���Եɼ� �ִ� ������ �ذ�
		// 2. ������ ��ü�� �����Ͽ� setter()�� ���� �ʵ尪�� �����ϴ� 
		//		���¿��� ������ ��ü�� ������ �ʾƵ� �ʵ尪�� 
		//		�ʱ�ȭ �� �� �ִ� ������ �ִ�
		
		// �������� �����ڸ� �̿��� ��ü���� �� list �߰�
		scoreList.add(new ScoreVO.Builder().s_num("003").s_kor(100).build());
		scoreList.add(new ScoreVO.Builder().s_num("004").s_kor(100).build());
		scoreList.add(new ScoreVO.Builder().s_num("005").s_kor(100).build());
		scoreList.add(new ScoreVO.Builder().s_num("006").s_kor(100).build());
	}

}
