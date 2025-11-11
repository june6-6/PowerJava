// this(): 생성자가 다른 생성자를 호출할 때 사용 
// 흔히 가장 복잡한 생성자를 작성한 후에 다른 생성자는 이 복잡한 생성자를 호출하게끔 하는 경우에 사용 
// 반드시 생성자 안에서만 호출 가능, 반드시 생성자의 첫 번째 문장이야 함
// 같은 클래스 내의 다른 생성자를 호출할 때만 사용해야 함 	

class Book {
	String title; // 책 제목
	String author; // 책 저자 
	
	// 매개변수가 1개인 생성자 
	public Book(String title) {
		this(title, "저자미상");
		System.out.println("1개의 매개변수가 있는 생성자 호출됨!");
	}
	
	// 매개변수가 2개인 생성자
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	void show() {
		System.out.println(title + ", " + author);
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book("춘향전");
		b1.show();
		
		Book b2 = new Book("어린왕자", "생택쥐페리");
		b2.show();
	}

}
