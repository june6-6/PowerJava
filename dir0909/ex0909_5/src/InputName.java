//사용자로부터 이름과 나이를 입력받고 출력하기
import java.util.Scanner;

public class InputName {

	public static void main(String[] args) {
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		//name = sc.nextLine(); //공백을 포함하여 한 줄(전체)의 문자열을 읽음
		name = sc.next(); // next()는 공백 입력x
		
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();
		
		System.out.println(name +"님 반갑습니다. " + age + "살 이군요.");
	}

}