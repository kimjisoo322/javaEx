package com.jungang;

public class arrayEx_평균 {

	public static void main(String[] args) {
		int[] score = {10,30,40,50,70};
		int sum = 0; 
	
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("평균은 = " + sum / score.length );
	}

}
