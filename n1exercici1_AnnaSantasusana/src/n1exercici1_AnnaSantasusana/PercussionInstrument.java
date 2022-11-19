package n1exercici1_AnnaSantasusana;

public class PercussionInstrument extends Instrument{

	static {
		System.out.println("Instruments are ready to play");
	}
	
	{
		System.out.println("Percussion instruments begin to play");
	}
	
	public PercussionInstrument(String name, float price) {
		super(name, price);
	}
	
	public String playInstrument() {
		return "A percussion instrument is playing";
	}
	
	public String toString() {
		return "Instrument name: " + super.getName() + ", Instrument price: " + super.getPrice() + "€";
	}
	
}
