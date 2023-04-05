package com.library.vo;

//왜 책에서 정렬? list에 책이 들어있기 때문에 book에서 정렬 
public class Book implements Comparable<Book>{
	
	
	private int no; //일련번호
	private String title;  //제목
	private String author; //작가
	private boolean isRent;//대여여부
	
	
	//생성자
	public Book(int no, String title, String author, boolean isRent) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.isRent = isRent;
	}

	//메서드 
	
	@Override
	//파일에 출력할때 
	public String toString() {
		
		return getNo() + " " 
		               + getTitle() + " "
		               + getAuthor() + " " 
		               + isRent + " ";
		         
	}
	
	//사용자에게 보여줄때 info
	public String info() {
		String str = "대여가능";
		if(isRent) {
			str = "대여중";
		}
		return getNo() + " " 
		               + getTitle() + " "
		               + getAuthor() + " " 
		               + isRent + " "
		               + str;
	}
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public boolean isRent() {
		return isRent;
	}


	public void setRent(boolean isRent) {
		this.isRent = isRent;
	}

	@Override
	public int compareTo(Book o) {
		if(this.getNo() > o.getNo()) {
			
			return 1;
		}else if(this.no == o.no){
			return 0;
		}else {
			return -1;
		}
		//주어진 객체(T o) 보다 작으면 음수, 같으면 0, 크면 양수를 리턴한다.
	
	}
	

}