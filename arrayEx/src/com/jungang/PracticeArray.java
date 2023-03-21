package com.jungang;

public class PracticeArray {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		
		arr1[0] = 1; 
		arr1[1] = 2;
		arr1[2] = 3;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		String[] arr2 = new String[4];
		
		arr2[0] ="겨울"; 
		arr2[1] ="가을";
		arr2[2] ="여름";
		arr2[3] ="봄";
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("지금 계절은: "+ arr2[1]);
		
	}

}
