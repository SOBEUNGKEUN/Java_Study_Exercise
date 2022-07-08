public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle area =" + getArea();

	}
}
