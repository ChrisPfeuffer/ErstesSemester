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
		          try {			Thread.sleep(200);
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
	
	public static void muenzeAusgeben(double gesamtKosten, double bGesamt) {
		double r�ckgabebetrag = bGesamt - gesamtKosten; //Math round soll helfen
		
		if(r�ckgabebetrag > 0.0)
		{
			System.out.printf("Der R�ckgabebetrag in H�he von %.2f EURO\n", r�ckgabebetrag);
			System.out.println("wird in folgenden M�nzen ausgezahlt:");
			while(r�ckgabebetrag >= 2.00) // 2 EURO-M�nzen
			{
				System.out.println("2 EURO");
				r�ckgabebetrag -= 2.00;
				r�ckgabebetrag = Math.round(100.0* r�ckgabebetrag) / 100.0;
			}
			while(r�ckgabebetrag >= 1.00) // 1 EURO-M�nzen
			{
				System.out.println("1 EURO");
				r�ckgabebetrag -= 1.00;
				r�ckgabebetrag = Math.round(100.0* r�ckgabebetrag) / 100.0;
			}
			while(r�ckgabebetrag >= 0.50) // 50 CENT-M�nzen
			{
				System.out.println("50 CENT");
				r�ckgabebetrag -= 0.50;
				r�ckgabebetrag = Math.round(100.0* r�ckgabebetrag) / 100.0;
			}
			while(r�ckgabebetrag >= 0.20) // 20 CENT-M�nzen
			{
				System.out.println("20 CENT");
				r�ckgabebetrag -= 0.20;
				r�ckgabebetrag = Math.round(100.0* r�ckgabebetrag) / 100.0;
			}
			while(r�ckgabebetrag >= 0.10) // 10 CENT-M�nzen
			{
				System.out.println("10 CENT");
				r�ckgabebetrag -= 0.10;
				r�ckgabebetrag = Math.round(100.0* r�ckgabebetrag) / 100.0;
			}
			while(r�ckgabebetrag >= 0.05)// 5 CENT-M�nzen
			{
				System.out.println("5 CENT");
				r�ckgabebetrag -= 0.05;
				r�ckgabebetrag = Math.round(100.0* r�ckgabebetrag) / 100.0;
			}
		}

		System.out.println("\nVergessen Sie nicht, den/die Fahrschein/e\n"+
							"vor Fahrtantritt entwerten zu lassen!\n"+
                       		"Wir w�nschen Ihnen eine gute Fahrt.");
	}
    public static void main(String[] args)
    {
  
    	// Bestellung
    	double gesamtKosten = fahrkartenbestellungErfassen();
       
    	// Geldeinwurf
    	double betragEinbezahlt = fahrkartenBezahlen(gesamtKosten);
    	
    	// Fahrscheinausgabe 
    	fahrkartenAusgeben();
    	
    	// Warteschleife erstellen
    	warte(10);

    	// R�ckgeldberechnung und -Ausgabe
    	muenzeAusgeben(gesamtKosten, betragEinbezahlt);
    }
}