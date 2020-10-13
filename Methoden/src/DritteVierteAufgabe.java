import java.util.Scanner;

public class DritteVierteAufgabe {
	static Scanner tastatur = new Scanner(System.in);
	private static double reihenschaltung(double r1, double r2) {

		double rGes;
		double widerstand1;
		double widerstand2;
		
		System.out.println("Wie hoch ist der erste Widerstand der Reihenschaltung?");
		widerstand1 = tastatur.nextDouble();
		System.out.println("Wie hoch ist der zweite Widerstand der Reihenschaltung?");
		widerstand2 = tastatur.nextDouble();
		rGes = widerstand1 + widerstand2;
		
		System.out.printf("Der Ersatzwiderstand der Reihenschaltung beträgt %.2f Ohm.\n\n" , rGes);
		return rGes;
	}
	
	private static double parallelschaltung(double r1, double r2) {

		double rGes;
		double widerstand1;
		double widerstand2;
		
		System.out.println("Wie hoch ist der erste Widerstand der Parallelschaltung?");
		widerstand1 = tastatur.nextDouble();
		System.out.println("Wie hoch ist der zweite Widerstand der Parallelschaltung?");
		widerstand2 = tastatur.nextDouble();
		rGes = (widerstand1 * widerstand2)/(widerstand1 + widerstand2);
		
		System.out.printf("Der Gesamtwiderstand beträgt %.2f Ohm." , rGes);
		return rGes;
	}
	
	public static void trennlinie() {
	       System.out.print("\nNächste Abfrage wird geladen. Bitte warten");
	       for (int i = 0; i < 20; i++)
	       {
	          System.out.print(".");
	          try {			Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	       }
	       System.out.println("\n\n");
	}
	public static void main(String[] args) {
		double reihenschaltungR1 = 0;
		double reihenschaltungR2 = 0;
		double parallelschaltungR1 = 0;
		double parallelschaltungR2 = 0;

		reihenschaltung(reihenschaltungR1, reihenschaltungR2);
		trennlinie();
		parallelschaltung(parallelschaltungR1, parallelschaltungR2);
		
	}

}
