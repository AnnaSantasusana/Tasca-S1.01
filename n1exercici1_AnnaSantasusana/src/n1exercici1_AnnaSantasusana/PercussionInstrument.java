package n1exercici1_AnnaSantasusana;

public class PercussionInstrument extends Instrument{

	{
		name = "Drums";
		price = 666;
	}
	
	public PercussionInstrument() {
		super();
	}
	
	public String playInstrument() {
		return "A percussion instrument is playing";
	}
	
	public String toString() {
		return "Instrument name: " + this.name + ", Instrument price: " + this.price + "€";
	}
}
