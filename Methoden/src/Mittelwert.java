import java.util.Scanner;

public class Mittelwert {
	
	public static double verarbeitung(double pZahl1,double pZahl2) {
		
		double ergebnis;
		ergebnis = (pZahl1 + pZahl2) / 2;
		return ergebnis;
	}

	public static void main(String[] args) {
		
		 Scanner meinScanner = new Scanner(System.in); //2
	     
		 //Deklaration der Variablen
	     double zahl1;
	     double zahl2;
	     double mittelwert;
	      
	     
	     // (E) "Eingabe"
	     // Werte für x und y festlegen/Deklaration der Variablen:
	     // ===========================
	     
	     System.out.print("Wie lautet der erste Wert: ");
	     zahl1 = meinScanner.nextDouble();
	    
	     System.out.print("Wie lautet der zweite Wert: ");
	     zahl2 = meinScanner.nextDouble();
	     
	     // (V) Verarbeitung
	     // Mittelwert von x und y berechnen: 
	     // ================================
	     // mittelwert = (zahl1 + zahl2) / 2.0;
	     
	     mittelwert = verarbeitung(zahl1, zahl2);
	      
	     // (A) Ausgabe
	     // Ergebnis auf der Konsole ausgeben:
         // =================================
	     
	     System.out.printf("Der Mittelwert von %.2f und %.2f ist %.2f\n", zahl1, zahl2, mittelwert);
	   }
	}

