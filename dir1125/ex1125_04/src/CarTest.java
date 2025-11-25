class Car {
	String model;
	String make;
	static int numberOfCars;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}
	
	public static void setNumberOfCars(int num) {
		numberOfCars = num;
	}

	public Car(String model, String make) {
		this.model = model;
		this.make = make;
		numberOfCars++;
		System.out.println("자동차 1대 생산, 누적 생산량 = " + numberOfCars + "");
	}
	
	
}
public class CarTest {

	public static void main(String[] args) {
		new Car("소나타", "현대");
		new Car("캐스퍼", "현대");
		new Car("아반떼", "현대");
		new Car("소나타", "현대");
	}

}
