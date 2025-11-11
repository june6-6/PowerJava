// p187 1번 연습문제 	
class Rocket {
	int x, y;
	
	public Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int moveUp() {
		this.y = y + 1;
		return this.y;
	}
	
	@Override
	public String toString() {
		return "로켓의 x좌표: " + x + " y좌표: " + y;
	}
}
public class RocketTest {

	public static void main(String[] args) {
		Rocket rocket = new Rocket(1, 2);
		System.out.println(rocket);
		
		rocket.moveUp();
		System.out.println(rocket);
	}

}
