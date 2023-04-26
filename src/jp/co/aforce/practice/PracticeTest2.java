package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		double TAX = 1.1;
		System.out.println(TAX);
		
		int x = 480;
		double price = x * TAX;
		System.out.println(price);
		
		String name = "関本裕輝";
		System.out.println(name);
		
		String bun1 = "この商品の値段は";
		String bun2 = "円です"; 
		System.out.println(bun1 + (int)price + bun2);
		
	}

}
