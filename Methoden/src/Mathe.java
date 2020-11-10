
public class Mathe {
	public static double quadrat(double x) {
		double loesung = x * x;
		return loesung;
	}
	
	public static double hypotenuse(double kathete1, double kathete2) {
		double h = Math.sqrt(kathete1 + kathete2);
		return h;
	}
	
	public static void main(String[] args) {
		double quadratEins = quadrat(4);
		System.out.println("Das Quadrat deiner ersten Zahl ist: " + quadratEins);
		
		double quadratZwei = quadrat(7);
		System.out.println("Das Quadrat deiner ersten Zahl ist: " + quadratZwei);
		
		double hypotenusenlaenge = Mathe.hypotenuse(quadratEins, quadratZwei);	
		System.out.println("Die Hypotenuse beträgt:" + hypotenusenlaenge);
	}

}
