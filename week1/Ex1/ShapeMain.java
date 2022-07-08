import java.util.Arrays;

import java.util.Random;

public class ShapeMain {

	public static void main(String[] args) {
		Random r = new Random();
		Shape[] shapes = new Shape[200];
		for (int i = 0; i < 200;) {
			shapes[i++] = new Rectangle(r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100));
			shapes[i++] = new Circle(r.nextInt(100), r.nextInt(100), r.nextInt(100));
		
		}
		for (int i = 0; i < shapes.length; i++) {
			System.out.print(shapes[i] + "\t");
		}
		System.out.println();
		Arrays.sort(shapes);
		for (int i = 0; i < shapes.length; i++) {
			System.out.print(shapes[i] + "\t");
		}
		System.out.println();	
	}
}
