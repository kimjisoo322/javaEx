package com.jungang;

public class ArrayEx7_다차원배열2_1 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3} , {4,5,6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
