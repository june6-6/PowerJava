// for ~ each 루프 
// 다음의 {1.0, 2.0, 3.0, 4.0, 5.0} 값을 갖는 double형 배열을 생성 후,
// 모든 배열 요소를 출력하고, 요소들의 합을 구해서 출력, 요소 중에서 가장 큰 값을 출력하기	
public class Ex07 {

	public static void main(String[] args) {
		double[] num = {1.0, 2.0, 3.0, 4.0, 5.0};
		double max = num[0];
		double total = 0;
		
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		for (double floatNum : num) {
			System.out.print(floatNum + " ");
		}
		System.out.println();
		 
//		for (int i = 0; i < num.length; i++) {
//			if (max < num[i]) {
//				max = num[i];
//			}
//		}
		for (double x : num) {
			if (max < x) {
				max = x;
			}
		}
		System.out.println("최댓값: " + max);
		
//		for (int i = 0; i < num.length; i++) {
//			total += num[i];
//		}
		for (double n : num) {
			total += n;
		}
		System.out.println("모든 수의 합: " + total);
		
	}

}
