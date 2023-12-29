package test1;
/*
 * 날짜 : 2023/12/28
 * 이름 : 공예지
 * 내용 : 배열 실습하기
 */

public class Test03 {
	public static void main(String[] args) {
		
		int num= 1;
		int result = 0;
		
		result = num++; // 대입 후 증가
		System.out.println("result : "+result);
		
		result = ++num; // 증가 후 대입
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);		
	}
}
