class Rectangle {
	int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class ColorRectangle extends Rectangle {
	String color;
	
	public ColorRectangle(int initWidth, int initHeight, String initColor) {
		super(initWidth, initHeight);
		color = initColor;
	}
}
public class RectangleTest {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		
		System.out.println("가로: " + obj.width);
		System.out.println("세로: " + obj.height);
		System.out.println("색깔: " + obj.color);
	}

}
