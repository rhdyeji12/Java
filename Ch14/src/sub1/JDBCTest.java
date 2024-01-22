package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * 날짜: 2024/01/22
 * 이름: 공예지
 * 내용: JDBC 실습하기
 * 다운로드 : mysql download-> community -> connector/j -> platform indepentdent -> jar 파일(이클립스 lib 폴더에 복붙)
 */


public class JDBCTest {
	
	public static void main(String[] args) {
		
		//DB 정보
		String host = "jdbc:mysql: // 127.0.0.1:3306/studydb";
		String user = "rhdyeji12";
		String pass = "abc1234";
		
		try {
			// JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn != null) {System.out.println("데이터베이스 접속 성공!");
				
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			

		} catch (Exception e) {
				e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		
		
		
	}
}
