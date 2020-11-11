import java.util.Scanner;

public class Schaltjahr9 {
	
	public static int eingabe(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println(text);
		int jahr = myScanner.nextInt();
		return jahr;
	}
	
	public static void berechnung(int sJahr) {
		if(sJahr % 4 == 0) {
			if(sJahr > 1582) {
				if(sJahr % 100 == 0) {
					if(sJahr % 400 == 0) {
						System.out.println(sJahr + " ist ein Schaltjahr");
					}
					else {
						System.out.println(sJahr + " ist kein Schaltjahr");
					}
				}
				else {
					System.out.println(sJahr + " ist ein Schaltjahr");
				}
			}
			else {
				System.out.println(sJahr + " ist ein Schaltjahr");
			}
		}
		else {
			System.out.println(sJahr + " ist kein Schaltjahr");
		}
	}
	
	public static void main(String[] args) {
		int schaltjahrEingabe = eingabe("Ich finde für Sie heraus, welches Jahr ein Schaltjahr ist. Geben Sie mir ein Jahr");
		berechnung(schaltjahrEingabe);
	}

}
