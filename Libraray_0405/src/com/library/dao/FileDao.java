package com.library.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.library.vo.Book;

public class FileDao implements Dao {

	@Override
	//파일로부터 데이터를 읽어서 리스트로 반환 > 리스트로 반환하니까 리스트를 생성하는 것 
	public List<Book> getList() {
//		System.out.println("FileDao.getList() == 파일을 읽어옵니다.");
		List<Book> list = new ArrayList<>();
		
		String str = "";
		
		//try() 문안에 사용은 fr.close(); 
		try(	FileReader fr = new FileReader("bookList.txt");
				BufferedReader br = new BufferedReader(fr);
				) {
			//null값을 반환 = readLine = String 타입 
			while((str = br.readLine()) != null) {
				//문자열을 이용해서 Book객체를 생성 > 문자열은 공백을 이용한 split을 사용하고자 함
				Book book = makeBook(str);
				
				
				//책을 한권만 가져오는 것이 아니기 때문에 생성된 객체를 list에 담아준다. 
				//하지만 book이 제대로 생성되지 않아 실패하면 null을 반환 
				//System.out.println(str);
				//책이 정상적으로 생성되면 list에 책을 담아줘! 
				if(book !=null) {
					list.add(book);
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e1) {
			System.err.println(e1.getMessage());
		}
		//책이 정상적으로 생성된 list를 반환
//		System.out.println("FileDao.getList() == (종료).");
		return list;
	}
	
	/**
	 * 문자열을 파싱해서 Book 객체를 생성한다.
	 * > 책을 공백으로 나눠서 반환 
	 *
	 * @param str
	 * @return
	 */
	
	public Book makeBook(String str) {
		Book book = null;
		//split은 문자열 타입이고 공백으로 나눈 것을 배열로 담기 위해서 
		String[] array = str.split(" ");
		
		//강제형변환 또는 파일의 올바르지 않은 형태로 저장되어 있을 경우 오류가 발생
		// 오류 발생 시 프로그램이 비정상적으로 종료되는 것을 막기 위해 예외처리(try-catch문)사용 
		try {
			//book을 생성해서 알맞은 타입으로 배열 저장
			//문자열을 숫자로 변환 > array는 문자열 no일련번호는 int 타입이라서 
			
			int no = Integer.parseInt(array[0]);
			String title = array[1];
			String author = array[2];
			boolean isRent= Boolean.parseBoolean(array[3]);
			
			book = new Book(no, title, author, isRent);
		} catch (Exception e) {
			//문자열 파싱중 오류가 발생했을 경우 메세지 처리, return null
			System.err.println(str + " : 파싱중 오류가 발생했습니다.");
			return null;
		}
		return book;
		//try, catch문을 열었다면 반환타입에 맞춰서 return을 하고 있어야 함! !  
	}
	/**
	 * 리스트를 매개변수로 받아 파일로 출력(writer)
	 */
	@Override
	public boolean listToFile(List<Book> list) {
		try(
				FileWriter fw = new FileWriter("bookList.txt");
				) {
			for(Book book : list) {
				//리스트에 담긴 책의 정보를 파일로 출력
				fw.write(book.toString() + "\n");
			}
			fw.flush();
			return true;
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		return false;
	}

	@Override
	public int delete(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

}
