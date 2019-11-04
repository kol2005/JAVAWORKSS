package com.biz.arrays;

import java.util.Random;

/*
 * 배열 요소의 정렬
 */
public class Array_04 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		Random rnd = new Random();
		
		for(int i = 0 ; i < nums.length ; i++) {
			nums[i] = rnd.nextInt(100) + 1;
			
		}
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i]+", ");
		}
		
		/*
		 * 이 정렬 코드는
		 * bubble, insert, selection 정렬의 기초가되는
		 * 정렬 코드로 다른 알고리즘의 복잡한 코드를
		 * 사용하지 않고
		 * 단순하게 비교, 교체만을 수행해서
		 * 정렬을 한다.
		 */
		for(int i = 0 ; i < nums.length ; i++) {
			// 2. 배열의요소 i 번째와 i+1 번째부터
			//	length - 1 번째까지 비교를해서
			// 3.큰값을 오른쪽에 위치하도록 자리 바꿈
			for (int j = i+1 ; j < nums.length ; j++) {
				// i 가 왼쪽, j 가 오른쪽위치를 나타내며
				// nums[i] 가 nums[j] 보다 크다는 것은
				// 왼쪽 값이 더 크다는 것이므로
				// i 번째의 값과 j 번째의 값을 서로
				//바꾸어준다
				if(nums[i] > nums[j]) {
					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;
					
				}
			}
		}
		System.out.println("\n===========================================");

		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i]+", ");
		}
		
	}

}
