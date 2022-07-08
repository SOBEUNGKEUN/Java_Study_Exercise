abstract class Shape implements Comparable<Shape> {

	private int x;
	private int y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract double getArea();

	public int compareTo(Shape a) {

		if (getArea() < a.getArea())
			return -1;
		else if (getArea() == a.getArea())
			return 0;
		else
			return 1;

	}

}
