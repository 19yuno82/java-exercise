package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {

	// DAO란 data access object
	// 데이터 접근 객체
	// 데이터베이스 접근해서 crud(insert, update, delete, select)
	//가장 기본적인 기능 crud(create, read, update, delete)

	// field
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	// method

	// connect
	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.DB연동
			String user = "service";// db계정 유저 이름
			String password = "12345";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// getConn()

	public ArrayList<MemberDTO> selectAll() {
		getConn();
		ArrayList<MemberDTO> list_dto = new ArrayList<>();
 		MemberDTO mdto = null;
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql);
			// ?채우기

			// sql실행
			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				
				mdto = new MemberDTO(id, pw, name, age);
				list_dto.add(mdto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return list_dto;

	}// selectAll()

	public int signUp(MemberDTO mdto) {
		getConn();
		String sql = "insert into member values(?,?,?,?)";
		int row = 0;
		try {
			// sql통로
			psmt = conn.prepareStatement(sql);

			// ?채우기
			psmt.setString(1, mdto.getId());
			psmt.setString(2, mdto.getPw());
			psmt.setString(3, mdto.getName());
			psmt.setInt(4, mdto.getAge());

			// sql실행
			row = psmt.executeUpdate();
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}// signup()

	public int delete(String id) {
		getConn();
		int row = 0;
		String sql = "delete from member where id = ?";
		try {
			//sql connect
			psmt = conn.prepareStatement(sql);
			//sql문 ? 채우기
			psmt.setString(1, id);
			//sql exe
			row = psmt.executeUpdate();
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}//delete()

	private void getClose() {

		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}// getClose()

	public int update(MemberDTO mdto) {
		getConn();
		int row = 0;
		String sql = "update member set pw = ? where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, mdto.getPw());
			psmt.setString(2, mdto.getId());
			
			row = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}//update()

}
