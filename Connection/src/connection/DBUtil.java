package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Connection을 앞으로 편하게 사용하기 위해서 Util 생성
//static은 생성하지 않고 사용 가능하게 함!! 
public class DBUtil {
	/**
	 * DB 커넥션에 생성하여 반환합니다.
	 */
	
	public static void main(String[] args) {
		DBUtil.getConnection();
	}
	
	public static Connection getConnection() {
		//접속정보(ip, port, sid, 계정정보, 비밀번호) 
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "orauser1";
		String pw ="1234";
	
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			
			//롤백하지 않고 커넥션이 종료되면 커밋됩니다. 커넥션이 종료될때 커밋!! (근데 중간에 롤백이 이뤄지면 되돌리겠다)
			conn.setAutoCommit(false);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	//롤백메서드
	public void rollback(Connection conn) {
		try {
			conn.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	// 매개변수에 있는 Connection을 닫고싶어서 = 어떤 객체를 닫고싶다면 그 객체를 받아와야함
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) {
		try {								
			
			//커밋 = connection 닫기전에 커밋
			if(conn != null && !conn.isClosed()) conn.commit();
			
			//만약에 conn이 null이 아니고 conn이 닫히지 않았다면 닫아줘
			if(conn != null && !conn.isClosed()) conn.close();
			//isclosed가 true면 자원이 있다는 것 그렇기에 닫히지 않았다면 닫아줘 
			if(rs!= null && !rs.isClosed()) rs.close();
			if(stmt != null && !stmt.isClosed()) stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} {
			
		}
	}
	
	public static void closeConnection(Connection conn, Statement stmt) {
		try {
			if(conn != null && !conn.isClosed()) conn.commit();
			if(stmt != null && !stmt.isClosed()) stmt.close();
			if(conn != null && !conn.isClosed()) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
