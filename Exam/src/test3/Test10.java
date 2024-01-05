package test3;

interface Buyer {
	public void sell();
}

interface Seller {
	public void sell();
}

class Customers     {
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void sell() {
		System.out.println("구매하기");
	}
}

public class Test10 {
	public static void main(String[] args) {
		Buyer buyer = new
		Seller seller= new
		
		buyer.buy();
		seller.sell();
	}

}
