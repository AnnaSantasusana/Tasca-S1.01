package n1exercici1_AnnaSantasusana;

public class WindInstrument extends Instrument {
	
	{
		name = "Trumpet";
		price = 350;
	}
	
	public WindInstrument() {
		super();
	}
	
	public String playInstrument() {
		return "A wind instrument is playing";
	}
	
	public String toString() {
		return "Instrument name: " + this.name + ", Instrument price: " + this.price + "€";
	}
}
