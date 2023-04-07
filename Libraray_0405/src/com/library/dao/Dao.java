package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public interface Dao {
	//파일을 읽어서 리스트를 반환합니다.
	//리스트를 Book으로 받을거얌
	List<Book> getList();
	
	//몇건이 처리되었는지 반환 
	int delete(int no);
	int update(int no);
	int insert(Book book);
	
	//리스트를 파일로 출력 >> filedao로 가서 구현
	boolean listToFile(List<Book> list);
}
