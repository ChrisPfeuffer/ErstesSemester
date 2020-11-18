import java.util.Scanner;

class Fahrkartenautomat_ChristianPfeuffer_FI_C01
{
	public static double fahrkartenbestellungErfassen(){
		Scanner tastatur = new Scanner(System.in);
		double p1 = 0.0;
		
		while (p1 == 0.0) {
			System.out.println("Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\r\n"
					+ "  Einzelfahrschein Regeltarif AB [2,90 EUR] (1)\r\n"
					+ "  Tageskarte Regeltarif AB [8,60 EUR] (2)\r\n"
					+ "  Kleingruppen-Tageskarte Regeltarif AB [23,50 EUR] (3)\n \n");
			System.out.print("Ihre Wahl: ");
		    int eingabeFahrkarten = tastatur.nextInt();
		    switch (eingabeFahrkarten) {
		    case 1: p1 = 2.90;
		    break;
		    case 2: p1 = 8.60;
		    break;
		    case 3: p1 = 23.50;
		    break;
		    default: System.out.println("Error. Mit Ihrer Eingabe kann ich nichts anfangen.\n \n"
		    		+ "----------------------------------------------");
		    		p1 = 0.0;	
		    }
		}
	    
	    System.out.print("Anzahl Tickets: ");
	    byte p2 = tastatur.nextByte();

	    while (p2 > 10 || p2 <= 0) {
	    	System.out.print("Sie können sich nur maximal 10 Karten kaufen. "
	    			+ "Eine Karte ist Minimum! \n\nVerschwende nicht meine Zeit");
	    	for (int i = 0; i < 20; i++)
		       {
		          System.out.print(".");
		          try {Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		       }
		       System.out.println("\n\n");
	    	System.out.print("Wieviel Fahrkarten wollen Sie?");
	    	p2 = tastatur.nextByte();
	    }

	    double gesamtKosten = p1 * p2;
    	return gesamtKosten;
	}
	
	public static double fahrkartenBezahlen(double zuZahlen) {
		Scanner tastatur = new Scanner(System.in);
		double rückgabeBetrag = 0;
		double eingeworfeneMünze = 0;
		while(rückgabeBetrag < zuZahlen)
		{
			System.out.printf("Noch zu zahlen: %1.2f €\n", zuZahlen - rückgabeBetrag);
			System.out.print("Eingabe (mind. 5Ct, höchstens 2 Euro): ");
			eingeworfeneMünze = tastatur.nextDouble();
			rückgabeBetrag += eingeworfeneMünze;
		}
		return rückgabeBetrag;
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
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f EURO\n", rueckgabebetrag);
			System.out.println("wird in folgenden Münzen ausgezahlt:");
			while(rueckgabebetrag >= 2.00) // 2 EURO-Münzen
			{
				muenzenAusgeben(2, "€");
				rueckgabebetrag -= 2.00;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 1.00) // 1 EURO-Münzen
			{
				muenzenAusgeben(1, "€");
				rueckgabebetrag -= 1.00;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 0.50) // 50 CENT-Münzen
			{
				muenzenAusgeben(50, "¢");
				rueckgabebetrag -= 0.50;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 0.20) // 20 CENT-Münzen
			{
				muenzenAusgeben(20, "¢");
				rueckgabebetrag -= 0.20;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 0.10) // 10 CENT-Münzen
			{
				muenzenAusgeben(10, "¢");
				rueckgabebetrag -= 0.10;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
			while(rueckgabebetrag >= 0.05)// 5 CENT-Münzen
			{
				muenzenAusgeben(5, "¢");
				rueckgabebetrag -= 0.05;
		        rueckgabebetrag = Math.round(rueckgabebetrag * 100.0) / 100.0;
			}
		}

		System.out.println("\nVergessen Sie nicht, den/die Fahrschein/e\n"+
							"vor Fahrtantritt entwerten zu lassen!\n"+
                       		"Wir wünschen Ihnen eine gute Fahrt.");
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
    		System.out.println("Fahrkartenbestellvorgang: \n"
    				+ "========================= \n");
	    	// Bestellung
	    	double zuzahlendenBetrag = fahrkartenbestellungErfassen();
	       
	    	// Geldeinwurf
	    	double betragEinbezahlt = fahrkartenBezahlen(zuzahlendenBetrag);
	    	
	    	// Fahrscheinausgabe 
	    	fahrkartenAusgeben();
	    	
	    	// Warteschleife erstellen
	    	warte(10);
	
	    	// Rückgeldberechnung und -Ausgabe
	    	rueckgeldAusgeben(zuzahlendenBetrag, betragEinbezahlt);
	    	
	    	System.out.println("Guten Tag Werter Kunde. Ihre Bestellung bitte. \n");
	    }
    }
}