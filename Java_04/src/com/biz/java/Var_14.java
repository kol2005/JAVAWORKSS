package com.biz.java;

public class Var_14 {

	public static void main(String[] args) {
		
		int dNum = 6;
		int cNum = 1;
		
		System.out.println("========================");
		System.out.printf("������ %d ��\n",dNum);
		System.out.println("------------------------");
		
		System.out.printf("%d x %2d = %3d\n",dNum,cNum,dNum*cNum++);
		
		System.out.printf("%d x %2d = %3d\n",dNum,cNum,dNum*cNum++);
		
		System.out.printf("%d x %2d = %3d\n",dNum,cNum,dNum*cNum);
		
		System.out.printf("%d x %2d = %3d\n",dNum,++cNum,dNum*cNum);
		
		

	}

}
