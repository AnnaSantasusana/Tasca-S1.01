package n1exercici2_AnnaSantasusana;

public class Main_Car {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.toString());
		System.out.println(car1.accelerate());
		System.out.println(Car.brake());
		
		Car car2 = new Car("Q5");
		System.out.println(car2.toString());
		System.out.println(car2.accelerate());
		System.out.println(Car.brake());
		
	}
}
