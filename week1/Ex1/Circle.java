public class Circle extends Shape {

	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public double getArea() {
		double a = r * r * 3.14;
		return a;
	}
	@Override
	public String toString() {
		return "Circle area =" + getArea();
	}
}
