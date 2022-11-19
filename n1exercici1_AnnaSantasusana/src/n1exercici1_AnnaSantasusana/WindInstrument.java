package n1exercici1_AnnaSantasusana;

public class WindInstrument extends Instrument {
	
	static {
		System.out.println("Instruments are ready to play");
	}
	
	{
		System.out.println("Wind instruments begin to play");
	}
	
	public WindInstrument(String name, float price) {
		super(name, price);
	}
	
	public String playInstrument() {
		return "A wind instrument is playing";
	}
	
	public String toString() {
		return "Instrument name: " + super.getName() + ", Instrument price: " + super.getPrice() + "€";
	}
	
}
