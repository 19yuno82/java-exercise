package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05delete_ver2 {

	public static void main(String[] args) {
		//사용자한테 id 입력 받아 delete 하기
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
			if(conn != null) {
				System.out.println("connect success");
			}else {
				System.out.println("connect fail");
			}
			
			System.out.print("삭제할 ID >> ");
			String id = scan.next();
			String sql = "delete from member where id like  ? ";
			psmt = conn.prepareStatement(sql);
						
			psmt.setString(1, "%"+id+"%");
			
			int row = psmt.executeUpdate();
			if(row > 0) {
				System.out.println("sql exe");
			}else {
				System.out.println("sql fail");
			}
			
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
