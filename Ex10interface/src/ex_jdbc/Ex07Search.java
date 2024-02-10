package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex07Search {

	public static void main(String[] args) {
		//select할 때 조건 걸어서 검색해서 가져오기
		//+ 로그인 구현하기
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String isId = scan.next();
		System.out.print("PW : ");
		String isPw = scan.next();
		
		Connection conn =null;
		PreparedStatement psmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
			if(conn != null) {
				System.out.println("connect success");
			} else {
				System.out.println("connect fail");
			}					
			//sql connect			
			String sql = "select * from member where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			
			//? 채우기
			psmt.setString(1, isId);
			psmt.setString(2, isPw);
			
			
			//sql exe
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) { //rs.get~() 인덱스 번호는 select문으로 가져온 테이블이 기준
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				System.out.printf("%s %s %s %d",id,pw,name,age);
			}//while
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(psmt != null) psmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
