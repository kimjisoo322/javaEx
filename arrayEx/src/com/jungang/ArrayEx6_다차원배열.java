package com.jungang;

public class ArrayEx6_다차원배열 {

	public static void main(String[] args) {
		// 2차원 배열
		// 행과 열로 구성된 배열 
		int[][] scores = new int[2][3];
		
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6};
		
		System.out.println("scores.lengh: " + scores.length);
		System.out.println("scores의 첫번째 방: " + scores[0].length);
		System.out.println("scores의 두번째 방: " + scores[1].length);
		
		//변수이름[몇행][몇열] 
		
		/*
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		System.out.println(scores[1][0]);
		System.out.println(scores[1][1]);
		System.out.println(scores[1][2]);
		*/
		
		//i : scores이 가진 행의 길이 
		for(int i=0; i<scores.length;i++) {
			int[] points = scores[i];
			System.out.println();
			
			for(int j=0; j<points.length; j++) {
				System.out.printf("(%d, %d) = %d", i, j, points[j]);
			}
		}
		
		
	}

}
