package board.jungang;

public class BoardListMain {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
		int[] array1 = {1,2,3,4,5};
		
		//참조타입: String처럼 Board타입이 온거임! 
		/*
		Board[] board = new Board[5];
		board[0] = new Board("게시글 1","내용","김지수");
		board[1] = new Board("게시글 2","내용2","박지민");
		board[2] = new Board("게시글 3","내용3","윤시윤","23-03-22",0);
		board[3] = new Board("게시글 4","내용4");
		board[4] = new Board("게시글 5","내용5");
		
		for(Board store : board) {
			System.out.println("=========================");
			System.out.println(store.title);
			System.out.println(store.content);
			System.out.println(store.writer);
			System.out.println(store.date);
			System.out.println(store.count);
		}
		*/
		//참조타입: String처럼 Board타입이 온거임! 
		Board[] board = new Board[5];
		
		board[0] = new Board("게시글1", "내용1", "");
		board[1] = new Board("게시글2", "내용2");
		board[2] = new Board("게시글3", "내용3");
		board[3] = new Board("게시글4", "내용4");
		board[4] = new Board("게시글5", "내용5");
		
		
		
		
		
		
	}
}
