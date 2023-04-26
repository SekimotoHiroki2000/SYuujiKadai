package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;

public class PracticeTest5 {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		String loveAnimal = "猫";
		int num = 0;
		for(int i = 0; i < 4; i ++) {
			if(animals.get(i) == loveAnimal) {
				num = 1;
			}
		}
		if(num == 1) {
			System.out.println(loveAnimal + "はリストに含まれています");
		} else {
			System.out.println(loveAnimal + "はリストに含まれていません");
		}
		
		Calendar calendar = Calendar.getInstance();
	
	switch(calendar.get(Calendar.MONTH)) {
	case 0:
		System.out.println("冬物セール");
		break;
	case 1, 2, 3:
		System.out.println("春物を売る");
		break;
	case 4:
		System.out.println("春物セール");
		break;
	case 5, 6:
		System.out.println("夏物を売る");
		break;
	case 7:
		System.out.println("夏物セール");
		break;
	case 8:
		System.out.println("秋物を売る");
		break;
	case 9, 10, 11:
		System.out.println("冬物を売る");
		break;
	default:
		System.out.println("不正な月です");
		break;
		
	}
	}
}
