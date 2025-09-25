// 1 개의 문자와(String) 2 개의 숫자를(double) 입력받아서 '+'이면 두 수의 덧셈을, '-' 이면 뺄셈, 
// '*'이면 곱셈, '/' 이면 나눗셈, 
// 단, 나눗셈의 경우 분모가 0이면 '0으로 나눌 수 없습니다' 출
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		String operation;
		double x, y;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("+, -, *, / 중 어떤 연산을 원하세요?");
		operation = sc.nextLine();
		System.out.print("숫자 두 개를 입력하시오: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		// operation == "+" 오류, String은 참조 연산자, 주소를 저장하고 있
		if (operation.equals("+")) {
			System.out.println(x + " + " + y + " = " + (x + y));
		} else if (operation.equals("-")) {
			System.out.println(x + " - " + y + " = " + (x - y));			
		} else if (operation.equals("*")) {
			System.out.println(x + " * " + y + " = " + (x * y));			
		} else if (operation.equals("/")) {
			if (y != 0) {
				
				System.out.println(x + " / " + y + " = " + (x / y));			
			} else {
				System.out.println("0으로 나눌 수 없습니다.");							
			}
		} else {
			System.out.println("연산을 할 수 없습니다.");
		}
	}

}
