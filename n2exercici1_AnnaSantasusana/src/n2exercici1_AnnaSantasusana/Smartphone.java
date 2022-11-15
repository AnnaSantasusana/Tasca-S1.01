package n2exercici1_AnnaSantasusana;

public class Smartphone extends Phone implements Camera, Watch {
	
	public Smartphone(String brand, String model) {
		super(brand, model);
	}
	
	//Implementar interficies
	@Override
	public String toPhotograph() {
		return "A photo is being taken";
	}
	
	@Override
	public String alarm() {
		return "The alarm is sounding";
	}

	public String toString() {
		return "Phone brand: " + super.getBrand() + ", phone model: " + super.getModel();
	}

	
}
