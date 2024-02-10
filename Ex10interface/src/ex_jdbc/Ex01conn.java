package ex_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01conn {

	public static void main(String[] args) {
		
		//ojdbc 프로젝트를 생성할 때마다 넣어주셔야 합니다
		//프로젝트 우측 클릭- build path- configure bulid path- libraries- add external jars
		
		//oraclexe 폴더 찾기 - app - oracle - product - 11.2.0 - server - jdbc - lib - ojdbc6
		
		//1. 동적 로딩 : 데이터연결을 위해 driver 찾을겁니다
		try {//예외처리
			//컴파일 에러
			//런타임 에러
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//db연결
			String user = "service" ;
			String password = "12345";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			//jdbc:oracle:thin - oracle url
			//127.0.0.1 - localhost - ip주소
			//1521 - 포트번호, 오라클사의 고유 포트번호
			//xe: 데이터베이스 버전이름
			
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn != null) {
				System.out.println("연결 성공");
			} else {
				System.out.println("연결 실패");
			}//if
			
		} catch (ClassNotFoundException e) {//실패했을 때 실행하는 문장
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}//main

}
