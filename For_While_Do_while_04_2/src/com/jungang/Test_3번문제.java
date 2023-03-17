package com.jungang;

public class Test_3번문제 {

	//while문과 Math.random() 
	//2개의 주사위
	//나오는 눈 (눈1, 눈2) 형태로 출력
	//눈의 합이 5가 아니면 계속 실행, 눈의 합이 5이면 실행을 멈춤
	//(1,4) (4,1) (2,3) (3,2) 
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			System.out.println("("+num1+","+num2+")");
			
			if((num1+num2) == 5) {
				break;
			}
		}System.out.println("프로그램을 종료합니다.");
		
		
	}

}
