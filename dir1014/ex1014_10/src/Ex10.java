// 2차원 배열
// 극장에 앉아있는 관객들을 2차원 배열로 나타낼 수 있다. 
// 관객이 있는 좌석은 1, 없는 좌석은 0으로 나타낸다
// 현재 극장에 앚아있는 관객들의 수를 세는 프로그램 작성하기 
public class Ex10 {

	public static void main(String[] args) {
		int[][] seats = {{0,0,0,1,1,0,0,0,0,0}, 
				        {0,0,1,1,1,0,0,0,0,0},
				        {1,1,0,0,1,1,0,0,0,0}};
		int count = 0; // 관객 수 누적 변수
		
		for (int i = 0; i < seats.length; i++){
			for (int j = 0; j < seats[i].length; j++){
				count += seats[i][j];
			}
		}
		System.out.println("현재 관객의 수: " + count + "명");
	}

}
