package com.library;

import java.util.List;

import com.library.dao.FileDao;
import com.library.vo.Book;

public class Application {
	public static void main(String[] args) {
		
		/*
		
		//7. fileDao의 파일이 잘 읽어져 오는지 실행 
		FileDao dao = new FileDao();
		//8. 생성한 dao로 내가 리스트를 반환하는 getList 메서드를 읽어오는데 getList의 반환타입이 List<Book>임
		List<Book> list = dao.getList();
		
		System.out.println("생성된 도서 리스트 출력========");
		//18. 도서 리스트 반환 > 
		for(Book book : list) {
			System.out.println(book.toString());
		}
		*/
		
		//21. library 생성
		Library lib = new Library();
		System.out.println(lib.toString());
		
		//26. 추가된거 확인
		lib.insert(1, "오늘도", "우리는", false);
		System.out.println("추가 테스트 =========");
		System.out.println(lib.toString());
		
		
		
		
		
	}
}
