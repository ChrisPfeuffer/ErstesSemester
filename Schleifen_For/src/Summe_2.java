import java.util.Scanner;

public class Summe_2 {
	public static int eingabe(String text) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print(text);
		int n = myScanner.nextInt();
		return n;
	}
	
	public static void summeA(int n) {
		int summe = 0;
		System.out.print("a:");
		for(int i = 0; i < n; i++) {
			System.out.print(" " + i);
			summe = summe + i;
		}
		System.out.print(" = " + summe + "\n");
	}
	
	public static void summeB(int n) {
		int summe = 0;
		System.out.print("b:");
		for(int i = 1; i < n; i *=2) {
			System.out.print(" " + i);
			summe = summe + i;
		}
		System.out.print(" = "+ summe + "\n");
	}
	
	public static void summeC(int n) {
		int summe = 0;
		System.out.print("c:");
		for(int i = 2; i < n; i = 2*i+1) {
			System.out.print(" " + i);
			summe = summe + i;
		}
		System.out.print(" = "+ summe + "\n");
	}
	
	public static void main(String[] args) {
	int n = eingabe("Bitte geben Sie eine begrenzende Zahl ein:");
	summeA(n);
	summeB(n);
	summeC(n);
	}
}
