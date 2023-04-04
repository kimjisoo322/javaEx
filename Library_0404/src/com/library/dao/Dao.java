package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	//1.파일로부터 데이터를 읽어서 리스트에 담아 반환합니다.
	//2.추상메서드 > 구현은 fileDao에서 
	List<Book> getList();
	
	
	//23. 리스트를 파일에 저장하기 위해서 추상메서드 생성
	boolean fileSave(List<Book> bookList);
	
	
}
