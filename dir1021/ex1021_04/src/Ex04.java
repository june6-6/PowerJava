// 피자 종류(name)와 피자 반지름(radius)필드를 가진 Pizza 클래스를 작성하고,
// 피자의 크기를 계산하는 메소드(getArea)를 작성
// 이 클래스의 객체를 2개 생성하고, 각 객체의 피자 종류와 반지름을 임의이 값을 저장하고 
// 피자의 크기를 출력하는 코드를 작성하시

class Pizza {
	String name;
	double radius;
	
	double getArea(double radius) {
		return 3.14 * radius * radius;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Pizza a = new Pizza();
		Pizza b = new Pizza();
		
		a.name = "불고기";
		a.radius = 10.0;
		b.name = "치즈";
		b.radius = 12.0;
		
		System.out.println(a.name + "피자의 크기: " + a.getArea(a.radius) );
		System.out.println(b.name + "피자의 크기: " + b.getArea(b.radius) );
	}

}
