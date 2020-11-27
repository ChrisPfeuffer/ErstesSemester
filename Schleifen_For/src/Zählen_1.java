import java.util.Scanner;

public class Zählen_1 {
	public static int eingabe(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print(text);
		int n = myScanner.nextInt();
		return n;
	}
	public static void main(String[] args) {
		int hochzaehlen = eingabe("Wie hoch soll der Rechner zählen?\n");
		for(int n = 0; n <= hochzaehlen; n++) {
			System.out.println(n);
		}
		int runterzaehlen = eingabe("Von welcher Zahl soll runtergezählt werden?\n");
		for(int n = runterzaehlen; n >= 0; n--) {
			System.out.println(n);
		}
	}

}
