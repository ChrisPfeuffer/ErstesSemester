import java.util.Scanner;

public class Aufgabe4 {
	
	public static double anzahl(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println(text);
		double anzahlKosten = myScanner.nextDouble();
		return anzahlKosten;
	}
	
	public static void aufpreis(double count, double cost){
		if (count >= 10.0) {
			double rechnungsbetrag = (count * cost) * 1.16;
			System.out.printf("Die Bestellung kostet %.2f€", rechnungsbetrag);
		}
		else if(count > 0 && count < 10) {
			double rechnungsbetrag = (count * cost + 10) * 1.16; //Lieferpauschale von 10€
			System.out.printf("Die Bestellung kostet %.2f€", rechnungsbetrag);	
		}
		else {
			System.out.printf("Sie wollen den Preis für %.0f Mäuse berechnen??? Also eine Maus sollte es mindestens sein", count);
		}
	}
	public static void main(String[] args) {
		double anzahlMaeuse = anzahl("Wie viele Mäuse wurden bestellt?");
		double einzelpreisMaus = anzahl("Wie teuer ist eine Maus?");
		aufpreis(anzahlMaeuse, einzelpreisMaus);

	}

}
