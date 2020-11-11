import java.util.Scanner;

public class Aufgabe6 {
	
	public static double koerperma�(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println(text);
		
		double ma� = myScanner.nextDouble();
		return ma�;
	}
	public static char geschlecht(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println(text);
		char sex = myScanner.next().charAt(0);
		return sex;
	}
	public static void berechnungBMI(double kg, double meter, char sex) {
		double bmi = kg / (meter * meter);
		System.out.printf("Dein BMI betr�gt %.0f %n", bmi);
		if(bmi <20 && sex == 'm') {
			System.out.println("Das bedeutet, dass du als Kerl untergewichtig bist ");
		}
		else if(bmi >=20 && bmi <=25 && sex == 'm') {
			System.out.println("Das bedeutet, dass du als Kerl normalgewichtig bist");
		}
		else if(bmi >25 && sex == 'm') {
			System.out.println("Das bedeutet, dass du als Kerl �bergewichtig bist");
		}
		else if(bmi <19 && sex == 'w') {
			System.out.println("Das bedeutet, dass du als Lady untergewichtig bist ");
		}
		else if(bmi >=19 && bmi <=24 && sex == 'w') {
			System.out.println("Das bedeutet, dass du als Lady normalgewichtig bist");
		}
		else if(bmi >24 && sex == 'w') {
			System.out.println("Das bedeutet, dass du als Lady �bergewichtig bist");
		}
		else {
			System.out.println("Falls Aliens �berhaupt einen BMI haben!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Lass uns heute deine Gewichtsklasse herausfinden!");
		double kg = koerperma�("Wie schwer bist du in kg?");
		double meter = koerperma�("Wie gro� bist du in Meter?");
		char sex = geschlecht("Bist du m�nnlich oder weiblich. Antworte mit 'm' oder 'w'.");
		berechnungBMI(kg, meter, sex);	
	}
}
