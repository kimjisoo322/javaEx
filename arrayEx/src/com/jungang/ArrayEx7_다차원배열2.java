package com.jungang;

public class ArrayEx7_다차원배열2 {

	public static void main(String[] args) {
		//이차원 배열 선언
		int[][] scores = new int[2][3];

		//행을 가지고 오는 방법
		//변수명[행번호]
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6};
		
		//값을 가지고 오는 방법 
		//변수명 [행번호][열번호]
		
		//score의 길이를 가져옴 , 0,1 도는 중
		for(int i =0; i<scores.length; i++) {
			//int[] points = scores[0];         //score방에서 순서대로 가져오기
			int[] points = scores[i];           // p는 score[0] , p는 score[1] 
			// j는 0,1,2 도는 중
			for(int j=0; j<points.length; j++) {
				//System.out.println(points[j]);  
				                               // 행, 열, j가 가진 값 
				System.out.printf("(%d,%d) = %d", i, j, points[j]);
			}
		}
		
		
	}

}
