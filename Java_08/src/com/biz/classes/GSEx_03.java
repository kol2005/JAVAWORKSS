package com.biz.classes;

import com.biz.classes.service.GradeScoreService;

public class GSEx_03 {

	public static void main(String[] args) {
		
		//GradeScoreVO[] gsVO = new GradeScoreVO[100];
		GradeScoreService gService = new GradeScoreService();
		
		//newVO()�޼��带 ȣ���ϸ鼭
		//���� 100�� ������ �ش�
		gService.newVO(100);
		gService.makeScore();
		gService.scoreList();

	}

}
