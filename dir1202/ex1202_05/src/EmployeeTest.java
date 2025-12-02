// 부모 클래스
class Person {
	String name;
	
	// 매개 변수가 없는 기본 생성자, 매개 벼수가 1개 있는 생성자가 있기 때문에
	// 컴파일러가 기본 생성자 자동으로 만들지 않음 
	public Person() {}
	
	// 매개 변수가 1개 있는 생성자
	public Person(String name) {
		this.name = name;
	}
}

// 자식 클래스 
class Employee extends Person {
	String id;
	
	// 자식의 기본 생성자 
	public Employee() {
		super(); // 자식 클래스 생성자에서 명시적으로 부모 클래스 생성자 호출 
	}
	
	// 매개 변수가 1개
	public Employee(String name) {
		super(name);
	}
	
	// 매개 변수가 2개
	public Employee(String name, String id) {
		super(name);
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동", "1234");
		System.out.println(e1);
		
		Employee e2 = new Employee("이몽룡");
		System.out.println(e2);
	}

}
