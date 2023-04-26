package jp.co.aforce.practice;

public class PracticTest6 {
	public static void main (String[] args) {
		int fortune = new java.util.Random().nextInt();
		
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}
		
		for(int i = 1; i <= 100; i ++) {
			if(i % 7 == 0) {
				if(i != 7) {
				System.out.print(", ");	
				
				}
				System.out.print(i);
			}
		}
		System.out.println("\r\n");
		
		for(int i = 1; i <= 9; i ++) {
			for(int n = 1; n <= 9; n ++) {
				System.out.print((i * n) + " ");
			}
			System.out.println("\r\n");
		}
	}

}
