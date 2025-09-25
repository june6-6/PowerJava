// 증감 연산자, 복합 대입 연산자
public class Operator {

	public static void main(String[] args) {
		// 증감 연산자
		int x = 1, y = 1;
		int a = x++;	// 대입(=)연산이 먼저 연산되고 x의 값이 1 증가, a = 1
		int b = ++y;	// y의 값이 1 증가되고 대입(=)연산이 실행, b = 2
		
		// x = 2, y = 2
		System.out.println("a = " + a + " b = " + b);
		System.out.println("x = " + x + " y = " + y);
		System.out.println();
		
		// 복합 대입 연산
		int c = 100, d = 200;
		c += 10;	// c = c + 10;
		d /= 10;	// d = d / 10;
		System.out.println("c = " + c + " d = " + d);
		System.out.println();
		
		// 조건 연산자
		int e = 10, f = 5, max;
		max = (e > f) ? e : f;	// (조건) ? 조건이 참인 경우 : 조건이 거짓인 경우;
		System.out.println("큰 수: " + max);
		System.out.println("작은 수 ; " + ((e < f) ? e : f));
	}

}
