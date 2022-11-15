package n1exercici2_AnnaSantasusana;

public class Main_Car {

	public static void main(String[] args) {
		
		Car.brake();
		System.out.println(Car.brake());
		
		Car audi = new Car();
		System.out.println(audi.accelerate());
		audi.accelerate();
		
		System.out.println(audi.toString());
	}
}
