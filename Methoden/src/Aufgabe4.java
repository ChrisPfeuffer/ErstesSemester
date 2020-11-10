
public class Aufgabe4 {
	public static double parallelschaltung(double r1, double r2) {
		double ersatzwiderstand = (r1*r1)/(r1+r2);
		return ersatzwiderstand;
	}
	public static void main(String[] args) {
		double ersatzwiderstand = parallelschaltung(14,17);
		System.out.println("Der Ersatzwiderstand der Parallelschaltung beträgt: " + ersatzwiderstand);

	}

}
