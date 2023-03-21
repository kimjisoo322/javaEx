package com.jungang;

public class arrayEx {

	public static void main(String[] args) {
		//배열
		//같은 타입의 데이터를 연속된 공간에 나열하고
		//index를 부여한 자료구조 
		//* 같은 타입만 저장이 가능 
		//* 한번 생성된 배열의 길이를 늘이거나 줄일 수 없다. 
		//* 배열의 길이를 확인하는 방법: 변수명.length 
		//          = 항목의 개수 ! 
		
		//배열의 선언
//		int score1[];
		//배열 선언과 동시에 값을 입력 
		int[] score = {90,80,60,85,50,60,70,55,99,80};
		
		//배열의 값을 참조하는 방법 
		//변수이름[index] 
		System.out.println("score[0]: "+ score[0]);
		
		//배열의 길이 반환: 변수이름.length >>필드: 속성을 저장할 수 있는 변수 / ( ) 는 매개변수를 가진 메서드 
	//	int a = score.length;
		System.out.println("배열의 길이:"+ score.length);
		
		int sum = 0;
		for(int i =0; i<score.length; i++) {
			//System.out.println(score[i]);
			sum += score[i];
		}
		System.out.println("score의 합은 : "+ sum);
		System.out.println("score의 평균: "+ sum / score.length);
	}

}
