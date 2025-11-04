class Car {
	String color;
	int speed;
	int gear;
	
	@Override
	public String toString() {
		return "색상: " + color + ", 속도: " + speed + ", 기어: " + gear;
	}
	
	void changeGear(int g) { gear = g; }
	void speedUp() { speed = speed + 10; }
	void speedDown() { speed = speed - 10; }
}
public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);
		
		myCar.speedUp();
		System.out.println(myCar);
		
		Car herCar = new Car();
		herCar.color = "red";
		herCar.speed = 30;
		herCar.gear = 2;
		herCar.speedDown();
		System.out.println(herCar);
	}

}
