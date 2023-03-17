package com.jungang;

public class While_Test {

	public static void main(String[] args) {
		//바깥쪽 for문 'A'~'Z'까지 반복
		//중첩 for문 'a'~'z'까지 반복
		//중첩 for문에서 lower변수가 'g'를 가지면 종료
		
	Outter:for(char upper= 'A'; upper <='Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
				
				
				
			}
		} System.out.println("프로그램 종료");
	
	}

}
