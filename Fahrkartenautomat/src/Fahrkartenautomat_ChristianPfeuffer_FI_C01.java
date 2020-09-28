import java.util.Scanner;

class Fahrkartenautomat_ChristianPfeuffer_FI_C01
{
    public static void main(String[] args)
    {
       Scanner tastatur = new Scanner(System.in);
      
       double zuZahlenderBetrag; 
       double eingezahlterGesamtbetrag;
       double eingeworfeneMünze;
       double rückgabebetrag;
       byte anzahlFahrkarte;
       
       System.out.print("Zu zahlender Betrag (EURO): ");
       zuZahlenderBetrag = tastatur.nextDouble();

       
       System.out.print("Wieviel Fahrkarten wollen Sie? ");
       anzahlFahrkarte = tastatur.nextByte();

       // Geldeinwurf
       // -----------
       eingezahlterGesamtbetrag = 0.0;
       while(eingezahlterGesamtbetrag < zuZahlenderBetrag * anzahlFahrkarte)
       {
    	   System.out.printf("Noch zu zahlen: %1.2f €\n", zuZahlenderBetrag *anzahlFahrkarte - eingezahlterGesamtbetrag);
    	   System.out.print("Eingabe (mind. 5Ct, höchstens 2 Euro): ");
    	   eingeworfeneMünze = tastatur.nextDouble();
           eingezahlterGesamtbetrag += eingeworfeneMünze;
       }

       // Fahrscheinausgabe
       // -----------------
       System.out.println("\nFahrschein/e wird ausgegeben");
       for (int i = 0; i < 8; i++)
       {
          System.out.print("=");
          try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       System.out.println("\n\n");

       // Rückgeldberechnung und -Ausgabe
       // -------------------------------
       rückgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag * anzahlFahrkarte;
       if(rückgabebetrag >= 0.0)
       {
    	   System.out.printf("Der Rückgabebetrag in Höhe von %1.2f EURO\n", rückgabebetrag);
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
}