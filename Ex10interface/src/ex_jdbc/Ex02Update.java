package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex02Update {

	public static void main(String[] args) {
		//동적로딩
		Connection conn = null;
		PreparedStatement psmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String pw = "12345";
			//db 통로 연결
			conn = DriverManager.getConnection(url, user, pw);
			if(conn != null) {
				System.out.println("connect success");
			}else {
				System.out.println("connect fail");
			}
			//sql 통로 연결
			String sql = "update member set pw = '5678' where id = 'smhrd' ";
			psmt = conn.prepareStatement(sql);
			
			//sql 실행
			int row = psmt.executeUpdate();
			if(row > 0) {
				System.out.println("update success");
			}else {
				System.out.println("update fail");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //finally {
			try {
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}


}
