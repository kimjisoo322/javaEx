package com.jungang;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[][] scores = new int[2][];
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {1,2};
		
		for(int i =0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.println("("+i+","+j+")"+ "방안에 있는 값: "+ scores[i][j]);
			}
		}
	}
}

