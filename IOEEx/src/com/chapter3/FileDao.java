package com.chapter3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDao {
	public static void main(String[] args) {
		
		
		FileDao fd = new FileDao();
		fd.fileRead();

		String str = "1/자바/박지민/false";
		//책을 생성하는데 필요한 값을 구분자를 이용해 가져옴
		//파라메터로 입력된 구분자를 이용해 문자열을 자르고 배열로 반환 
		String[] strArray = str.split("/");
		
		//split 테스트 
		int i =0;
		
		for(String s : strArray) {
			System.out.println("방번호 : " + i + " 값: "+ s);
		}
		
		//new Book(0, str, str, false);
		//Book을 보니까 우리는 배열을 str으로 줬고 각 타입이 있어서 타입 맞춰주는 것
		
		int no = Integer.parseInt(strArray[0]);
		String title = strArray[1];
		String author = strArray[2];
		Boolean isRent = Boolean.parseBoolean(strArray[3]);
		
		//book 테스트
		Book book = new Book(no, title, author, false);
		System.out.println("책 정보 출력");
		System.out.println(book.toString());
		
	}
	
	//파일 읽어서 책 리스트를 생성 
	public void fileRead() {
	//	String str = "1, \"자바\", \"박지민\", false";
		//구분자로 끊어서 배열을 반환 
		//{1, 타이틀1, 작가1, false}
		
	//	String[] strArray = str.split(" ");
		
	//	new Book(Integer.parseInt(strArray[0]),
	//			 strArray[1], strArray[2], Boolean.parseBoolean(strArray[3]));
		
		
		try(
				BufferedReader br = new BufferedReader(new FileReader("bookList.txt"));
				) {
			
			String str = "";
			
			List<Book> list = new ArrayList<>();
			System.out.println("책 리스트 정보를 읽어옵니다.");
			
			while( (str = br.readLine()) != null) {
				String[] strArray = str.split(" ");
				
				int no = Integer.parseInt(strArray[0]);
				String title = strArray[1];
				String author = strArray[2];
				boolean isRent = Boolean.parseBoolean(strArray[3]);
				
				Book book = new Book(no, title, author, isRent);
				list.add(book);
				
			}
			System.out.println("생성된 리스트를 출력합니다.");
			for(Book book : list) {
				System.out.println(book.toString());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		}
		
	}
	
	/**
	 * 리스트에 담겨있던 책의 정보를 출력
	 */
	
	public void fileSave() {
		List<Book> bookList = new ArrayList<>();
		
		
		bookList.add(new Book(1, "자바", "박지민", false));
		bookList.add(new Book(2, "SQL", "전정국", false));
		bookList.add(new Book(3, "DB", "김석진", false));
		
		//파일 출력을 위해 BufferedWriter >FileWriter 생성
		try(
				BufferedWriter bw = new BufferedWriter(new FileWriter("bookList.txt"));
				
				) {
			for(Book b : bookList) {
				//System.out.println(b.toString());
				bw.write(b.toString());
				bw.newLine();
			}
			bw.flush();
			
			System.out.println("파일 출력 완료!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


