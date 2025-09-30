// switch문 

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1: System.out.println("ONE");break;
		case 2: System.out.println("TWO");break;
		case 3: System.out.println("THREE");break;
		default: System.out.println("OTHER");
		}
	}

}
