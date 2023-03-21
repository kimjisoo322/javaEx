package com.jungang;

public class ArrayEx12 {

	public static void main(String[] args) {
		int[] scores = {80,90,70,100};
		int sum = 0;
		
		for(int store:scores) {
			System.out.println(store);
			sum += store;
		}
		
		System.out.println("점수의 총합: " + sum);
		System.out.println("평균 점수: " + sum/scores.length);
		
		//System.out.println(80+90+70+100);
		//System.out.println((80+90+70+100)/4);
	}

}
