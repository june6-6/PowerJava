// 배열 선언과 생
public class Ex05 {

	public static void main(String[] args) {
		int[] a = new int[3]; // 배열 선언과 생성, int a[] = new int[3]; 
		                      // 배열 요소 개수를 지정해야 함 
		
		// 배열 요소 저장
		for (int i = 0; i < a.length; i++) {
			a[i] = i*100;
		}
		
		// 배열 요소 출력 
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		
		// for each
		for (int num : a) {
			System.out.print(num + " ");
		}
	}

}
