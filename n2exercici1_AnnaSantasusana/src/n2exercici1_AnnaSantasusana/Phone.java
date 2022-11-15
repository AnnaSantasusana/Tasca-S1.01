package n2exercici1_AnnaSantasusana;

public class Phone {

	//Atributs
	private String brand;
	private String model;
	
	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	//Getters
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	//Setters
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	//Mètodes generals
	public String call(String numTelefon) {
		return "Calling to " + numTelefon;
	}
	
	
	
	
}
