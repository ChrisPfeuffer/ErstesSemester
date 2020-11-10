import java.util.Scanner;

public class Aufgabe1 {
	
	public static void note() {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Welche Note möchtest du ausgeschrieben haben?");
		byte degree = myScanner.nextByte();
		if(degree == 1) {
			System.out.println("Sehr gut");
		}
		else if(degree == 2) {
			System.out.println("Gut");
		}
		else if(degree == 3) {
			System.out.println("Befriedigend");
		}
		else if(degree == 4) {
			System.out.println("Ausreichend");
		}
		else if(degree == 5) {
			System.out.println("Mangelhaft");
		}
		else{
			System.out.println("Ungenügend");
		}
	}
	
	public static void main(String[] args) {
		note();
	}

}
