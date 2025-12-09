// 도형들의 상속 계층구조에서 Shape 클래스의 getArea()를 오버라이드하여 각 도형에 맞는 면적을 계산해보자

class Shape {
	public double getArea() {
		return 0;
	}
}

class Rectangle extends Shape {
	private double width, height;
	// 생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override 
	public double getArea() {
		return width * height; // 오버라이딩 
	}
}

class Triangle extends Shape {
	private double base, height;
	// 생성자
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return 0.5 * base * height; // 오버라이딩 
	}
}

public class AreaTest {

	public static void main(String[] args) {
		Shape obj1 = new Rectangle(10.0, 20.0); // 업캐스팅 
		Shape obj2 = new Triangle(10.0, 20.0); // 업캐스팅 
		
		System.out.println("Rectangle: " + obj1.getArea());
		System.out.println("Triangle: " + obj2.getArea());
	}

}
