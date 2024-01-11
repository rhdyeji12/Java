package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 날짜 2024/01/11
 * 이름 : 공예지
 * 내용 : Properties 실습하기
 * 
 * 프로퍼티(Properties)
 * - 문자열 데이터만 취급하는 Key-Value 자료구조 클래스
 * - 직렬화,역직력화를 이용해 데이터를 입출력하는 자료구조 클래스
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		
		//프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
	
		System.out.println(prop);
		
		//프로퍼티 저장(직렬화)
		// 반드시 파일확장자는 properties로 해야됨
		String target = "C:\\Users\\Java\\Desktop\\Fruit.properties";
		
		try {
			FileOutputStream fos = new FileOutputStream(target);
			try {
				
				//직렬화
				prop.store(fos, null);
				
				//스트림 해제
				fos.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		
			////////////////////////////////////////////////////////////
			// 프로퍼티 읽기(역직렬화)
			String source = "C:\\Users\\Java\\Desktop\\City.properties";
			
			Properties propCity = new Properties();
			
			try {
				FileInputStream fis = new FileInputStream(source);
				
				//역직렬화
				propCity.load(fis);
				
				//스트림 해제
				fis.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			System.out.println(propCity);
			System.out.println(propCity.getProperty("101"));
			System.out.println(propCity.getProperty("104"));
			System.out.println(propCity.getProperty("105"));
		
		
			System.out.println("프로그램 종료...");
	
	}
}
