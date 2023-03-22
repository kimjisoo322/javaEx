package board.jungang;

public class BoardMain {

	public static void main(String[] args) {
		Board bd = new Board("제목","내용");
		System.out.println(bd.title);
		System.out.println(bd.content);
		System.out.println(bd.writer);
		System.out.println(bd.date);
		System.out.println(bd.count);
		
		System.out.println("==============두번째 생성자=========");
		Board bd1 = new Board("두번째","내용2","김지수");
		System.out.printf("%s \n",bd1.title);
		System.out.println(bd1.content);
		System.out.println(bd1.writer);
		System.out.println(bd1.date);
		System.out.println(bd1.count);
	}

}
