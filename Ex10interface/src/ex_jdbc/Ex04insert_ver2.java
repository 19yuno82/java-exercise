package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04insert_ver2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//사용자로부터 입력받아서 DB에 저장하기
		Connection conn = null;
		PreparedStatement psmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "service";
			String pw = "12345";
			
			conn = DriverManager.getConnection(url, id, pw);
			if(conn != null) {
				System.out.println("connect Success");
			}else {
				System.out.println("connect Fail");
			}
			
			String sql = "insert into member values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			
			System.out.print("ID >> ");
			String memberOfId = scan.next();
			System.out.print("PW >> ");
			String memberOfPw = scan.next();
			System.out.print("NAME >> ");
			String name = scan.next();
			System.out.print("AGE >> ");
			int age = scan.nextInt();
			
			//? (빈칸) 채우기
			psmt.setString(1,memberOfId);
			psmt.setString(2,memberOfPw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			
			int row = psmt.executeUpdate();
			if(row > 0) {
				System.out.println("sql exe");
			}else {
				System.out.println("sql Fail");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.err.println("클래스 경로 잘못됨");
		} finally {
				try {
					if(psmt != null) psmt.close();
					if(conn != null) conn.close(); //commit이 됨
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		

	}

}
