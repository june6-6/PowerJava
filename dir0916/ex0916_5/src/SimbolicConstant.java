// 기호 상수(final): 변수의 값이 변경되지 않는다는 것을 의미(변경 시도 시 컴파일 오류 발생)
// 가독성(프로그램 분석)이 좋음 
public class SimbolicConstant {

	public static void main(String[] args) {
		// 원의 면적 계산하가 
		final double PI = 3.141592; 	// 변수 정의 시 final을 붙이면 기호 상수가 된다. 
		double radius, area; // 반지름, 면적 변수 선언 	
		
		// PI = 100; 컴파일 오류 
		radius = 5.0;
		area = PI * radius * radius;
		
		System.out.println("원의 면적: " + area);
	}

}
