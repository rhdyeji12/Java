package test3;

/*
 * 날짜: 2023/01/05
 * 이름: 공예지
 * 내용: 클래스 상속 연습문제
 */
class Customer {
	int id;
	String name;
	String grade;
	int point;
	double pointRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("================");
		System.out.println("고객번호 : "+id);
		System.out.println("고객이름 : "+name);
		System.out.println("고객등급 : "+grade);
		System.out.println("현재 포인트: "+point);
		System.out.println("포인트 적립율 : "+pointRatio);
		System.out.println("----------------");
	}
}

class VipCustomer {
	private double saleRatio;
	
	public vipCustomer(int id, String name) {
		
		super.grade = "VIP";
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;
		
	}
	
	@override
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price - (int)(price*saleRatio);
	}
}

public class Test07 {
	public static void main(String[] args) {
		Customer    kim = new Customer(1001, "김춘추");
		vipCustomer lee = new VipCustomer(1002, "이순신");
		
		System.out.println("김춘추님이 지불할 금액"+kim.calcPrice(10000));
		System.out.println("이순신님이 지불할 금액"+lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
		
	}
	
	
	
	
	
	

}
