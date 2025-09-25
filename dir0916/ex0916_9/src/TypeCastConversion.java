// 형변환(Cast 연산자)
public class TypeCastConversion {

	public static void main(String[] args) {
		int i = 1 / 5;	// 정수와 정수 연산 결과는 정수, 결과는 0, 정수형 변수 i에 0이 저장 
		System.out.println("i = " + i); // i = 0
		
		double d = 1 / 5;	// 정수와 정수 연산 결과는 정수, 결과는 0, 실수형 변수 d에 0.0이 저장 
		System.out.println("d = " + d); // d = 0.0
		
		// 지동 형  변환: 정수형이 범위가 큰 실수형으로 변환되서 연
		double dnum = 1.0 / 5;	// 실수와 정수 연산 결과는 실수, 결과는 0.2, 실수형 변수 dnum에 0.2 저장
		System.out.println("dnum = " + dnum);	// dnum = 0.2
		
		// 강제 형 변환(계산 순간에만 유형이 변환)
		double  d1 = (double)1 / 5;
		System.out.println("d1 = " + d1);
		
		int x = (int)(1.7 + 1.8);
		System.out.println("x = " + x);
		
		int y = (int)1.7 + (int)1.8;
		System.out.println("y = " + y);
	}

}
