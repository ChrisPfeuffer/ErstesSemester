import java.util.Scanner;


public class PCHaendler {
	static Scanner myScanner = new Scanner(System.in);

	
	public static String liesString(String text) {
		System.out.println(text);
		String artikel = myScanner.next();
		return artikel;
	}
	public static int liesInt(String text) {
		System.out.println(text);
		int anzahlBestellung = myScanner.nextInt();
		return anzahlBestellung;
	}
	public static double liesDouble(String text) {
		System.out.println(text);
		double wert = myScanner.nextDouble();
		return wert;
	}
	public static double berechneGesamtnettopreis(int anzahl, double preis) {
		double nettogesamtpreis = anzahl * preis;
		return nettogesamtpreis;
	}
	public static double berechneGesamtbruttopreis(double nettogesamtpreis, double mwst) {
		double bruttogesamtpreis = nettogesamtpreis * (1 + mwst / 100);
		return bruttogesamtpreis;
	}
	public static void rechnungausgeben(String artikel, int anzahl, double nettogesamtpreis, double bruttogesamtpreis, double mwst) {
		System.out.println("\tRechnung");
		System.out.printf("\t\t Netto:  %-20s %6d %10.2f %n", artikel, anzahl, nettogesamtpreis);
		System.out.printf("\t\t Brutto: %-20s %6d %10.2f (%.1f%s)%n", artikel, anzahl, bruttogesamtpreis, mwst, "%");
	}
	
	public static void main(String[] args) {
		
		String artikel = liesString("Was moechten Sie bestellen?");
		int anzahl = liesInt("Geben Sie die Anzahl ein:");
		double mwst = liesDouble("Geben Sie den Mehrwertsteuersatz in Prozent ein:");
		double preis = liesDouble("Geben Sie den Nettopreis ein:");
		double nettogesamtpreis = berechneGesamtnettopreis(anzahl, preis);
		double bruttogesamtpreis = berechneGesamtbruttopreis(nettogesamtpreis, mwst);
		rechnungausgeben(artikel, anzahl, nettogesamtpreis, bruttogesamtpreis, mwst);
	}

}
