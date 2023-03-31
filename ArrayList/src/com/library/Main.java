package com.library;

public class Main {
	public static void main(String[] args) {
		Library lib = new Library();
		
		//책 추가
		lib.addBook("자바의정석", "신용권");
		lib.addBook("컴포즈", "아이스티");
		lib.addBook("이디야", "바닐라라떼");
		
		//책 정보 출력
		System.out.println(lib.toString());
	
		System.out.println("삭제할 책 번호를 선택해주세요.");
		int i = 0;
		
		//책 삭제
		lib.removeBook(i);
		
		//첵 정보 출력
		lib.toString();
		
		System.out.println("대여할 책 번호를 선택해주세요");
		i = 0;
		lib.update(i);
		
		lib.toString();
		//검증 : 책 목록의 사이즈 보다 큰 값이 입력되었을 때, 다시 입력 받기 
		
		
		
		
		
		
	}
}
