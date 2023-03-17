package com.jungang;

import java.util.Scanner;

public class Test_7번문제 {
	//키보드 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드 
	//Scanner의 nextLine( ) 사용
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 결과 | 4. 종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			int select = Integer.parseInt(scan.nextLine());
			if(select == 1) {
				System.out.println("예금액>10000");;
			}else if(select == 2){
				System.out.println("출금액>2000");
			}else if(select == 3) {
				System.out.println("잔고>8000");
			}else {
				System.out.println("");
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	}
}

