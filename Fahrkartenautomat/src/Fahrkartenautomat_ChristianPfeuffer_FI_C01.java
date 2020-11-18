import java.util.Scanner;

class Fahrkartenautomat_ChristianPfeuffer_FI_C01
{
	public static double fahrkartenbestellungErfassen(){
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Zu zahlender Betrag (EURO): ");
	    double p1 = tastatur.nextDouble();
       
	    System.out.print("Wieviel Fahrkarten wollen Sie? ");
	    byte p2 = tastatur.nextByte();

	    while (p2 > 10 || p2 <= 0) {
	    	System.out.print("Sie k�nnen sich nur maximal 10 Karten kaufen. "
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
	    	
	    	System.out.println("Guten Tag Werter Kunde. Ihre Bestellung bitte. \n");
	    }
    }
}