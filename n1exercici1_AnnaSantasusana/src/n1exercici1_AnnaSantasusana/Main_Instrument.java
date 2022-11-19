package n1exercici1_AnnaSantasusana;

public class Main_Instrument {

	public static void main(String[] args) {
		
		Instrument wind1 = new WindInstrument("Trumpet", 323.50f);
		System.out.println(wind1.toString());
		System.out.println(wind1.playInstrument() + "\n");
		
		Instrument wind2 = new WindInstrument("Saxophone", 599.99f);
		System.out.println(wind2.toString());
		System.out.println(wind2.playInstrument() + "\n");
		
		Instrument string1 = new StringInstrument("Guitar", 275.00f);
		System.out.println(string1.toString());
		System.out.println(string1.playInstrument() + "\n");
		
		Instrument percussion1 = new PercussionInstrument("Drums", 750.50f);
		System.out.println(percussion1.toString());
		System.out.println(percussion1.playInstrument() + "\n");
		
		Instrument string2 = new StringInstrument("Violin", 300.00f);
		System.out.println(string2.toString());
		System.out.println(string2.playInstrument() + "\n");

	}
	
}
