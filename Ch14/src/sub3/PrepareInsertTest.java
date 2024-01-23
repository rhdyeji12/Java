package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜: 2024/01/23
 * 이름: 공예지
 * 내용: PreparedState 실습하기
 */

public class PrepareInsertTest {
		public static void main(String[] args) {
			
			//DB 정보
			String host = "jdbc:mysql: // 127.0.0.1:3306/studydb";
			String user = "rhdyeji12";
			String pass = "abc1234";
			
			try {
				//1단계-JDBC 드라이버로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//2단계-데이터베이스 접속
				Connection conn = DriverManager.getConnection(host, user, pass);
				
				//3단계-SQL 실행 객체 생성
				String sql = "INSERT INTO `User1` VALUES (?,?,?,?,?)";
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setString(1, "B101");
				psmt.setString(2, "장보고");
				psmt.setString(3, "99-01-01");
				psmt.setString(4, "010-1234-1003");
				psmt.setInt(5,33);
				
				//4단계-SQL 실행
				psmt.executeUpdate();
				
				//5단계-결과처리(select 경우)
				
				
				//6단계-데이터베이스 종료
				psmt.close();
				conn.close();
				
				
			} catch (Exception e) {
				e.printStackTrace();
				
				System.out.println("INSERT 완료");
			}
			
		}

}
