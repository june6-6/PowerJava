// 실수(float, double)
public class Ex01 {

	public static void main(String[] args) {
		float f1 = 10;
		// float f2 = 10.5; 오류
		float f2 = 10.5f; // 숫자 끝에 f나 F 붙이면 float형이 됨	
		double d1 = 10;
		double d2 = 10.5;
		
		System.out.println(f1 + " + " + d1 + " = " + (f1 + d1));
		System.out.println(f2 + " + " + d2 + " = " + (f2 + d2));
		System.out.printf("%f + %f = %.2f\n",f2, d2, f2 + d2  ); // 출력 서식 지정 
	}

}
