// 접근 제어: 클래스의 멤버(필드, 메서드)에 접근하는 것을 제어, 정보 은닉 방법 
// private으로 선언한 필드를 외부에서 사용하려면 설정자(setter), 접근자(getter)를 사용 

class Member {
	String name; // 접근 지정자(디폴트 멤버)
	private int point; // 전용 멤버
	public String gender; // 공용 멤버 

	// point 접근자(getter)
	public int getPoint() {
		return point;
	}
	// point 설정자(setter)
	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString() {
		return "이름: " + name + " 포인트: " + point + " 성별: " + gender;
	}
}

public class MemberTest {

	public static void main(String[] args) {
		Member memberHong = new Member();
		
		System.out.println(memberHong);
		
		memberHong.name = "홍길동"; // 디폴트 멤버이므로 접근 가
		// memberHong.point = 1000; // 오류!! private 멤버이기 때문에 접근 불가
		memberHong.setPoint(1000); // point 설정자 메소드를 이용하여 접근
		memberHong.gender = "male"; // public 멤버이기 때문에 접근 가능
		
		System.out.println(memberHong);
		
		System.out.println("이름: " + memberHong.name);
		//System.out.println("포인트: " + memberHong.point);
		System.out.println("포인트: " + memberHong.getPoint());
		System.out.println("성별: " + memberHong.gender);
		
	}

}
