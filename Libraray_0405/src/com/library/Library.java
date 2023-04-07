package com.library;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.library.dao.DBDao;
import com.library.dao.Dao;
import com.library.dao.FileDao;
import com.library.vo.Book;

public class Library {
	//책의 목록을 필드로 가짐 
	//필드로 선언 시 클래스 내부에서 자유롭게 이용이 가능 (전역변수)
	List<Book> list = null;
	
	//인터페이스를 타입으로 선언 -> 인터페이스의 구현체를 이용해서 선언 (Dao는 인터페이스라 생성x) 
	Dao dao = new FileDao();
	
	//filedao를 통해 읽어온다. 
	//파일로부터 정보를 읽어와서 toString으로 출력하는 것. 
	//생성자 : 클래스명과 같은 이름 / 반환타입 x 
	Library(){
		//필드 = list를 초기화 
		list = dao.getList();
	// 만약에 library가 없다면 size가 없을 것. null오류
	//	System.out.println(list.size());
		System.out.println(toString());
	}
	
	
	Library(String daotype){
		if(daotype.equals("DB")) {
			dao = new DBDao();
		}
		//필드 = list를 초기화 
		list = dao.getList();
		System.out.println(toString());
	}
	
	
	
	//list를  출력하기 위한 toString 재정의
	@Override // 사용자에게 보여주기 위한 
	public String toString() {
		System.out.println("책 목록 ==============");
		String info = "";
		//System.out.println(list.size());
		
		
		//정렬하기***********  >> 출력하기 전에 정렬
		Collections.sort(list);
		
		for(Book book : list) {
		//	System.out.println(info);
			info += book.info()  + "\n"; //계속해서 더해줘야해서 += 
		}
		return info;
	}
	
	/**
	 * 책 추가
	 * :1_책의 정보를 받아서 리스트에 등록 후 2_파일로 출력
	 */
	                             //책을 생성할때 필요로한 파라미터를 받아옴 
	public boolean insertBook(int no, String title, String author, boolean isRent) {
		//0. 중복체크 (책을 생성하기 전에 )
		for(Book book : list) {
			if(book.getNo() == no) {
				System.err.println("일련번호가 중복되었습니다. \n 확인 후 다시 입력해주세요.");
				return false;
			}
		}
		
		Collections.sort(list);
		
		//1. 책을 생성
		Book book = new Book(no, title, author, isRent);
		//2. 리스트에 등록
		list.add(book);
		//3. 리스트를 파일로 출력  >> 파일 출력은 dao에서 
		boolean res = dao.listToFile(list);
		
		//파일과 내가 가진 메모리 일치를 위해! 
		//만약에 파일에 정상적으로 등록되지 않으면 list에서 제거 
		if(!res) {
			list.remove(book);
			System.out.println("책이 등록되지 않았습니다. \n 관리자에게 문의해주세요.");
			return false;
		}
		System.out.println("책이 등록되었습니다.");
		System.out.println(toString());  //책이 등록될 때 목록출력해줌
		return true;
	}
	//책 삭제 
	/**
	 * 책의 일련번호를 입력받아서 리스트에서 삭제 
	 * 리스트를 파일로 출력.
	 * @param no
	 * @return
	 */
	public boolean deleteBook(int no) {
		//list안에 book이 있으니까 북을 다 돌아서 가져오고 book의 일련번호
		for(Book book : list) {
			if(book.getNo() == no) {
				//삭제
				list.remove(book);
				//리스트를 파일로 출력
				boolean res = dao.listToFile(list);
				if(!res) {
					list.add(book);
					System.err.println("파일 출력 도중 실행 오류! \n Library의 deleteBook()" );
					return false;
				}
				System.out.println("정상적으로 삭제되었습니다.");
				System.out.println(toString()); // 책이 삭제될때마다 목록 출력
				return true;
			}
		}
		//if문에서 책의 일련번호를 찾았을 때 삭제했기때문에 for문을 나오는 건 못찾았다는 뜻
		System.out.println("일치하는 일련번호가 없습니다.");
		return false;
	}
	/**
	 * 일련번호에 해당하는 책을 찾는다. 
	 * 책의 상태가 렌트가 가능(isRent = false) 상태라면 렌트(isRent = true)
	 * 렌트가 가능한 상태가 아니라면 메세지 처리 
	 * 리스트를 파일로 출력
	 * @param no
	 * @return
	 */
	
	public boolean rentBook(int no) {
		for(Book book : list) {
			//일련번호에 해당하는 책찾기 (찾아서 가져오기 위해서 get)
			if(book.getNo() == no) {
				if(!book.isRent()) {  // false라면 대여가 가능한 --> false를 true로 바꿔주는 !
					System.out.println("대여 가능합니다.");
					//렌트상태로 변경 (변경하기 위해서 set) 
					book.setRent(true);
					//파일로 출력
					boolean res = dao.listToFile(list);
//0407				//DB로 업데이트!!
					int i = dao.update(no);
					if(i>0) {
						System.out.println(i + "건 처리되었습니다.");
					}else {
						System.out.println("처리도중 오류가 발생하였습니다.");
						book.setRent(false);
					}
					
					if(!res) {
						book.setRent(false);
						System.err.println("파일로 출력하는데 실패했습니다.");
					}
					System.out.println("도서가 대여처리되었습니다.");
					System.out.println(toString()); // 정상 대여시 출력해줌
					return true;
				}
			}	
		}
		System.err.println("일련번호를 찾지 못했습니다.");
		return false;
	}

	/**
	 * 일려번호에 해당하는 책 찾기 
	 * 도서가 대여중이라면 반납처리 아니면 오류 메세지 처리
	 * 오류메세지 ("반납가능한 도서가 아닙니다.")
	 * @param no
	 * @return
	 */
	public boolean returnBook(int no) {
		for(Book book : list) {
			if(book.getNo() == no) {
				if(book.isRent()) { // 도서가 대여중이라면 true인 상태
					book.setRent(false);
					dao.listToFile(list);
					//DB로 업데이트 로직 호출
					dao.update(no);
					System.out.println("반납되었습니다.");
					System.out.println(toString());
					return true;
				}else {
					System.err.println("반납가능한 도서가 아닙니다.");
				}
			}
		}
		System.err.println("일련번호를 찾지 못했습니다. 일련번호 확인 부탁!");
		return false;
	}


	
}
