import java.util.Scanner;

class Fahrkartenautomat
{
    public static void main(String[] args)
    {
       Scanner tastatur = new Scanner(System.in);
      
       double zuZahlenderBetrag; 
       double eingezahlterGesamtbetrag;
       double eingeworfeneM�nze;
       double r�ckgabebetrag;

       System.out.print("Zu zahlender Betrag (EURO): ");
       zuZahlenderBetrag = tastatur.nextDouble();

       // Geldeinwurf
       // -----------
       eingezahlterGesamtbetrag = 0.0;
       while(eingezahlterGesamtbetrag < zuZahlenderBetrag)
       {
    	   System.out.println("Noch zu zahlen: " + (zuZahlenderBetrag - eingezahlterGesamtbetrag));
    	   System.out.print("Eingabe (mind. 5Ct, h�chstens 2 Euro): ");
    	   eingeworfeneM�nze = tastatur.nextDouble();
           eingezahlterGesamtbetrag += eingeworfeneM�nze;
       }

       // Fahrscheinausgabe
       // -----------------
       System.out.println("\nFahrschein wird ausgegeben");
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

       // R�ckgeldberechnung und -Ausgabe
       // -------------------------------
       r�ckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
       if(r�ckgabebetrag > 0.0)
       {
    	   System.out.println("Der R�ckgabebetrag in H�he von " + r�ckgabebetrag + " EURO");
    	   System.out.println("wird in folgenden M�nzen ausgezahlt:");

           while(r�ckgabebetrag >= 2.0) // 2 EURO-M�nzen
           {
        	  System.out.println("2 EURO");
	          r�ckgabebetrag -= 2.0;
           }
           while(r�ckgabebetrag >= 1.0) // 1 EURO-M�nzen
           {
        	  System.out.println("1 EURO");
	          r�ckgabebetrag -= 1.0;
           }
           while(r�ckgabebetrag >= 0.5) // 50 CENT-M�nzen
           {
        	  System.out.println("50 CENT");
	          r�ckgabebetrag -= 0.5;
           }
           while(r�ckgabebetrag >= 0.2) // 20 CENT-M�nzen
           {
        	  System.out.println("20 CENT");
 	          r�ckgabebetrag -= 0.2;
           }
           while(r�ckgabebetrag >= 0.1) // 10 CENT-M�nzen
           {
        	  System.out.println("10 CENT");
	          r�ckgabebetrag -= 0.1;
           }
           while(r�ckgabebetrag >= 0.05)// 5 CENT-M�nzen
           {
        	  System.out.println("5 CENT");
 	          r�ckgabebetrag -= 0.05;
           }
       }

       System.out.println("\nVergessen Sie nicht, den Fahrschein\n"+
                          "vor Fahrtantritt entwerten zu lassen!\n"+
                          "Wir w�nschen Ihnen eine gute Fahrt.");
    }
}