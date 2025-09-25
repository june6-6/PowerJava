// 메뉴를 이용해서 화씨를 섭씨로, 섭씨를 화씨 온도로 변환
// 조건 연산자 이용 
import java.util.Scanner;

public class FtoC_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============================");
		System.out.println("1. 화씨 -> 섭씨");
		System.out.println("2. 섭씨 -> 화씨");
		System.out.println("=============================");
		
		System.out.print("번호를 선택하시오: "); 	// 메뉴 번호 
		int menu = sc.nextInt();
		
		System.out.print("온도를 입력하시오: ");
		double x = sc.nextDouble();
		
		double temp = (menu == 1) ? 5.0/9.0*(x-32) : (x*9.0/5.0)+32; 
		System.out.println("변환된 온도는 " + temp);
	}

}
