// 배열의 
public class Ex03 {

	public static void main(String[] args) {
		int[] scores = {10, 20, 30}; // 배열의 선언과 초기화
		// 배열에 저장되는 값을 미리 알고 있을 경우 사용(new 연산자 사용할 필요 없음)
		
//		for (int i = 0; i < 3; i++) {
//			System.out.print(scores[i] + " ");
//		}
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
	}

}
