import java.util.Scanner;

public class Sortiere_abc8 {
	public static char eingabe(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println(text);
		char eingabe = myScanner.next().charAt(0);
		return eingabe;
	}
	
	public static void sortierung(char eins, char zwei, char drei) {
		if (eins < zwei && eins < drei) {
			System.out.print(eins);
			if (drei < zwei) {
				System.out.print(drei);
				System.out.print(zwei);
			}
			else {
				System.out.print(zwei);
				System.out.print(drei);
			}
		}
		if (zwei < eins && zwei < drei) {
			System.out.print(zwei);
			if (drei < eins) {
				System.out.print(drei);
				System.out.print(eins);
			}
			else {
				System.out.print(eins);
				System.out.print(drei);
			}
		}
		if (drei < eins && drei < zwei) {
			System.out.print(drei);
			if (zwei < eins) {
				System.out.print(zwei);
				System.out.print(eins);
			}
			else {
				System.out.print(eins);
				System.out.print(zwei);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Ich würde gerne drei Ihrer eingegebenen Zeichen sortieren.");
		char erste = eingabe("Bitte geben Sie mir ihre erste Eingabe");
		char zweite = eingabe("Bitte geben Sie mir ihre zweite Eingabe");
		char dritte = eingabe("Bitte geben Sie mir ihre dritte Eingabe");
		sortierung(erste,zweite,dritte);
	}
}
