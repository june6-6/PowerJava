// 187p 2번, private

class Person {
	String name;
	private String mobile;
	private String office;
	private String email;
	
	public Person(String n, String m, String o, String e) {
		name = n;
		mobile = m;
		office = o;
		email = e;
	}
	
	@Override 
	public String toString() {
		return "name: " + name + " mobile: " + mobile + " office: " + office + " email: " + email;
	}
	
	// 접근자 setter
	public  void setName(String name) {
		this.name = name;
	}
	public  void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public  void setOffice(String office) {
		this.office = office;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	
	// 접근자 getter
	public String getName() {
		return name;
	}
	public String getMobile() {
		return mobile;
	}
	public String getOffice() {
		return office;
	}
	public String getEmail() {
		return email;
	}
	
}
public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("장지훈", "010-1234-=5678", "중앙", "gmail");
		
		System.out.println(p1);
		System.out.println(p1.getName());
		System.out.println(p1.getMobile());
		System.out.println(p1.getOffice());
		System.out.println(p1.getEmail());
	}

}
