package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Member_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement psmt = null;
		while (true) {
			System.out.println("회원관리 프로그램");
			System.out.println("1.전체 회원조회 2.회원가입 3.회원정보 삭제 4.비밀번호 수정 5.종료");
			int selOfNum = scan.nextInt();
			if (selOfNum == 1) {
				try {
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
					// sql connect
					String sql = "select * from member";
					psmt = conn.prepareStatement(sql);
					
					ResultSet rs = psmt.executeQuery();
					while(rs.next()) {
						String getId = rs.getString(1);
						String getPw = rs.getString(2);
						String getName = rs.getString(3);
						int getAge = rs.getInt(4);
						System.out.printf("ID: %10s  PW: %7s  NAME: %5s  AGE: %3d ",getId,getPw,getName,getAge);
						System.out.println();
					}
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
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
				}

			} else if (selOfNum == 2) {
				System.out.print("id: ");
				String newId = scan.next();
				System.out.print("pw: ");
				String newPw = scan.next();
				System.out.print("name: ");
				String newName = scan.next();
				System.out.print("age: ");
				int newAge = scan.nextInt();
				try {
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
					// sql 문장 준비 String으로
					String sql = "insert into member values(?,?,?,?)";
					// sql 연결 통로, connection 객체 통해 psmt 객체 가져오기
					psmt = conn.prepareStatement(sql);
					// ? 채우기
					psmt.setString(1, newId);
					psmt.setString(2, newPw);
					psmt.setString(3, newName);
					psmt.setInt(4, newAge);
					// sql 실행, psmt 객체를 통해 executeUpdate 메소드 호출
					int row = psmt.executeUpdate();
					if (row > 0) {
						System.out.println("insert success");
					} else {
						System.out.println("insert fail");
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if (psmt != null) psmt.close();
						if (conn != null) conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} else if (selOfNum == 3) {
				System.out.println("삭제할 id를 입력해주세요");
				String delOfID = scan.next();

				try {
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
					// sql 문장 준비 String으로
					String sql = "delete from member where id = ? ";
					// sql 연결 통로, connection 객체 통해 psmt 객체 가져오기
					psmt = conn.prepareStatement(sql);
					// ? 채우기
					psmt.setString(1, delOfID);
					// sql 실행, psmt 객체를 통해 executeUpdate 메소드 호출
					int row = psmt.executeUpdate();
					if (row > 0) {
						System.out.println("delete success");
					} else {
						System.out.println("delete fail");
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
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
				}

			} else if (selOfNum == 4) {
				System.out.println("아이디를 입력해주세요");
				String isId = scan.next();
				System.out.println("패스워드를 입력해주세요");
				String changePw = scan.next();
				try {
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
					// sql 문장 준비 String으로
					String sql = "update member set pw = ? where id = ? ";
					// sql 연결 통로, connection 객체 통해 psmt 객체 가져오기
					psmt = conn.prepareStatement(sql);
					// ? 채우기
					psmt.setString(1, changePw);
					psmt.setString(2,isId);
					// sql 실행, psmt 객체를 통해 executeUpdate 메소드 호출
					int row = psmt.executeUpdate();
					if (row > 0) {
						System.out.println("update success");
					} else {
						System.out.println("update fail");
					}
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
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
				}

			} else if (selOfNum == 5) {
				break;
			}
		}

	}// main

}
