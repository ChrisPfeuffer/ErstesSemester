import java.util.Scanner;

public class Aufgabe6 {

	
	public static void ansage() {
		System.out.println("Das Auto kann Geschwindigkeiten von 0-130km/h erreichen");
		System.out.println("Du startest Bei 0km/h. Um wie viel km/h willst du schneller bzw. langsamer fahren?");
	}
	
	public static double beschleunige(double v, double dv) {
		Scanner myScanner = new Scanner(System.in);
		double geschwEingabe = myScanner.nextDouble();
		double aktuelleGeschw = dv + geschwEingabe;
		if (aktuelleGeschw < 0) {
			System.out.println("Fehler. Du kannst nicht langsamer als 0km/h fahren");
			return 0; //Oder dv, wenn sich die geschw nicht aendert
		} 
		else if (aktuelleGeschw > 130) {
			System.out.println("Fehler. Du kannst nicht schneller als 130km/h fahren");
			return 130; //Oder dv, wenn sich die geschw nicht aendert
		}
		else { 
			return aktuelleGeschw;
		}
	}
	
	public static void main(String[] args) {
		double neueGeschw = 0.0;
		double extraGas = 0.0;

		ansage();
		for (int i = 0; i<5; i++) {
			neueGeschw = beschleunige(extraGas, neueGeschw);
			System.out.println("Die aktuelle Geschwindigkeit beträgt: " + neueGeschw + "km/h");
		}
	}
}
