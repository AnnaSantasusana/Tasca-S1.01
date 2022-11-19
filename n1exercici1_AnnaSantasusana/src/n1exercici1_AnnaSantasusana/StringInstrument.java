package n1exercici1_AnnaSantasusana;

public class StringInstrument extends Instrument{

	static {
		System.out.println("Instruments are ready to play");
	}
	
	{
		System.out.println("String instruments begin to play");
	}
	
	public StringInstrument(String name, float price) {
		super(name, price);
	}
	
	public String playInstrument() {
		return "A string instrument is playing";
	}
	
	public String toString() {
		return "Instrument name: " + super.getName() + ", Instrument price: " + super.getPrice() + "€";
	}
}
