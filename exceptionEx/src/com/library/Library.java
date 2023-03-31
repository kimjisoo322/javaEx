package com.library;


public class Library {

	//책의 목록을 가지고 있음. 
	private Book[] bookArry = new Book[5];

	
	//책 리스트를 추가	
	public void addBook() {
		bookArry[0] = new Book("혼공자", "미취겠네");
		bookArry[1] = new Book("파이썬", "오호");
		bookArry[2] = new Book("SQL", "그렇군");
		bookArry[3] = new Book("DB", "이야");
		bookArry[4] = new Book("얏호", "대박이군");
	}
	
	@Override
	public String toString() {
		//주소가 아니라 책을 받고 싶은거
		String str = "";
		
		// 5개의 공간이 있는 북 배열을 만들고 
		// 북의 인덱스에 새
		for(Book input :bookArry) {
			//str = str + input.getTitle() + " " + input.getAuthor() + "\n";
			str += "[" + input.toString()  + "]" ;
		}
		return str;
	}
}
