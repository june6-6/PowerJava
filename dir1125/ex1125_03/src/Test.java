// 정적 멤버(클래스 멤버): 여러 개의 객체가 하나의 변수를 공유(인스턴스 멤버는 객체마다 별도의 소유)
// 정적 변수: 클래스당 하나만 생성되는 변수. static을 앞에 붙인다
// 판매되는 피자의 개수 확인하기 

class Pizza {
	private String topping;
	int size;
	static int count = 0; // 정적 변수
	
	// 생성자 
	public Pizza(String topping) {
		this.topping = topping;
		count++; // 정적 변수 이용
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", size=" + size + "]";
	}
}

public class Test {

	public static void main(String[] args) {
		Pizza p1 = new Pizza("포테이토");
		p1.size = 14;
		
		System.out.println(p1);
		
		Pizza p2 = new Pizza("치즈");
		System.out.println(p2);
		
		int n = Pizza.count;
		System.out.println(n);
		
		Pizza p3 = new Pizza("치즈");
		System.out.println(p3);
		n = Pizza.count;
		System.out.println(n);
		
	}

}
