package n2exercici1_AnnaSantasusana;

public class Main {

	public static void main(String[] args) {
		
		Smartphone smartphone1 = new Smartphone("Samsung", "Galaxi a13");

		System.out.println(smartphone1.toString());
		System.out.println(smartphone1.call("654328765"));
		System.out.println(smartphone1.toPhotograph());
		System.out.println(smartphone1.alarm());
		
	}
}
