// 상속과 생성자 	
// 생성자 호출 순서: 부모 클래스 생성자 -> 자식 클래스 생성자 
// 자바에서는 자식 클래스의 객체가 생성될 때 자동으로 부모 클래스의 기본 생성자가 호출된다. 

// 부모 클래스
class Parent {
	// 생성자 
	public Parent() {
		System.out.println("부모 클래스의 생성자가 호출됨.");
	}
}

// 자식 클래스 
class Child extends Parent {
	// 생성자 
	public Child() {
		System.out.println("자식 클래스 생성자가 호출됨.");
	}
}


public class Test {

	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println(c);
	}

}
