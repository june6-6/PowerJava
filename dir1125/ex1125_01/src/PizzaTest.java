class Pizza {
	int radius;

	// 생성자 	
	public Pizza(int radius) {
		this.radius = radius;
	}
	
	Pizza whosLargest(Pizza p1, Pizza p2) {
		if (p1.radius > p2.radius) {
			return p1;
		} else {
			return p2;
		}
	}
}

public class PizzaTest {

	public static void main(String[] args) {
		Pizza p1 = new Pizza(14);
		Pizza p2 = new Pizza(18);
		
		System.out.println("p1의 크기: " + p1.radius);
		System.out.println("p2의 크기: " + p2.radius);
		
		// 객체의 참조값이 전달 = 주소 전달 
		Pizza largest = p1.whosLargest(p1, p2);
		System.out.println(largest.radius);
	}
	
}
