package n1exercici2_AnnaSantasusana;

public class Main_Car {

	public static void main(String[] args) {
		
		//Poso com a marca "Mazda", però marca és un atribut
		//static final, i per tant s'imprimirà "Audi"
		Car car1 = new Car("Mazda", "A4", 150);
		Car.setModel("A3");
		System.out.println(car1.toString());
		System.out.println(car1.accelerate());
		System.out.println(Car.brake());
		
		Car car2 = new Car("Q5", 200);
		System.out.println(car2.toString());
		System.out.println(car2.accelerate());
		System.out.println(Car.brake());
		
	}
}
