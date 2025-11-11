// 생성자
class Student {
	String name; // 학생 이름
	float height; // 학생 키 
	float weight; // 체중
	
	// 기본 생성자 정의 	
	public Student() {
		
	}
	
	// 매개 변수가 1 개인 생성자 정의	
	public Student(String name) {
		this.name = name;
	}
	// 매개 변수가 3 개인 생성자 정의	
	public Student(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + " 키: " + height + " 체중: " + weight;
	}
	// toString 오버라이드하지 않고 출력하면 주소 출력
}

public class StudentTest {

	public static void main(String[] args) {
		Student studentHong = new Student(); // 기본 생성자(default 생성자)
		System.out.println(studentHong);
		
		studentHong.name = "홍길동";
		studentHong.height = 180.3f;
		System.out.println(studentHong);
		
		Student studentKim = new Student("김유신", 192.3f, 89f);
		System.out.println(studentKim);
		
		Student studentLee = new Student("이순신");
		System.out.println(studentLee);
	}

}
