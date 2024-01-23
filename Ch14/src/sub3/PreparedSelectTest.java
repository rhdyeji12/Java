package sub3;

/*
 * 
 * 
 * PreparedStatement
 * - 기존 Statement 보다 향상된 동적 SQL 생성을 위한 Statement
 * - Query Parameter(?)를 사용해서 값을 Mapping (사상, 바인딩)해서 쿼리 실행
 * 
 * 
 * VO객체
 * - VO(Value Object)객체는 SELECT의 결과 테이블 속성을 갖는 객체
 * - 테이블 개체 (Entity)를 객체(Object)로 변환할때 사용하는 객체
 * - JSP, SPRING 에서는 DTO(Data Transfer Object)로 사용  
 */






import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PreparedSelectTest {
    public static void main(String[] args) {

        // DB 정보
        String host = "jdbc:mysql://127.0.0.1:3306/studydb";
        String user = "rhdyeji12";
        String pass = "abc1234";

        // 결과처리용 리스트
        List<User4VO> users = new ArrayList<>();

        try {
            // 1단계 - JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2단계 - 데이터베이스 접속
            Connection conn = DriverManager.getConnection(host, user, pass);

            // 3단계 - SQL 실행 객체 생성
            String sql = "SELECT * FROM `User4`";
            PreparedStatement psmt = conn.prepareStatement(sql);

            // 4단계 - SQL 실행
            ResultSet rs = psmt.executeQuery();

            // 5단계 - 결과처리 (select)
            while (rs.next()) {
                String uid = rs.getString("uid");
                String name = rs.getString("name");
                String gender = rs.getString("gender");
                int age = rs.getInt("age");
                String hp = rs.getString("hp");
                String addr = rs.getString("addr");

                User4VO vo = new User4VO();
                vo.setUid(uid);
                vo.setName(name);
                vo.setGender(gender);
                vo.setAge(age);
                vo.setHp(hp);
                vo.setAddr(addr);

                users.add(vo);
            }

            // 6단계 - 데이터베이스 종료
            rs.close();
            psmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 결과 출력
        for (User4VO vo : users) {
            System.out.printf("%s, %s, %s, %d, %s, %s\n", vo.getUid(), vo.getName(), vo.getGender(), vo.getAge(),
                    vo.getHp(), vo.getAddr());
        }
    }
}
