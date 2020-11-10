import java.util.Scanner;
public class Aufgabe2 {
	
	public static double nettowert() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Wie teuer ist das Produkt?");
		double kosten = myScanner.nextDouble();
		return kosten;
	}
	
	public static void bruttowert(double netto) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Wollen Sie den vollen Steuersatz zahlen? Antworten Sie mit 'j'.");
		System.out.println("Sonst antworten Sie mit 'n'");
		char antwort = myScanner.next().charAt(0);
		if(antwort == 'J' || antwort == 'j') {
			double bruttoVoll = netto * 1.16;
			System.out.printf("Der ermäßigte Preis beträgt: %.2f€ %n", bruttoVoll);
		} else {
			double bruttoVoll = netto * 1.19;
			System.out.printf("Der volle Preis beträgt: %.2f€ %n", bruttoVoll);
		}
	}

	public static void main(String[] args) {
		double nettopreis = nettowert();
		bruttowert(nettopreis); 

	}

}
