package n1exercici1_AnnaSantasusana;

public class StringInstrument extends Instrument{

	{
		name = "Guitar";
		price = 275;
	}
	
	public StringInstrument() {
		super();
	}
	
	public String playInstrument() {
		return "A string instrument is playing";
	}
	
	public String toString() {
		return "Instrument name: " + this.name + ", Instrument price: " + this.price + "€";
	}
}
