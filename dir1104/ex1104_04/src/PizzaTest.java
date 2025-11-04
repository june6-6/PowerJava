// 생성자: 객체를 생성할 때 객체를 초기
// 생성자 이름은 클래스 이름과 같음, 반환값 없음
// 메소드 오버로딩 가능 
class Pizza {
	int size;
	String type;
	
	// 매개 변수가 없는 생성자
	public Pizza() {
		size = 12;
		type = "슈퍼슈프림";
	}
	
	// 매개 변수가 있는 생성자
	public Pizza(int s, String t) {
		size = s;
		type = t;
	}
}
public class PizzaTest {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		System.out.println(p1.type + ", " + p1.size);
		
		Pizza p2 = new Pizza(24, "포테이토");
		System.out.println(p2.type + ", " + p2.size);
	}

}
