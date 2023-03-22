package com.jungang;
import java.util.Scanner;
public class Ex04_07 {
//1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		int num = 0;
		
		Outter:
		while(true) {
			System.out.println("=================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("=================================");
			
			System.out.print("선택> ");
			int user = scan.nextInt();
			
			switch (user) {
			case 1:
				System.out.print("예금액> ");
				money += scan.nextInt();
				System.out.println("사용자 입력: "+ money);
				break;
			case 2:
				System.out.print("출금액> ");
				num += scan.nextInt();
				System.out.println("사용자 입력: " + num);
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(money-num);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break Outter;
			}
			
		}
		
	}	
}
