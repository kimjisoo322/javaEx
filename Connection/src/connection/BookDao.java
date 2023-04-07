package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookDao {
	
	public static void main(String[] args) {
		BookDao dao = new BookDao();
	//	dao.insertBook(10,"bts","병","N");
	//	dao.deleteBook(10);
	//	dao.updateBook(10);
		List<Book> list = dao.getList();
		
		System.out.println("책 리스트 ===========");
		for(Book book :list) {
			System.out.println(book.toString());
		}
	}
	
	//데이터 삽입
	public void insertBook(int no, String title, String author, String isRent) {
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "INSERT INTO BOOK VALUES(" +no+ ",'"+title+"','"+author+"','"+isRent+"',SYSDATE,SYSDATE)";
			
			
			//삽입 / 수정 / 삭제
//			stmt.executeUpdate(sql);
			
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건 처리되었습니다.");
			
			//자원반납
			DBUtil.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//데이터 수정
	public void updateBook(int no) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "update book\r\n"
					+ "set book_title = '가수명'\r\n"
					+ "   ,book_author = '곡명'\r\n"
					+ "where book_no =" + no;
			
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건 수정되었습니다.");
			
			//실행 후 바로 멈추지 않고 5초정도 쉬다가 반납
			System.out.println("대기");
			Thread.sleep(5000);
			
			//자원반납
			DBUtil.closeConnection(conn, stmt);
			System.out.println("자원반납");
			System.out.println("대기");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//데이터 삭제
	public void deleteBook(int no) {
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "DELETE From book\r\n"+ "where book_no =" + no;
			
			//삭제 
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건 삭제 처리되었습니다.");
			
			//자원반납
			DBUtil.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//데이터 조회
	public List<Book> getList(){
		List<Book> list = new ArrayList<>();
		
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			//질의결과를 결과집합으로 받아옵니다.
			ResultSet rs = stmt.executeQuery("select * from book order by book_no asc");
			
			
//			rs.next();
			//여러줄을 읽어올 것이기 때문에 while문
			while(rs.next()) {
				int no =rs.getInt("book_no");
				String title =rs.getString("book_title");
				String author = rs.getString("book_author");
				String isRent = rs.getString(4);
				Date regdate = rs.getDate(5);
				Date editDate = rs.getDate(6);
				
				Book book = new Book(no, title, author, isRent, regdate, editDate);
				list.add(book);
			}
			DBUtil.closeConnection(conn, stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
