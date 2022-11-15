package n1exercici1_AnnaSantasusana;

public abstract class Instrument {

	protected String name;
	protected float price;
	
	public Instrument() {
		
	}
	
	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	abstract public String playInstrument();
	
	public String toString() {
		return "Instrument name: " + this.name + ", Instrument price: " + this.price + "€";
	}
}
