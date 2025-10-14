// 문자열 배열 
public class Ex06 {

	public static void main(String[] args) {
		String[] foods = new String[3];
		
		foods[0] = "김밥";
		foods[1] = "삼겹살";
		foods[2] = "탕후루";
		
		for (int i = 0; i < foods.length; i++) {
			System.out.print(foods[i] + " ");
		}
		System.out.println("\n");
		// for each문 이용 출력
		for (String x : foods) {
			System.out.print(x + " ");
		}
	}

}
