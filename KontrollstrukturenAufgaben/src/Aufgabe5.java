import java.util.Scanner;

public class Aufgabe5 {
	
	public static double bestellwert() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Wie hoch ist der Bestellwert?");
		double bestellwerteingabe = myScanner.nextDouble();
		return bestellwerteingabe;
	}
	
	public static void rabattsystem(double bestellcost) {
		if (bestellcost >= 0 && bestellcost <= 100) {
			double mitRabatt = bestellcost * 0.9 * 1.16;
			System.out.printf("Mit einem Rabatt von 10 Prozent liegt der Bestellwert nun bei: %.2f€ incl. Mwst", mitRabatt);
		}
		else if (bestellcost > 100 && bestellcost <= 500) {
			double mitRabatt = bestellcost * 0.85 * 1.16;
			System.out.printf("Mit einem Rabatt von 15 Prozent liegt der Bestellwert nun bei: %.2f€ incl. Mwst", mitRabatt);
		}
		else {
			double mitRabatt = bestellcost * 0.80 * 1.16;
			System.out.printf("Mit einem Rabatt von 20 Prozent liegt der Bestellwert nun bei: %.2f€ incl. Mwst", mitRabatt);
		}
	}
	public static void main(String[] args) {
		double bW = bestellwert();
		rabattsystem(bW);

	}

}
