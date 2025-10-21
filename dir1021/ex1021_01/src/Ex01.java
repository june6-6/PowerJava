// 래그드 배열: 행마다 길이가 다른 배열 
// 시험엔 안 나옴
public class Ex01 {

	public static void main(String[] args) {
		int[][] rag = new int[3][];
		rag[0] = new int [] {1, 2};
		rag[1] = new int [] {10, 20, 30};
		rag[2] = new int [] {3};
		
//		for (int[] rarray : rag) {
//			System.out.println(rarray);
//		}
		
		for (int i = 0; i < rag.length; i++) {
			for (int k = 0; k < rag[i].length; k++) {
				System.out.print(rag[i][k] + " ");
			}
			System.out.println();
		}
	}

}
