package com.library;

import java.util.List;

import com.library.dao.DBDao;
import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	//19. 필드로 생성해서 아무곳이나 사용할 수 있도록 함. (전역변수)  <-> 메서드 내부에 선언은 (지역변수)
	// 라이브러리가 가진 책의 리스트 선언 / 파일입출력 관련한 dao 두가지 선언
	private List<Book> bookList;
	private Dao dao = new FileDao();
	
/*
	Dao 는 인터페이스라서 생성은 하지 못하지만 참조 변수로 사용이 가능 !  
	Dao는 fileDao와 DatabaseDao 로 생성할 수 있도록 인터페이스를 타입으로 선언한 것.
*/
	
	public Library() {
		//20. 파일을 읽어서 리스트를 초기화한다. (리스트는 내가 선언한 필드) 
		bookList = dao.getList();
	}
	
	public Library(String type) {
		if("db".equalsIgnoreCase(type)) {
			dao = new DBDao();
		}
	}
	
	//22. booklist에 있는 책을 한줄씩 나오도록  출력하기 위해 toStrig 재정의
	@Override
	public String toString() {
		String str = "";
		for(Book book : bookList) {
			str  += book.toString() + "\n";
		}
		return str;
	}
	
	//23. 책 등록하는 메서드 만들기 
	/**
	 * 책 등록 
	 * : 외부로 받은 데이터를 바탕으로 1_책을 생성하고 2_리스트에 추가 3_리스트를 파일에 저장(파일=dao)
	 */
	public boolean insert(int no, String title, String author, boolean isRent) {
		Book book = new Book(no, title, author, isRent);
		bookList.add(book);
		boolean res = dao.fileSave(bookList);
		//25. 리스트가 파일에 성공적으로 추가되는 것. 처음에 리스트에 파일을 추가하고 만약에 실패하면 제거한다. 
		if(res) {
			return true;
		}else {
			bookList.remove(book);
			return false;
		}
	
	}
}
