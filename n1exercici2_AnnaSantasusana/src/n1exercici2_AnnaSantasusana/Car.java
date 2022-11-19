package n1exercici2_AnnaSantasusana;

public class Car {
	
	//Atributs
	private static final String BRAND = "Audi";
	private static String model;
	private final int POWER;
	
	//Constructor
	public Car(String model, int POWER) {
		Car.model = model;
		this.POWER = POWER;
	}
	
	public Car(String BRAND, String model, int POWER) {
		Car.model = model;
		this.POWER = POWER;
	}
	
	//Getters
	public static String getBRAND() {
		return BRAND;
	}

	public static String getModel() {
		return model;
	}

	public int getPOWER() {
		return POWER;
	}
	
	//Setter
	public static void setModel(String model) {
		Car.model = model;
	}
	
	//Mètodes generals
	public static String brake() {
		return "Vehicle is braking";
	}
	
	public String accelerate() {
		return "Vehicle is accelerating";
	}
	//Mètode toString
	public String toString() {
		return "Car brand: " + Car.getBRAND() + ", Car model: " + Car.getModel() +
				", Car power: " + this.POWER;
	}
}
