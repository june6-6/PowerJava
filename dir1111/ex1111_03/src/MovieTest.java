import java.util.Scanner;

// 188p 7번 문제
class Movie {
	String title;
	String director;
	String actor;
	int year;
	double rating;
	
	public Movie() {
		
	}
	
	//생성자
	public Movie(String title, String director, String actor, int year, double rating) {
		this.title = title;
		this.director = director;
		this.actor = actor;
		this.year = year;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "제목: " + title + " 감독: " + director + " 주연배우: " + actor + " 연도: " + year + " 평점: " + rating;
	}
	
}
public class MovieTest {

	public static void main(String[] args) {
		Movie movie = new Movie("7번방의 선물", "김정훈", "곽유석", 2025, 10.0);
		
		System.out.println(movie);
		
		Scanner sc = new Scanner(System.in);
		Movie movie2 = new Movie();
		
		movie2.title = sc.nextLine();
		System.out.println(movie2);
		
	}

}
