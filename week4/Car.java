public class Car {
	
	public String name;
	public int price;
	public int age;
	public String color;
	
	public Car(String name, int price, int age, String color) {
		this.name = name;
		this.price = price;
		this.age = age;
		this.color=color;
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Car car = new Car("new model", 3000, 1, "Red");
	}

}
