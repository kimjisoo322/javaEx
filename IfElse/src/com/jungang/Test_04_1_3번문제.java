package com.jungang;

public class Test_04_1_3번문제 {

	public static void main(String[] args) {
		int score = 85;
		System.out.println("등급은 ");
		
		if(score < 70) {
			System.out.println("D");
		}else if(score < 80) {
			System.out.println("C");
		}else if(score < 90) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
		System.out.println("입니다.");
		
	}

}
