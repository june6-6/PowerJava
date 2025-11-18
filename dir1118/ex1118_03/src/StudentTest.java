import java.util.Scanner;

class Student {
	String name;
	private String rollno;
	int age;
	
	// 생성자
	public Student(String name, String rollno, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		System.out.println("Student 객체가 생성되었습니다.");
	}
	
	// 학번 접근자
	public String getRollno() {
		return rollno;
	}
	
	// 학번 설정자 
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + "]";
	}
	
	
}
public class StudentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 이름: ");
		String name = sc.next();
		System.out.print("학생의 학번: ");
		String id = sc.next();
		System.out.print("학생의 나이: ");
		int age = sc.nextInt();
		
		Student s1 = new Student(name, id, age);
		System.out.println(s1);
		
		Student s2 = new Student("홍길동", "0002", 21);
		System.out.println(s2);
	}

}
