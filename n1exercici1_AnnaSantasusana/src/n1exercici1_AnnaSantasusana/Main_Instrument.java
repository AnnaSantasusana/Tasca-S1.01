package n1exercici1_AnnaSantasusana;

public class Main_Instrument {

	public static void main(String[] args) {
		
		Instrument trumpet = new WindInstrument();
		System.out.println(trumpet.toString());
		System.out.println(trumpet.playInstrument() + "\n");
		
		Instrument guitar = new StringInstrument();
		System.out.println(guitar.toString());
		System.out.println(guitar.playInstrument() + "\n");
		
		Instrument drums = new PercussionInstrument();
		System.out.println(drums.toString());
		System.out.println(drums.playInstrument() + "\n");

	}
}
