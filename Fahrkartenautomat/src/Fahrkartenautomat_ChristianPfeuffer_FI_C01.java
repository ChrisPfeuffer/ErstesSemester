import java.util.Scanner;

class Fahrkartenautomat_ChristianPfeuffer_FI_C01
{
	public static double fahrkartenbestellungErfassen(){
		Scanner tastatur = new Scanner(System.in);
		double neukosten = 0.0;
		double neukostenExtra = 0.0;
		byte eingabeFahrkarten;
		int eingabeFahrkartenanzahl;
		boolean weiterEinkaufen = true;
		String[] bezeichnung = {"Einzelfahrschein Berlin AB", "Einzelfahrschein Berlin BC", "Einzelfahrschein Berlin ABC", "Kurzstrecke", "Tageskarte Berlin AB", "Tageskarte Berlin BC", "Tageskarte Berlin ABC", "Kleingruppen-Tageskarte Berlin AB", "Kleingruppen-Tageskarte Berlin BC", "Kleingruppen-Tageskarte Berlin ABC"};
		double[] preisInEuro = {2.90, 3.30, 3.60, 1.90, 8.60, 9.00, 9.60, 23.50, 24.30, 24.90};
		
		
		System.out.println("Fahrkartenbestellvorgang:");
		
		do {
			System.out.println("=====================================================");
			for(int i = 0; i < bezeichnung.length; i++) {
				System.out.printf("%-5d %-40s %5.2f�\n", i + 1, bezeichnung[i], preisInEuro[i]);
			}
			if(weiterEinkaufen == true) {
				System.out.println("=====================================================");
				
				
				System.out.print("Welche Fahrkarte h�tten Sie gerne? ");
				eingabeFahrkarten = tastatur.nextByte();

				System.out.print("Wie viele davon wollen Sie? ");
				eingabeFahrkartenanzahl = tastatur.nextInt();
				System.out.printf("\n");
				
				if(eingabeFahrkartenanzahl < 11 && eingabeFahrkartenanzahl > 0 && eingabeFahrkarten > 0 && eingabeFahrkarten < 11) {
					eingabeFahrkarten -= 1;
					neukosten = preisInEuro[eingabeFahrkarten] * eingabeFahrkartenanzahl;
				}
				else if (eingabeFahrkarten < 11 && eingabeFahrkarten > 0){
					neukosten = preisInEuro[eingabeFahrkarten] * 1;
					System.out.println("Sie haben mehr als 10 Karten bestellt. In diesem Fall erhalten Sie nur ein Ticket.\n");
				} else {
					System.out.println("Sie haben keine g�ltige Fahrkarte ausgew�hlt.");
				}
				
				System.out.print("Wollen Sie noch andere Fahrkarten? (J/N)");
				char andereFahrkarten = tastatur.next().toUpperCase().charAt(0);
				if(andereFahrkarten == 'J') {
					weiterEinkaufen = true;
				}
				else {
					weiterEinkaufen = false;
				}
			}
			neukostenExtra += neukosten;
		} while(weiterEinkaufen == true);
		
	    double gesamtKosten = neukostenExtra;
    	return gesamtKosten;
	}
	
	public static double fahrkartenBezahlen(double zuZahlen) {
		Scanner tastatur = new Scanner(System.in);
		double r�ckgabeBetrag = 0;
		double eingeworfeneM�nze = 0;
		while(r�ckgabeBetrag < zuZahlen)
		{
			System.out.printf("Noch zu zahlen: %1.2f �\n", zuZahlen - r�ckgabeBetrag);
			System.out.print("Eingabe (mind. 5Ct, h�chstens 2 Euro): ");
			eingeworfeneM�nze = tastatur.nextDouble();
			r�ckgabeBetrag += eingeworfeneM�nze;
		}
		return r�ckgabeBetrag;
	}
	
	public static void fahrkartenAusgeben() {
		System.out.println("\nFahrschein/e wird ausgegeben");
	}
	
	public static void warte (int millisekunde) {
		for (int i = 0; i < millisekunde; i++)
		{
			System.out.print("=");
			try {Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}
	
	public static void muenzenAusgeben(int betrag, String einheit) {
        System.out.println(betrag + einheit);
    }
	
	public static void rueckgeldAusgeben(double gesamtKosten, double eingezahlt) {
		double rueckgabebetrag = eingezahlt - gesamtKosten; //Math round soll helfen
		
		if(rueckgabebetrag > 0.0)
		{
			System.out.printf("Der R�ckgabebetrag in H�he von %.2f EURO\n", rueckgabebetrag);
			System.out.println("wird in folgenden M�nzen ausgezahlt:");
			while(rueckgabebetrag >= 2.00) // 2 EURO-M�nzen
			{
				muenzenAusgeben(2, "�");
				rueckgabebetrag -= 2.00;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 1.00) // 1 EURO-M�nzen
			{
				muenzenAusgeben(1, "�");
				rueckgabebetrag -= 1.00;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 0.50) // 50 CENT-M�nzen
			{
				muenzenAusgeben(50, "�");
				rueckgabebetrag -= 0.50;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 0.20) // 20 CENT-M�nzen
			{
				muenzenAusgeben(20, "�");
				rueckgabebetrag -= 0.20;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 0.10) // 10 CENT-M�nzen
			{
				muenzenAusgeben(10, "�");
				rueckgabebetrag -= 0.10;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 0.05)// 5 CENT-M�nzen
			{
				muenzenAusgeben(5, "�");
				rueckgabebetrag -= 0.05;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
		}

		System.out.println("\nVergessen Sie nicht, den/die Fahrschein/e\n"+
							"vor Fahrtantritt entwerten zu lassen!\n"+
                       		"Wir w�nschen Ihnen eine gute Fahrt.");
		for (int i = 0; i < 30; i++)
		{
			System.out.print("-");
			try {Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
	}
	
    public static void main(String[] args)
    {
    	while(true) {

	    	// Bestellung
	    	double zuzahlendenBetrag = fahrkartenbestellungErfassen();

	    	// Geldeinwurf
	    	double betragEinbezahlt = fahrkartenBezahlen(zuzahlendenBetrag);
	    	
	    	// Fahrscheinausgabe 
	    	fahrkartenAusgeben();
	    	
	    	// Warteschleife erstellen
	    	warte(10);
	
	    	// R�ckgeldberechnung und -Ausgabe
	    	rueckgeldAusgeben(zuzahlendenBetrag, betragEinbezahlt);
	    	
	    	System.out.println("Guten Tag werter Kunde. Ihre Bestellung bitte. \n");
	    }
    }
}