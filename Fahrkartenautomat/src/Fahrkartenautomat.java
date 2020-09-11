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
       byte anzahlFahrkarte;
       
       System.out.print("Zu zahlender Betrag (EURO): ");
       zuZahlenderBetrag = tastatur.nextDouble();

       
       System.out.print("Wieviel Fahrkarten wollen Sie? ");
       anzahlFahrkarte = tastatur.nextByte();

       // Geldeinwurf
       // -----------
       eingezahlterGesamtbetrag = 0.0;
       while(eingezahlterGesamtbetrag < zuZahlenderBetrag)
       {
    	   System.out.printf("Noch zu zahlen: %1.2f �\n", zuZahlenderBetrag *anzahlFahrkarte - eingezahlterGesamtbetrag);
    	   System.out.print("Eingabe (mind. 5Ct, h�chstens 2 Euro): ");
    	   eingeworfeneM�nze = tastatur.nextDouble();
           eingezahlterGesamtbetrag += eingeworfeneM�nze;
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

       // R�ckgeldberechnung und -Ausgabe
       // -------------------------------
       r�ckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag * anzahlFahrkarte;
       if(r�ckgabebetrag > 0.0)
       {
    	   System.out.printf("Der R�ckgabebetrag in H�he von %1.2f EURO\n", r�ckgabebetrag);
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
}