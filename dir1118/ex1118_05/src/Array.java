
public class Array {
	public static double minArray(double[] list) {
		double min = list[0]; // 첫 번째 요소를 저장
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min; // 최솟값을 넘겨줌 
	}
	public static void main(String[] args) {
		double m;
		double[] a = {1.1, 2.2, 3.3, 0.5, 1.7};
		double[] b = {-2.1, 2.9, 8.3, 0.6, 1.7};
		
		m = minArray(a);
		System.out.println("첫 번째 배열의 최솟값: " + m);
		
		m = minArray(b);
		System.out.println("두 번째 배열의 최솟값: " + m);
	}

}
