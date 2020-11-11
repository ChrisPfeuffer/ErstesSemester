import java.util.Scanner;

public class Aufgabe6 {
	
	public static double koerpermaß(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println(text);
		
		double maß = myScanner.nextDouble();
		return maß;
	}
	public static char geschlecht(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println(text);
		char sex = myScanner.next().charAt(0);
		return sex;
	}
	public static void berechnungBMI(double kg, double meter, char sex) {
		double bmi = kg / (meter * meter);
		System.out.printf("Dein BMI beträgt %.0f %n", bmi);
		if(bmi <20 && sex == 'm') {
			System.out.println("Das bedeutet, dass du als Kerl untergewichtig bist ");
		}
		else if(bmi >=20 && bmi <=25 && sex == 'm') {
			System.out.println("Das bedeutet, dass du als Kerl normalgewichtig bist");
		}
		else if(bmi >25 && sex == 'm') {
			System.out.println("Das bedeutet, dass du als Kerl übergewichtig bist");
		}
		else if(bmi <19 && sex == 'w') {
			System.out.println("Das bedeutet, dass du als Lady untergewichtig bist ");
		}
		else if(bmi >=19 && bmi <=24 && sex == 'w') {
			System.out.println("Das bedeutet, dass du als Lady normalgewichtig bist");
		}
		else if(bmi >24 && sex == 'w') {
			System.out.println("Das bedeutet, dass du als Lady übergewichtig bist");
		}
		else {
			System.out.println("Falls Aliens überhaupt einen BMI haben!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Lass uns heute deine Gewichtsklasse herausfinden!");
		double kg = koerpermaß("Wie schwer bist du in kg?");
		double meter = koerpermaß("Wie groß bist du in Meter?");
		char sex = geschlecht("Bist du männlich oder weiblich. Antworte mit 'm' oder 'w'.");
		berechnungBMI(kg, meter, sex);	
	}
}
