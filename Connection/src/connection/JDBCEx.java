package connection;

//import java.security.interfaces.RSAKey;
//자바에서 제공하고 있는 인터페이스 > 인터페이스를 구현해놓은 라이브러리 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCEx {
	public static void main(String[] args) {
		JDBCEx ex = new JDBCEx();
		ex.connectionTest();
		ex.getList();
		//ex.insertBook();
		//ex.deleteBook();
		//ex.updateBook();
		
		
	
	}
	
	public void connectionTest() {
		//데이터베이스 접근시 필요한 정보 
				// ip , port, sid, 계정정보 , 비밀번호
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				String id = "orauser1";
				String pw = "1234";
				
				Connection conn;
				
				try {
					//1. 드라이버 로딩
					Class.forName("oracle.jdbc.driver.OracleDriver");
					try {
						//2. 커넥션 얻어오기
						conn = DriverManager.getConnection(url,id,pw);
						System.out.println("커넥션 얻기 성공 \n" + conn);
						
						//3. 쿼리실행
						Statement stmt = conn.createStatement();
						
						//4. 데이터 조회 executeQuer(쿼리문장 입력)  >> sql에서 쿼리 실행 후 정상적이면 세미콜론 빼고 가져옴
						//5. ResultSet : 결과 집합 
						//6. rs.next() , rs.getString() 조회
						ResultSet rs = stmt.executeQuery("select * from book");
						rs.next();
						System.out.println("조회결과 : " + rs.getString(1));
						
						// 자원 반납 (연결시켜준것부터 닫아주기)
						rs.close();
						stmt.close();
						conn.close();
						
						//데이터 생성, 수정, 삭제
						//stmt.executeQuery("");
						
					} catch (SQLException e) {
						System.err.println(e.getMessage());
					}
				} catch (ClassNotFoundException e) {
					System.err.println(e.getMessage());
				}
	}
	//Read
	public void getList() {
		//클래스 로딩 (드라이버 로딩)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser1";
		String pw ="1234";
		
		Connection conn;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try {
				//커넥션 얻어오기
				conn = DriverManager.getConnection(url,id,pw);
				System.out.println("커넥션 얻기 성공 \n" + conn);
				
				//쿼리 실행
				Statement stmt = conn.createStatement();
				
				//데이터 조회  (* sql에서 쿼리를 실행해보고 정상적이면 세미콜론을 버리고 가져옴 * )
				ResultSet rs = stmt.executeQuery("select*from book\r\n"
						+ "order by book_no asc");
				//
				
				//결과 집합 가져오기 ( sql에서 조회된 결과들이 곧 결과 집합 ) 
		//		rs.next();
			
				List<Book> list = new ArrayList<>();
				
				
				while(rs.next()) {
					//변수로 담아주기  > book을 생성해서 객체 만들어주고 생성자, 메서드 만들어주고 
					int no = rs.getInt(1);
					String title = rs.getString(2);
					String author = rs.getString(3);
					String isRent = rs.getString(4);
					Date regdate = rs.getDate(5);
					Date editDate = rs.getDate(6);
					System.out.println();
					
					//Book을 생성해서 리스트에 담아준다. 데이터베이스로부터 데이터를 가져와서 리스트로 담고 출력해본 것 
					//결과는 [ ] 로 나옴.
					Book book = new Book(no, title, author, isRent, regdate, editDate);
					list.add(book);
				}
				
				System.out.println(list);
				for(Book book:list) {
					System.out.println(book.toString());
				}
				
				rs.close();
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
	
		//쿼리 실행 후, 결과집합 받아오기 
		
	}
	
	public void insertBook() {
		//클래스 로딩 (드라이버 로딩)
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser1";
		String pw ="1234";
		
		Connection conn;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 
				//커넥션 얻어오기
				conn = DriverManager.getConnection(url,id,pw);
				System.out.println("커넥션 얻기 성공 \n" + conn);
				
				//쿼리 실행
				Statement stmt = conn.createStatement();
			
				//쿼리 실행결과(int타입으로 몇건이 처리되었는지 반환) > 몇건이 업데이트 되었습니다.
				// sql에서 실행을 해보고 쿼리가 정상적으로 실행이 되었다면 rollback을 하고 와야 자바에서 건 처리가 가능! 
				int res = stmt.executeUpdate("INSERT INTO BOOK VALUES(11,'아모르파티','이홍기','Y',SYSDATE,SYSDATE)");
				
				System.out.println(res + "건 처리되었습니다.");
				
				stmt.close();
				conn.close();

			} catch (SQLException e) {
				System.err.println(e.getMessage());
			
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
		
	
		//쿼리 실행 후, 결과집합 받아오기 
		
	}
	
	
	public void deleteBook() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser1";
		String pw ="1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션을 얻어오기 위해 필요한 정보
			Connection conn = DriverManager.getConnection(url,id,pw);
			//자동커밋을 하지 않겠다. connection이 닫힐 때는 commit
			System.out.println("오토커밋 - false 설정");
			conn.setAutoCommit(false);
			
			//쿼리실행준비
			Statement stmt = conn.createStatement();
			//몇건이 처리되었는지 int 타입으로 반환
			int res = stmt.executeUpdate("delete from book");
			System.out.println(res + "건 처리되었습니다.");
			conn.rollback();
			System.out.println("롤백되었습니다.");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateBook() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser1";
		String pw ="1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,id,pw);
			Statement stmt = conn.createStatement();
			
			int res = stmt.executeUpdate("update book\r\n"
					+ "set book_author = 'we are bts'\r\n"
					+ "where book_no = '7'");
			System.out.println(res + "건 업데이트 되었습니다.");
			
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc 라이브러리를 확인해주세요");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}















