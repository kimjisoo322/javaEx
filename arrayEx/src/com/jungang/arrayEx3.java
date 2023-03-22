package com.jungang;

import java.util.Scanner;

public class arrayEx3 {

	public static void main(String[] args) {
		// new 연산자로 배열을 생성하는 방법
		// string 타입의 배열을 만들어주세요! 총 길이는 10!
		// 타입에 맞게 기본값으로 초기화 되어 값이 입력된다. 
		// 정수0, 실수0,0 false, 객체 null >>> 초기값
		// 배열의 방길이는 변하지 않는다. 줄이거나 늘일 수 없음!!! 
		
		String[] names = {"",""};
		int[] score;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개의 방을 만들까요?");
		int index = scan.nextInt();
		score = new int[index];
		score[0]=10;
		
		System.out.println(score[0]);
		
	}

}
