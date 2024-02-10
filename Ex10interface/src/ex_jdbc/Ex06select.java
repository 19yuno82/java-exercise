package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex06select {

	public static void main(String[] args) {
		// select문 실행
		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("connect success");
			} else {
				System.out.println("connect fail");
			}

			String sql = "select * from member";
			psmt = conn.prepareStatement(sql);
			
			//select할 때만 달라지는 부분
			//executeUpdate() vs executeQuery()
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				
				System.out.printf("%s %s %s %d",id,pw,name,age);
				System.out.println();
			}
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // finally

	}

}
