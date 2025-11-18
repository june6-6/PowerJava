class Dog {
	private String name;
	public String bread;
	private int age;
	
	@Override
	public String toString() {
		return "이름: " + name + " 품종: " + bread + " 나이: " + age;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Dog(String name, String bread, int age) {
		this.name = name;
		this.bread = bread;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void barking() {
		System.out.println("멍멍멍!!!");
	}
	
}
public class DogTest {

	public static void main(String[] args) {
		Dog dog1 = new Dog("백구", "진돗개", 2);
		System.out.println(dog1);
		dog1.barking();
		
		Dog dog2 = new Dog("해피", 3);
		System.out.println(dog2);
		dog2.bread = "푸들";
		System.out.println(dog2);
	}

}
