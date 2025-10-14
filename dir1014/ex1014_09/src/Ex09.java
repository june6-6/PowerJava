// 2차원 배열 
public class Ex09 {

	public static void main(String[] args) {
		int[][] num = {{10, 20}, {30, 40}, {50, 60}}; // 3행 2열 크기의 배열	
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}
