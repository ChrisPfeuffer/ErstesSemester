import java.util.Scanner;

class Fahrkartenautomat_ChristianPfeuffer_FI_C01
{
	public static double fahrkartenbestellungErfassen(){
		Scanner tastatur = new Scanner(System.in);
		String fahrpreise = "\n W�hlen Sie\r\n"
				+ "  Einzelfahrschein (1)\r\n"
				+ "  Tageskarte (2)\r\n"
				+ "  Kleingruppe (3) \n"
				+ "  Bezahlen (9) \n \n";
		double neukosten = 0.0;
		double einzelfahrschein = 2.90;
		double tageskarte = 8.60;
		double kleingruppe = 23.50;
		System.out.print(fahrpreise);
		System.out.print("Ihre Wahl: ");
		byte eingabeFahrkarten = tastatur.nextByte();
		System.out.print("Anzahl Tickets: ");
		byte anzahlFahrkarten = tastatur.nextByte();
		
		if(eingabeFahrkarten == 1 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    neukosten = einzelfahrschein * anzahlFahrkarten;
		    System.out.print(fahrpreise);
		    System.out.print("Ihre Wahl: ");
			eingabeFahrkarten = tastatur.nextByte();
			System.out.print("Anzahl Tickets: ");
			anzahlFahrkarten = tastatur.nextByte();
			
		    if (eingabeFahrkarten == 2 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    	neukosten = neukosten + tageskarte * anzahlFahrkarten;
		    	System.out.print(fahrpreise);
		    	System.out.print("Ihre Wahl: ");
				eingabeFahrkarten = tastatur.nextByte();
				System.out.print("Anzahl Tickets: ");
				anzahlFahrkarten = tastatur.nextByte();
					
				if (eingabeFahrkarten == 3 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
					neukosten = neukosten + kleingruppe * anzahlFahrkarten;
					return neukosten;
				}
				else if (eingabeFahrkarten == 9) {
					return neukosten;
				}
				else {
					System.out.println("Eine richtige Eingabe w�re nett gewesen");
					return neukosten;
				}	
		    }
		    else if(eingabeFahrkarten == 3 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    	neukosten = neukosten + kleingruppe * anzahlFahrkarten;
		    	System.out.print(fahrpreise);
		    	System.out.print("Ihre Wahl: ");
				eingabeFahrkarten = tastatur.nextByte();
				System.out.print("Anzahl Tickets: ");
				anzahlFahrkarten = tastatur.nextByte();
				
				if (eingabeFahrkarten == 2 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
					neukosten = neukosten + tageskarte * anzahlFahrkarten;
					return neukosten;
				}
				else if (eingabeFahrkarten == 9) {
					return neukosten;
				}
				else {
					System.out.println("Eine richtige Eingabe w�re nett gewesen");
					return neukosten;
				}	
		    }
		    else if (eingabeFahrkarten == 9) {
				return neukosten;
			}
			else {
				System.out.println("Eine richtige Eingabe w�re nett gewesen");
				return neukosten;
			}   
		}
		
		else if (eingabeFahrkarten == 2 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    neukosten = tageskarte * anzahlFahrkarten;
		    System.out.print(fahrpreise);
		    System.out.print("Ihre Wahl: ");
			eingabeFahrkarten = tastatur.nextByte();
			System.out.print("Anzahl Tickets: ");
			anzahlFahrkarten = tastatur.nextByte();
			
		    if (eingabeFahrkarten == 1 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    	neukosten = neukosten + einzelfahrschein * anzahlFahrkarten;
		    	System.out.print(fahrpreise);
		    	System.out.print("Ihre Wahl: ");
				eingabeFahrkarten = tastatur.nextByte();
				System.out.print("Anzahl Tickets: ");
				anzahlFahrkarten = tastatur.nextByte();
					
				if (eingabeFahrkarten == 3 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
					neukosten = neukosten + kleingruppe * anzahlFahrkarten;
					return neukosten;
				}
				else if (eingabeFahrkarten == 9) {
					return neukosten;
				}
				else {
					System.out.println("Eine richtige Eingabe w�re nett gewesen");
					return neukosten;
				}	
		    }
		    else if(eingabeFahrkarten == 3 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    	neukosten = neukosten + kleingruppe * anzahlFahrkarten;
		    	System.out.print(fahrpreise);
		    	System.out.print("Ihre Wahl: ");
				eingabeFahrkarten = tastatur.nextByte();
				System.out.print("Anzahl Tickets: ");
				anzahlFahrkarten = tastatur.nextByte();
				
				if (eingabeFahrkarten == 1 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
					neukosten = neukosten + einzelfahrschein * anzahlFahrkarten;
					return neukosten;
				}
				else if (eingabeFahrkarten == 9) {
					return neukosten;
				}
				else {
					System.out.println("Eine richtige Eingabe w�re nett gewesen");
					return neukosten;
				}	
		    }
		    else if (eingabeFahrkarten == 9) {
				return neukosten;
			}
			else {
				System.out.println("Eine richtige Eingabe w�re nett gewesen");
				return neukosten;
			}   
		}
		else if (eingabeFahrkarten == 3 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    neukosten = kleingruppe * anzahlFahrkarten;
		    System.out.print(fahrpreise);
		    System.out.print("Ihre Wahl: ");
			eingabeFahrkarten = tastatur.nextByte();
			System.out.print("Anzahl Tickets: ");
			anzahlFahrkarten = tastatur.nextByte();
			
		    if (eingabeFahrkarten == 1 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    	neukosten = neukosten + einzelfahrschein * anzahlFahrkarten;
		    	System.out.print(fahrpreise);
		    	System.out.print("Ihre Wahl: ");
				eingabeFahrkarten = tastatur.nextByte();
				System.out.print("Anzahl Tickets: ");
				anzahlFahrkarten = tastatur.nextByte();
					
				if (eingabeFahrkarten == 2 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
					neukosten = neukosten + tageskarte * anzahlFahrkarten;
					return neukosten;
				}
				else if (eingabeFahrkarten == 9) {
					return neukosten;
				}
				else {
					System.out.println("Eine richtige Eingabe w�re nett gewesen");
					return neukosten;
				}	
		    }
		    else if(eingabeFahrkarten == 2 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
		    	neukosten = neukosten + tageskarte * anzahlFahrkarten;
		    	System.out.print(fahrpreise);
		    	System.out.print("Ihre Wahl: ");
				eingabeFahrkarten = tastatur.nextByte();
				System.out.print("Anzahl Tickets: ");
				anzahlFahrkarten = tastatur.nextByte();
				
				if (eingabeFahrkarten == 1 && anzahlFahrkarten <= 10 && anzahlFahrkarten > 0) {
					neukosten = neukosten + einzelfahrschein * anzahlFahrkarten;
					return neukosten;
				}
				else if (eingabeFahrkarten == 9) {
					return neukosten;
				}
				else {
					System.out.println("Eine richtige Eingabe w�re nett gewesen");
					return neukosten;
				}	
		    }
		    else if (eingabeFahrkarten == 9) {
				return neukosten;
			}
			else {
				System.out.println("Eine richtige Eingabe w�re nett gewesen");
				return neukosten;
			}   
		}
		else if (eingabeFahrkarten == 9) {
			System.out.print("Danke f�r Ihren Nichtkauf");
		}
		else {
			System.out.println("Eine richtige Eingabe w�re nett gewesen");
			return neukosten;
		}   
		
		
		
		
//		do {
//			System.out.println(fahrpreise);
//			
//			System.out.print("Ihre Wahl: ");
//		    int eingabeFahrkarten = tastatur.nextInt();
//		    switch (eingabeFahrkarten) {
//		    case 1: p1 = einzelfahrschein;
//		    break;
//		    case 2: p1 = tageskarte;
//		    break;
//		    case 3: p1 = kleingruppe;
//		    break;
//		    case 9: p1 = 0.0;
//		    break;
//		    default: System.out.println("Error. Mit Ihrer Eingabe kann ich nichts anfangen.\n \n"
//		    		+ "----------------------------------------------");
//		    		p1 = 0.0;	
//		    }
//		} while (p1 == 0.0);
//	    
//	    while (p2 > 10 || p2 <= 0) {
//	    	System.out.print("Sie k�nnen sich nur maximal 10 Karten kaufen. "
//	    			+ "Eine Karte ist Minimum! \n\nVerschwende nicht meine Zeit");
//	    	for (int i = 0; i < 20; i++)
//		       {
//		          System.out.print(".");
//		          try {Thread.sleep(200);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//		       }
//		       System.out.println("\n\n");
//	    	System.out.print("Wieviel Fahrkarten wollen Sie?");
//	    	p2 = tastatur.nextByte();
//	    }

	    double gesamtKosten = neukosten;
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
	
	    	// R�ckgeldberechnung und -Ausgabe
	    	rueckgeldAusgeben(zuzahlendenBetrag, betragEinbezahlt);
	    	
	    	System.out.println("Guten Tag Werter Kunde. Ihre Bestellung bitte. \n");
	    }
    }
}