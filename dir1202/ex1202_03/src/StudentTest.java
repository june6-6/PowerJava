class Person {
	private String regnumber; // 주민번호, 자식 클래스 접근 불가	
	private double weight; // 체중, 자식 클래스에서 접근 불가 	
	protected int age; // 나이, 자식 클래스에서 접근 가능 
	public String name; // 이름, 어디서나 접근 가능 	
	
	// 체중 접근자
	public double getWeight() {
		return weight;
	}
	
	// 체중 설정자
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}

// 자식 클래스
class Student extends Person {
	int id; //학번 
}

public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		
		// s.regnumber = "1231124-1241242" // 오류, 부모 클래스 전용 멤버
		s.setWeight(78.8);
		s.age = 21;
		s.name = "홍길동";
		s.id = 1234;
		
		System.out.println(s.getWeight());
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.id);
	}

}
