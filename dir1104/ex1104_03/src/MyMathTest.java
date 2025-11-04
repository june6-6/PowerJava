// 메소드 오버로딩(method overloading, 중복 정의): 다형성을 구현하는 방법 중 하나
// 클래스 내에서 이름은 같지만 매개변수의 타입이나 개수가 다른 여러 개의 메소드를 중복으로 작성할 수 있

class MyMath {
	// 매개변수 정수형 2개 
	int add(int x, int y) {
		return x + y;
	}
	// 매개변수 정수형 3개
	int add(int x, int y, int z) {
		return x + y + z;
	}
	// 매개변수 정수형 4개 
	int add (int x, int y, int z, int w) {
		return x + y + z + w;
	}
	// 매개변수 실수형 2개
	double add (double x, double y) {
		return x + y;
	}
}
public class MyMathTest {

	public static void main(String[] args) {
		MyMath obj = new MyMath();
		
		System.out.println("정수형 2개: " + obj.add(10, 20));
		System.out.println("정수형 3개: " + obj.add(10, 20 ,30));
		System.out.println("정수형 4개: " + obj.add(10, 20, 30, 40));
		System.out.println("실수형 2개: " + obj.add(10.0, 20.0));
	}

}
