package com.library;

public class Main {

	public static void main(String[] args) {
		
		//1번 도서관 만들기
		Library lib = new Library();
		//2번 책 생성
		lib.addBook();
		//3번 책 출력     --> toString을 통해 출력 > 오버라이딩! 
		System.out.println(lib.toString()); //처음, object가 가지는 객체의 주소값을 출력함 
		
		System.out.println(lib.toString());
		
		//4번 책 한권만 출력 
		Book book = new Book("혼자공부하는자바", "신용권");
		
		//5번 book 을 출력하기 위해서 toString을 재정의
		book.toString();
		System.out.println(book.toString());
	
	}

}
