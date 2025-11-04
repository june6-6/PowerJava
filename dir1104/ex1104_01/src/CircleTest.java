
public class CircleTest {

	public static void main(String[] args) {
		Circle obj; // 참조 변수 선언 	
		obj = new Circle(); // 객체 생성, new 예약문을 사용
		                    // 객체 참조값(객체의 주소)를 참조 변수에 저장
		
		// 객체의 메소드를 호출하려면 도트(.) 연산자 사용
		obj.radius = 100; // 객체의 필드에 접근	 
		obj.color = "red";
		
//		double area = obj.getArea();
//		System.out.println(obj.color + "색 원의 면적: " + area);
		System.out.println("원의 면적: " + obj.getArea());
		
		Circle c1 = new Circle();
		
		c1.radius = 100;
		c1.color = " blue";

		System.out.println(c1.color);
		
		System.out.println(obj);
		System.out.println(c1);
	}

}
