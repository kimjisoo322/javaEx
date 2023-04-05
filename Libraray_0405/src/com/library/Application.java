package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.dao.FileDao;
import com.library.vo.Book;
public class Application {
	Scanner scan = new Scanner(System.in);  //앱에서 자유롭게 접근하기 위해서 필드로 뺌

	public static void main(String[] args) {
		
		//도서관을 생성해서 파일을 읽어오도록 함. 
		Library lib = new Library();
		
		Application app = new Application();
		//app을 생성하지 않고 getString(), getInt() 메서드를 사용할 수 없다. 
		//main 메소드 = static메소드 (정적메소드) > static에서는 인스턴스를 바로 사용 x 생성하고 나서 부를 수 있음
		//만약 바로 부르고 싶다면 app에 있는 메서드들도 static으로 선언하면 가능 
		//ex) getInt() , getString() 에 static 붙이기 ! 
		
		
		//로그인 
		//관리자 : 1. 책등록 2. 책삭제
		//사용자 : 1. 책대여 2. 책반납
		//id를 입력받아서 admin이면 관리자 아니면 사용자 
		while(true) {
			//자주 사용하는 로직은 메서드로 빼서 만들면 코드가 간결해짐! > 사용자 입력 부분을 메서드로 받기 
			//스캐너로부터 입력을 받아서 리턴해주는 역할 
			//입력 요청
			System.out.println("id : ");
			
			String id = app.getString();
				
			if("admin".equalsIgnoreCase(id)) {
				System.out.println("관리자 메뉴 입니다.");
				
				// >>>>>>관리자 반복
				Outter:
				while(true) {
					
					System.out.println("1. 도서 등록 2. 도서 삭제 0. 로그아웃 q: 프로그램 종료");
					System.out.println("메뉴를 입력해주세요.");
					
					//사용자에게 메뉴를 입력받는다. > 사용자는 번호를 쓸 것이기 때문에 int로 menu를 받아서 우리가 메서드로 만들어둔 getInt 부르기.
					int menu = app.getInt();
					
					switch (menu) {
					case 1:
						//일련번호
						System.out.println("일련번호 입력: ");
						int no = app.getInt();
						//도서명
						System.out.println("도서명 입력: ");
						String title = app.getString();
						//작가
						System.out.println("작가 입력  ");
						String author = app.getString();
						
						lib.insertBook(no, title, author, false);
						
						continue;
					case 2:
						System.out.println("삭제할 도서번호를 입력: ");
						int index = app.getInt();
						lib.deleteBook(index);
						continue;
					case 0:
						System.out.println(id + "님 로그아웃합니다. Bye Bye~ ");
						break Outter;
					default:
						System.out.println(menu + "없는 메뉴입니다.!!");
						break;
					}
					
					break;
				}
				
			}else {
				System.out.println(id + "님, 환영합니다!");
				
				//>>>>>>사용자 반복 
				while(true) {
					System.out.println("1. 도서 대여 2. 도서 반납 0. 로그아웃 q: 프로그램 종료");
					System.out.println("메뉴를 입력해주세요.");
					int menu = app.getInt();
					
					switch (menu) {
					case 1:
						System.out.println("대여할 책 번호 입력: ");
						int no = app.getInt();
						lib.rentBook(no);
						continue;
					case 2:
						System.out.println("반납할 책 번호 입력: ");
						no = app.getInt();
						lib.returnBook(no);
						continue;
					case 0:
						System.out.println(id + "님 로그아웃합니다. 다음에 또 봐요!");
						break;
					default:
						System.err.println(menu + "없는 메뉴입니다.");
						break;
					}
					break;
				}
				
				}
			}
		
		
		
		
		/*
		
		//책추가
		lib.insertBook(1, "모월모일", "미상", false);
		lib.insertBook(2, "자바의정석", "신용권", false);
		lib.insertBook(3, "SQL", "데베", false);
		//system.out.println(lib) = system.out.println(lib.toStrin())  같은 결과
	
		
		//책 삭제 (자동으로 만든 것) app에서 먼저 타입, 매개변수 만들어놓고 create method로 자동 만들기
		int no = 0;
		boolean result = lib.deleteBook(1);
		
		result = lib.rentBook(2);
		result = lib.returnBook(2);
		*/
		
		
		
	}
	/**
	 * 사용자로부터 입력받은 문자열을 반환
	 * > 숫자가 입력될 경우 오류 발생이라서 try문에 코드를 넣은 거고 
	 *   다시 문자를 입력해달라고 받기 위해 while문을 사용 
	 *   이후 try문에서 문자가 입력될 경우 catch문으로 이동 > break 반복문 탈출 
	 * @return
	 */
	//메서드는 메인메서드 밖에! > 사용자 입력 메서드 (문자로 받음)  
	public String getString() {
		String str = "";
		while(true) {
			try {
				str = scan.next();
				
				//1. q,Q 입력시 프로그램 종료
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				
				//2. 숫자로 변경되면 문자를 입력해달라고 다시 요청 
				int i =Integer.parseInt(str);
				System.err.println("문자를 입력해주세요.");
			} catch (Exception e) {
				// 문자가 입력된 경우 문자를 반환해서 반복문 탈출
				break;
			}
		}
		return str;
	}
	
	/**
	 * 사용자로부터 정수를 입력받아 반환합니다. 
	 * 문자가 입력되었을 경우 다시 입력받기
	 * q. 입력되었을 경우 프로그램 종료 
	 * @return
	 */
	
	//사용자 입력 받기 > q인지 확인 > 숫자로 변환 > 오류가 발생 시 다시 사용자 입력 
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}else {
					i = Integer.parseInt(str);
					break;
				}
			}catch (Exception e) {
				System.err.println("숫자를 입력해주세요! ");
			}
		}
		return i;
	}
}
