package board.jungang;

public class Board {
	//제목
	//내용
	//작성자
	//작성일
	//조회수 
	
	String title; 
	String content;
	String writer;
	String date; 
	int count;
	
	//public Board(String title) {
		
	//}
	//생성자 이름의 특징 (반환타입x, 클래스명과 동일함)
	public Board(String title, String content) {
		this(title,content,"로그인한 회원 아이디", "현재 컴퓨터 날짜", 0);
	}
	public Board (String title, String content, String Writer) {
		this(title, content, Writer, "현재 컴퓨터 날짜",0);
	}
	
	
	public Board (String title, String content, String writer, String date, int Count) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.count = count;
	}	
}