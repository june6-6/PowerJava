// ppt 43 미니 프로젝트
import java.util.Scanner;
import java.util.ArrayList;


class Book {
	String title;
	int score;
	static int count;
	
	public Book(String title, int score) {
		this.title = title;
		this.score = score;
		count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Book [title= " + title + ", score= " + score + "]";
	}
	
	
	
}
public class BookTest {

	public static void main(String[] args) {	
		ArrayList<Book> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("================================");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 검색");
			System.out.println("3. 모든 책 출력");
			System.out.println("4. 종료");
			System.out.println("================================");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("등록할 책 제목: ");
				String title = sc.nextLine();
				System.out.println("등록할 책 평점: ");
				int score = sc.nextInt();
				
				list.add(new Book(title, score));
				break;
			case 2:
				System.out.println("책 제목: ");
				String title2 = sc.nextLine();
				
				for (Book e : list) {
					if(e.getTitle().equals(title2)) {
						System.out.println(e);
					}
				}
				break;  
			case 3:
				for (Book e : list) {
					System.out.println(e);
				}
				break;
			case 4:
				System.out.println("지금까지 입력한 책의 권수: " + Book.count);
				return;
			}
		}
	}

}
