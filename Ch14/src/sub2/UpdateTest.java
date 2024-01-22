package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜: 2024/01/22
 * 이름: 공예지
 * 내용: JDBC 실습하기
 */

public class UpdateTest {
	public static void main(String[] args) {
		//DB 정보
				String host = "jdbc:mysql: // 127.0.0.1:3306/studydb";
				String user = "rhdyeji12";
				String pass = "abc1234";
				
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		Statement stmt = conn.createStatement();
		
		String sql = "UPDATE `User1` set `hp`= '010-1234-0002', `age`=27 where `uid`='P101'";
		
		stmt.executeUpdate(sql);
		stmt.close();
		conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("UPDATE 완료...");
		
		
		
	}
	
}
