import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result;
		
		System.out.print("첫 번째 정수를 입력하시오: ");
		x = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하시오: ");
		y = sc.nextInt();
		
		result = x + y;
		System.out.println(x + "+" + y + "=" + result);
		
		result = x - y;
		System.out.println(x + "-" + y + "=" + result);
		
		result = x * y;
		System.out.println(x + "x" + y + "=" + result);
		
		result = x / y;
		System.out.println(x + "/" + y + "=" + result);
		
		System.out.println("평균" + (x + y) / 2);
		System.out.println("평균" + (x + y) / 2.0);
			
	}

}
