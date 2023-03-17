package com.jungang;

public class Test_04_1_4번문제 {

	public static void main(String[] args) {
		System.out.println("어떤 혜택을 원하세요");
		
		char grade = 'C';
		
		switch (grade) {
			case 'A': 
				System.out.println("VVIP");
			case 'B': 
				System.out.println("VIP"); break;
			case 'C': 
				System.out.println("우수");
			case 'D': 
				System.out.println("일반회원");break;
			default:
				System.out.println("혜택이 없습니다."); 
				
		}
		System.out.println("감사합니다.");
	}

}
