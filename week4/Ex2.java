import java.util.ArrayList;
import java.util.List;

import week4.Ex1.CheckCar;
import week4.Ex1.CheckCarForBigAndNotExpensive;

public class Ex2 {

	public static void main(String[] args) {
	List<Car> cars = new ArrayList<>();
	cars.add(new Car("벤츠", 2200, 0, "Black"));
	cars.add(new Car("BMW", 2800, 2, "Green"));
	cars.add(new Car("아우디", 2400, 3, "Blue"));
	cars.add(new Car("폭스바겐", 1800, 1, "Pink"));
	
	printCar(cars, new CheckCar() {
		public boolean test(Car car) {
			return car.age >= 2 && car.price > 2300;
		}
	});
	}

	public static void printCar(List<Car> cars, CheckCar tester) {
		for(Car car : cars) {
			if(tester.test(car)) {
				System.out.println(car);
			}
		}
	}
	
	interface CheckCar{
		boolean test(Car car);
	}
		
}
