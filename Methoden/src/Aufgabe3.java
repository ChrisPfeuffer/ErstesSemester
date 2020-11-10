
public class Aufgabe3 {
	public static double reihenschaltung(double r1, double r2) {
		double ersatzwiderstand = r1 + r2;
		return ersatzwiderstand;
	}
	public static void main(String[] args) {

		double ersatzwiderstand = reihenschaltung(12,13);
		System.out.println("Der Ersatzwiderstand ist: " + ersatzwiderstand);

	}

}
