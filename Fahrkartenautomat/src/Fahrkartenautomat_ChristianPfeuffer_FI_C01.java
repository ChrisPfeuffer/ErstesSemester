import java.util.Scanner;

class Fahrkartenautomat_ChristianPfeuffer_FI_C01
{
	static Scanner tastatur = new Scanner(System.in);
	static double gesamtKosten;
	static double bGesamt;
	static double rückgabebetrag;
    static double zuZahlenderBetrag = 0; 
    static byte anzahlFahrkarte = 0;
    
	
	public static double fahrkartenbestellungErfassen(double kosten, byte anzahl){
		System.out.print("Zu zahlender Betrag (EURO): ");
	    double p1 = tastatur.nextDouble();
       
	    System.out.print("Wieviel Fahrkarten wollen Sie? ");
	    byte p2 = tastatur.nextByte();
	    if (p2 <= 10 && p2 > 0) {
	    	double gesamtKosten = p1 * p2;
	    	return gesamtKosten;
	    }
	    else {
	    	System.out.println("Wenn ich Sie richtig verstanden habe, wollen Sie also eine Karte?!");
	    	double gesamtKosten = p1 * 1;
	    	return gesamtKosten;
	    	
	    }
	}
	
	public static void fahrkartenBezahlen(Scanner tastatur) {
	       double eingeworfeneMünze = 0;
	       while(bGesamt < gesamtKosten)
	       {
	    	   System.out.printf("Noch zu zahlen: %1.2f €\n", gesamtKosten - bGesamt);
	    	   System.out.print("Eingabe (mind. 5Ct, höchstens 2 Euro): ");
	    	   eingeworfeneMünze = tastatur.nextDouble();
	           bGesamt += eingeworfeneMünze;
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
		rückgabebetrag = bGesamt - gesamtKosten + 0.001; //Sonst wird falsch gerundet
		if(rückgabebetrag > 0.0)
		{
			System.out.printf("Der Rückgabebetrag in Höhe von %.2f EURO\n", rückgabebetrag);
			System.out.println("wird in folgenden Münzen ausgezahlt:");

			while(rückgabebetrag >= 2.00) // 2 EURO-Münzen
			{
				System.out.println("2 EURO");
				rückgabebetrag -= 2.00;
			}
			while(rückgabebetrag >= 1.00) // 1 EURO-Münzen
			{
				System.out.println("1 EURO");
				rückgabebetrag -= 1.00;
			}
			while(rückgabebetrag >= 0.50) // 50 CENT-Münzen
			{
				System.out.println("50 CENT");
				rückgabebetrag -= 0.50;
			}
			while(rückgabebetrag >= 0.20) // 20 CENT-Münzen
			{
				System.out.println("20 CENT");
				rückgabebetrag -= 0.20;
			}
			while(rückgabebetrag >= 0.10) // 10 CENT-Münzen
			{
				System.out.println("10 CENT");
				rückgabebetrag -= 0.10;
			}
			while(rückgabebetrag >= 0.05)// 5 CENT-Münzen
			{
				System.out.println("5 CENT");
				rückgabebetrag -= 0.05;
			}
		}

		System.out.println("\nVergessen Sie nicht, den/die Fahrschein/e\n"+
							"vor Fahrtantritt entwerten zu lassen!\n"+
                       		"Wir wünschen Ihnen eine gute Fahrt.");
	}
    public static void main(String[] args)
    {
   
       //Bestellung
       gesamtKosten = fahrkartenbestellungErfassen(zuZahlenderBetrag, anzahlFahrkarte);
       
       // Geldeinwurf
       fahrkartenBezahlen(tastatur);
       
       // Fahrscheinausgabe  
       warte(10);

       // Rückgeldberechnung und -Ausgabe
       muenzeAusgeben();
    }
}