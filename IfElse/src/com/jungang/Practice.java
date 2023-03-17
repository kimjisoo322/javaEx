package com.jungang;

public class Practice {

	public static void main(String[] args) {
		//시간을 랜덤하게 받고 출력
		
		//int time = (int)(Math.random()*4)+8;
		//System.out.println("[현재 시각:]"+ time + "시");
		//시간을 출력
		//첫번째는 출근합니다.
		//두번째는 회의를 합니다.
		//세번째는 업무를 봅니다.
		//외근을 나갑니다.
		//[현재 시각: 9시]
		// 회의를 합니다.
		// 업무를 봅니다.
		// 외근을 나갑니다.  >> 출력
		/*
		switch(time) {
		case 8: 
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10: 
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		*/
		
		//2번째 문제 
		//일반회원입니다. 출력 
		//A : VVIP / B : VIP / C : 우수회원 / D : 일반회원 / deFAULT : 손님
		
		char a = 'D';
		switch(a) {
		case 'A':
			System.out.println("VVIP 회원입니다."); 
		case 'B':
			System.out.println("VIP 회원입니다.");
		case 'C':
			System.out.println("우수회원입니다.");
		case 'D':
			System.out.println("일반회원입니다."); break;
		default: 
			System.out.println("손님입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
