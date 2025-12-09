// 다형성: 객체들의 타입이 다르면 똑같은 메시지가 전달되더라도 서로 다른 동작을 하는 것 
// 부모 클래스
class Parent {
	void print() {
		System.out.println("Parent 메소드 호출");
	}
}

// 자식 클래스
class Child extends Parent {
	
	@Override
	void print() {
		System.out.println("오버라이딩 Child 메소드 호출");
	}
	
	void show() {
		System.out.println("자식 메소드 호출");
	}
}
public class Casting {

	public static void main(String[] args) {
		Parent p = new Child(); // 업캐스팅: 자식 객체를 부모 객체로 형변환, 묵시적으로 수행
		p.print(); // 자식의 print() 호출
		// p.show(); // 오류 : 자식 객체의 메소드는 호출 못 함 
		
		// Child c = new Parent(); // 오류 
		Child c = (Child)p; // 다운캐스팅: 부모 객체를 자식 객체로 형변환, 반드시 명시적으로 해야 함
		// 부모 클래스 참조변수로 자식 클래스 객체를 참조했을 경우 자식 클래스 중에서 
		// 부모 클래스로부터 상속받은 부분만 사용할 수 있다.(247p ~ 249p) 
		c.print();
		c.show();
	}

}
