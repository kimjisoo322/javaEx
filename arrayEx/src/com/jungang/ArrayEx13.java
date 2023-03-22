package com.jungang;

public class ArrayEx13 {

	public static void main(String[] args) {
		int[] score = {10,20,30}; 
		int sum = 0;
		
		//향상된 for문 이용해서 출력 
		for(int user : score) {
			sum+=user;
		}
		System.out.println("총합: " + sum);
		System.out.println("평균: " + sum/score.length);
		
	}

}
