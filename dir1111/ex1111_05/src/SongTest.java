// 187p 3번 this()

class Song {
	String title; // 노래 제목 
	String artist; // 가수 
	int length; // 곡의 길이 (단위 초) 	
	
	public Song(String title, String artist, int length) {
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	public Song(String title) {
		this.title = title;
	}
	public Song() {
		this("봄날", "BTS");
	}
	
	void show() {
		System.out.println("제목: " + this.title + " 가수: " + artist + " 곡 길이: " + length);
	}
	
	@Override 
	public String toString() {
		return "제목: " + title + " 가수: " + artist + " 곡 길이: " + length;
	}
}

public class SongTest {

	public static void main(String[] args) {
		Song s1 = new Song("Outward", "Nana", 180);
		Song s2 = new Song("Jambaiya", "Carpenters");
		Song s3 = new Song("Yesterday");
		Song s4 = new Song();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		s4.show();
	}

}
