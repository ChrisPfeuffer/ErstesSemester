import java.util.Scanner;

class Fahrkartenautomat_ChristianPfeuffer_FI_C01
{
	static Scanner tastatur = new Scanner(System.in);
	static double gesamtKosten;
	static double bGesamt;
	static double r�ckgabebetrag;
    static double zuZahlenderBetrag = 0; 
    static byte anzahlFahrkarte = 0;
    
	
	public static double fahrkartenbestellungErfassen(double kosten, byte anzahl){
		
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
	
	public static void fahrkartenBezahlen(Scanner tastatur) {
	       double eingeworfeneM�nze = 0;
	       while(bGesamt < gesamtKosten)
	       {
	    	   System.out.printf("Noch zu zahlen: %1.2f �\n", gesamtKosten - bGesamt);
	    	   System.out.print("Eingabe (mind. 5Ct, h�chstens 2 Euro): ");
	    	   eingeworfeneM�nze = tastatur.nextDouble();
	           bGesamt += eingeworfeneM�nze;
	       }
	}
	
	public static void warte(int millisekunde) {
	       System.out.println("\nFahrschein/e wird ausgegeben");
	       for (int i = 0; i < millisekunde; i++)
	       {
	          System.out.print("=");
	          try {			Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	       }
	       System.out.println("\n\n");
	}
	
	public static void muenzeAusgeben() {
		r�ckgabebetrag = bGesamt - gesamtKosten + 0.001; //Sonst wird falsch gerundet
		if(r�ckgabebetrag > 0.0)
		{
			System.out.printf("Der R�ckgabebetrag in H�he von %.2f EURO\n", r�ckgabebetrag);
			System.out.println("wird in folgenden M�nzen ausgezahlt:");

			while(r�ckgabebetrag >= 2.00) // 2 EURO-M�nzen
			{
				System.out.println("2 EURO");
				r�ckgabebetrag -= 2.00;
			}
			while(r�ckgabebetrag >= 1.00) // 1 EURO-M�nzen
			{
				System.out.println("1 EURO");
				r�ckgabebetrag -= 1.00;
			}
			while(r�ckgabebetrag >= 0.50) // 50 CENT-M�nzen
			{
				System.out.println("50 CENT");
				r�ckgabebetrag -= 0.50;
			}
			while(r�ckgabebetrag >= 0.20) // 20 CENT-M�nzen
			{
				System.out.println("20 CENT");
				r�ckgabebetrag -= 0.20;
			}
			while(r�ckgabebetrag >= 0.10) // 10 CENT-M�nzen
			{
				System.out.println("10 CENT");
				r�ckgabebetrag -= 0.10;
			}
			while(r�ckgabebetrag >= 0.05)// 5 CENT-M�nzen
			{
				System.out.println("5 CENT");
				r�ckgabebetrag -= 0.05;
			}
		}

		System.out.println("\nVergessen Sie nicht, den/die Fahrschein/e\n"+
							"vor Fahrtantritt entwerten zu lassen!\n"+
                       		"Wir w�nschen Ihnen eine gute Fahrt.");
	}
    public static void main(String[] args)
    {
   
       //Bestellung
       gesamtKosten = fahrkartenbestellungErfassen(zuZahlenderBetrag, anzahlFahrkarte);
       
       // Geldeinwurf
       fahrkartenBezahlen(tastatur);
       
       // Fahrscheinausgabe  
       warte(10);

       // R�ckgeldberechnung und -Ausgabe
       muenzeAusgeben();
    }
}