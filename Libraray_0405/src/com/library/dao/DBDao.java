package com.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.library.dao.connection.DBUtil;
import com.library.vo.Book;

public class DBDao implements Dao{
	
	@Override
	public List<Book> getList() {
		
		List<Book> list = new ArrayList<>();
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from book order by book_no asc");
			while(rs.next()) {
				int no = rs.getInt("book_no");
				String title = rs.getString("book_title");
				String author = rs.getString("book_author");
				
				//Y , N (먼저 isRentstr에 데이터베이스에 받은 값을 저장)
				String isRentstr = rs.getString("book_isRent");
				//(조건) ? 참일때 반환 값 : 거짓일때 반환 값
				boolean isRent = ("Y".equalsIgnoreCase(isRentstr))? true:false;
			
				Book book = new Book(no, title, author, isRent);
				list.add(book);
			}
			
			//자원반납
			DBUtil.closeConnection(conn, stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean listToFile(List<Book> list) {
		// TODO Auto-generated method stub
		return false;
	}
	
//몇건이 출력되었는지 대해 삭제/ 업데이트 / 삽입
	@Override
	public int delete(int no) {

		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "DELETE From book where book_no =" + no;
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건 처리되었습니다. ==삭제완료");
			
			DBUtil.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	//수정

	@Override
	public int update(int no) {
		int res =0;
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "update book set book_title = 'B!T!S' where book_no =" +no;
			res = stmt.executeUpdate(sql);
			System.out.println(res + "건 처리되었습니다. ==수정완료");
			
			//자원반납
			DBUtil.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}
	//등록, 삽입 
	@Override
	public int insert(Book book) {
		try {
			Connection conn = DBUtil.getConnection();
			Statement stmt = conn.createStatement();
			
			String sql = "";
			
			int res = stmt.executeUpdate(sql);
			System.out.println(res + "건 처리되었습니다. ==등록완료");
			
			//자원반밥
			DBUtil.closeConnection(conn, stmt);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
