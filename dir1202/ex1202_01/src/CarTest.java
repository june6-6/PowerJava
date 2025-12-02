class Car {
	int speed;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}

// 전기자동차 
class ElectricCar extends Car {
	int battery;
	public void charge(int amount) {
		battery += amount;
	}
}

public class CarTest {

	public static void main(String[] args) {
		ElectricCar c = new ElectricCar();
		
		// 부모 클래스의 필드, 메소드 사용 	
		c.speed = 10;
		c.setSpeed(60);
		
		// 자식 클래스의 필드, 메소드 사용
		c.battery = 20;
		c.charge(10);
		
		System.out.println("속도: " + c.speed + " " + "배터리: " + c.battery);
		
}
}
