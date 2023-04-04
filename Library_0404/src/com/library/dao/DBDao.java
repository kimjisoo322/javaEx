package com.library.dao;

import java.util.List;

import com.library.vo.Book;

public class DBDao implements Dao{

	@Override
	public List<Book> getList() {
		return null;
	}

	@Override
	public boolean fileSave(List<Book> bookList) {
		return false;
	}

}
