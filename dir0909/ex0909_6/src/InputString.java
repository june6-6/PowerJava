// 이수학점(정수형)과 취득 계획 자격증(문자열)을 입력받고 출력하기
import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		
		int hakjum; // 학점(정수형) 변수
		String license; // 자격증(문자열) 변수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몇 학점을 이수하셨나요? ");
		hakjum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("취득하려는 자격증은? ");
		// license = sc.next();
		license = sc.nextLine();
		
		System.out.println("이수학점: " + hakjum + "학점");
		System.out.println("계획 자격증: " + license + "자격증이군요.");
		
	}

}
