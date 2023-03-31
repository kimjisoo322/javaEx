package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	//책 리스트를 생성
	//길이가 자동으로 늘어나면서 자료도 저장됨
	List<Book> bookList = new ArrayList<>();
	
	
	public Library() {
		
	}

	public Library(List<Book> bookList) {
		//초기화
		//생성자를 만들기 전에 먼저, booklist를 만들어야 초기화할 수 있음. 
		this.bookList = bookList;
	}

	
	public Boolean addBook(String title, String author) {
		//책을 추가할건데, 그러면 책이 생성되어야 함. 책이 있어야 책을 추가하지. 
		Book book = new Book(title, author);
		//맨 마지막에 인덱스를 추가하고 객체를 저장 
		return bookList.add(book); // 책이 정상적으로 추가되면 true, 아니면 false 
		                           // 그래서 return으로 반환할 수 있고 타입은 Boolean
	}
	
	public void removeBook(int index) {
		Book book = bookList.remove(index);
		System.out.println("삭제되었습니다." + book.toString());
	}
	
	public void update(int index) {
		/*
		 * 1. 인덱스에 들어있는 책을 꺼내오기
		 * 2. 렌트여부 수정 
		 * 
		 * 3. 책 저장하기 
		 */
		Book book = bookList.get(index);
		book.setRent(true);
		bookList.set(index, book);
		
		
	}
	
	@Override
	public String toString() {
		// booklist가 가진 책의 목록을 출력하는 것
		int i = 0;
		for(Book book : bookList) {
			System.out.println(i + " : " + book.toString());
			i++;
		}
		return "";
	}
	
	
}
