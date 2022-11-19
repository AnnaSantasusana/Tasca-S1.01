package n1exercici1_AnnaSantasusana;

public abstract class Instrument {

	private String name;
	private float price;
	
	public Instrument(String name, float price) {
		this.name = name;
		this.price = price;
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
