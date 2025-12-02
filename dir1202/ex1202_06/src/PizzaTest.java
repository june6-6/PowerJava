class Circle {
	protected int radius;
	public Circle(int r) {
		radius = r;
	}
}

class Pizza extends Circle {
	String topping;
	
	public Pizza(String topping, int r)	{
		super(r);
		this.topping = topping;
	}
	
	public void print() {
		System.out.println("파자의 종류: " + topping + ", 피자의 크기: " + radius);
	}
}
public class PizzaTest {

	public static void main(String[] args) {
		Pizza pizza = new Pizza("페페로니", 20	);
		System.out.println(pizza);
		pizza.print();
	}

}
