// 동적 배열 예제: 자바의 표준 배열은 크기가 결정되면 변경하기 어렵다. 
// 따라서 실제 프로그래밍에서는 동적 배열을 많이 사용

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("김밥"); // 배열 요소 추
		food.add("라면");
		food.add("피자");
		
		System.out.println("메뉴 추천 시스템입니다.");
		int i = (int)(Math.random() * food.size());
		
		System.out.println("추천 메뉴: " + food.get(i));
	}

}
