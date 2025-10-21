// ArrayList (동적배열) : 배열의 크기를 동적으로 변경하면서 사용 가능 

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<String> foods = new ArrayList<>();
		
		foods.add("비빔밥");
		foods.add("라면");
		foods.add("국수");
		
//		for each 문 사용  
//		for (String obj : foods) {
//			System.out.print(obj + " ");
//		}
		
		for (int i = 0; i < foods.size(); i++) {
			System.out.print(foods.get(i) + " ");
		}
	}

}
