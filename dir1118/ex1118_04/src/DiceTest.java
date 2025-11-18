// 주사위를 Dice 클래스로 모델링한다. Dice 클래스는 주사위면(face)을 필드로 가지고 있고 roll(), getValue(), setValue() 등의 메소드를 가지고 있다.
// 생성자에서는 주사위면을 0으로 초기화한다.  2개의 주사위 객체를 생성해서 주사위를 반복하여 던진다. 
// 두 주사위 값의 합이 2가 되면 반복을 종료하고 2가 나오는데 걸린 횟수를 화면에 출력한다.
class Dice {
	private int face;
	public Dice() {face = 0;}
	
	public int getValue() {
		return face;
	}
	public void setValue(int face) {
		this.face = face;
	}
	
	public void roll() {
		face = (int)(Math.random() * 6) + 1;
	}
	
}
public class DiceTest {

	public static void main(String[] args) {
		int rollCount = 0;
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		do {
			d1.roll();
			d2.roll();
			System.out.println("주사위1 = " + d1.getValue() + " 주사위2 = " + d2.getValue());

			rollCount++;
		} while((d1.getValue() + d2.getValue()) != 2);
		
		System.out.println("(1,1)이 나오는데 걸리는 횟수: " + rollCount);
	}

}


//class Dice {
//	private int face;		//주사위 값, 전용 멤버
//	public Dice() {	face = 0;  }	//생성자
//
//	public void roll() {	//주사위 굴리기
//		face = (int) (Math.random() * 6) + 1;
//	}                                            
//
//	public int getValue() { 	return face;  }  //접근자
//	public void setValue(int face) {  this.face = face;  }  //설정자
//}	
//public class Test {	
//	public static void main(String[] args) {
//		int rollCount = 0;	    //시도 횟수
//		Dice dice1 = new Dice();    //주사위1 객체 생성 
//		Dice dice2 = new Dice();    //주사위2 객체 생성
//
//		do {
//			dice1.roll();
//			dice2.roll();
//                        System.out.println("주사위1 = " + dice1.getValue() + " 주사위2 = " + dice2.getValue());
//			rollCount++;   //시도 횟수 누적
//		} while ((dice1.getValue() + dice2.getValue()) != 2);
//
//		System.out.println("(1, 1)이 나오는데 걸린 횟수= " + rollCount);
//	}
//} 