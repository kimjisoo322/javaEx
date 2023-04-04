package com.library;

import java.util.Scanner;

public class App {
	
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		App app = new App();
		
		System.out.println("이름 입력");
		System.out.println("이름은 : " + app.getString());
		System.out.println("나이 입력");
		System.out.println("나이는 : " + app.getInt());
		
		//스캐너 만들기 
		//스캐너를 메서드로 만들기 (숫자 입력, 문자 입력) 
		
	}
	
	/**
	 * 사용자로부터 숫자 입력 받기 
	 */
	public int getInt() {
		int i = 0;
		
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료");
					System.exit(0);
				}else {
					i = Integer.parseInt(str);
				}
				break;
			} catch (Exception e) {
				
				System.err.println("실행중 오류 발생!!");
				System.out.println("숫자를 입력해주세요.");
			}
			
		}
		return i ;
			
	}
	
	/**
	 * 사용자로부터 문자 입력 받기 
	 * @return
	 */
	public String getString() {
		String str = "";
		while(true) {
			
			try {
				str = scan.next();
				
				try {
					Integer.parseInt(str);
					System.err.println("문자를 입력하세요");
					//내가 숫자를 입력받으면 다시 실행 
					continue;
				} catch (Exception e) {
					// TODO: handle exception
				}
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				break;
			} catch (Exception e) {
				System.err.println("실행 중 오류!! ");;
			}
		}
		return str;
		
	}

}
