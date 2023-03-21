package com.jungang;

public class arrayIndexOutOfBounder {

	public static void main(String[] args) {
		//배열 선언
		int[] score;
		
		//배열 선언한 후 중괄호를 사용해서 값을 입력하면 오류가 발생 
		//1. 배열 선언 후 생성하는 방법
		// 변수명 = new 타입[ ] {값 목록, ...} >>> 선언 후, 값을 미리 지정하는 법
		//score = new int[] {10,20,30};
		
		//java.lang.ArrayIndexOutOfBoundsException
		//배열의 index를 초과하는 방번호가 입력된 경우 
		//int sum = score[3]; <- 오류발생
		
		//2. 배열 선언 후 생성하는 방법 
		// 값의 목록이 없지만 미리 배열을 만드는 경우 
		// 변수명 = new 타입 [길이];        >>> 선언 후, 길이를 미리 지정하는 법 
		score = new int[10];          // >> score 에는 주소가 저장
		System.out.println("새로운 int 타입을 저장할 10개의 저장공간을 만들었어요! ");
		
		for(int i =0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}
	
}
