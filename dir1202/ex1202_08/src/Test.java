// 메소드 오버라이딩(overriding): 부모 클래스의 메소드를 자식 클래스가 자신의 필요에 맞추어서 다시 정의(재정의)
// 메소드 이름, 매개변수, 반환형은 동일해야 함
// (비교) 메소드 오버로딩	(overloading): 같은 메소드명을 가진 여러 개의 메소드를 작성(메개 변수가 다름)

// 부모 클래스(일반 직원)
class Employee {
	public int baseSalary = 1000000; // 기본급 

	public int getSalary() {
		return baseSalary;
	}
}
// 자식 클래스(관리자)
class Manager extends Employee {

	// 자식 클래스에서 getSalary() 재정의
	@Override
	public int getSalary() { 
		return (baseSalary + 500000);
	}
	
}
// 자식 클래스(프로그래머)
class Programer extends Employee {

	// 자식 클래스에서 getSalary() 재정의
	@Override
	public int getSalary() { 
		return (baseSalary + 800000);
	}
	
}

public class Test {

	public static void main(String[] args) {
		Manager m = new Manager();
		
		System.out.println("관리자의 월급: " + m.getSalary());
		
		Programer p = new Programer();
		
		System.out.println("프로그래머 월급: " + p.getSalary());
		
		Employee e = new Employee();
		
		System.out.println("일반 직원 월급: " + e.getSalary());
	}

}
