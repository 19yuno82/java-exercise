package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex03delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		// 동적로딩
		try {
			//driver 찾기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// db 연결 통로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "12345";
			conn = DriverManager.getConnection(url, id, pw);
			if (conn != null) {
				System.out.println("connect success");
			} else {
				System.out.println("connect fail");
			}
			//sql 문장 준비 String으로
			String sql = "delete from member where id = 'smhrd' ";
			//sql 연결 통로, connection 객체 통해 psmt 객체 가져오기
			psmt = conn.prepareStatement(sql);
			
			//sql 실행, psmt 객체를 통해 executeUpdate 메소드 호출
			int row = psmt.executeUpdate();
			if(row > 0) {
				System.out.println("delete success");
			}else {
				System.out.println("delete fail");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {//연결 통로를 닫을 때는 연 순서 반대로
					if(psmt != null) psmt.close(); 
					if(conn != null) conn.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
