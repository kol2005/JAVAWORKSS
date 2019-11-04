package com.biz.list.service;

/*
 * GradeServiceImp_* 를 만들때
 * 반드시 GradeService interface 를 implements 해서
 * 사용하는 프로젝트 규칙이 있다
 * 
 * 그래서 GradeService interface 를 implements 했더니
 * 클래스 정의에서 오류가 발생하더라
 * 
 * 오류 발생을 fix 했더니 GradeService interface 에서
 * 정의한 method 들이 자동으로 생성 되었다 
 * 
 * 결론
 * GradeService 는 여러 class 를 작성하는 매우 엄격한
 * 규칙을 가진 설계도 역할을 수행하는 것이다.
 */
public class GradeServiceImp_02 implements GradeService{

	@Override
	public void input(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void total() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}

}
