package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex02insert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		
		// 1. 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. db connect
			String user = "service";
			String password = "12345";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

			// 3. insert문
			// sql문 통과할 수 있는 통로를 열어야 합니다
			// sql문이 지나갈 수 있는 통로는 Connection에서 구현
			String sql = "insert into member values('smhrd','1234','park',20)";
			psmt = conn.prepareStatement(sql);

			// sql문 실행하세요 메소드 구현
			int row = psmt.executeUpdate();

			// executeUpdate() - insert, delete, update
			// 실행된 문장의 수 리턴
			if (row > 0) {
				System.out.println("insert Success");
			} else {
				System.out.println("insert fail");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {//try,catch 최종적으로 실행되는 문장
			try {
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// main

}
