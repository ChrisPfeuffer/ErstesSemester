import java.util.Scanner;

public class Rom7 {
	public static void numberChanger() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Welche römische Zahlzeichen möchten Sie als Dezimalzahl erhalten?");
		char deziZahl = myScanner.next().charAt(0);
		switch(deziZahl) {
		case 'I': System.out.print(1);
		break;
		case 'V': System.out.print(5);
		break;
		case 'X': System.out.print(10);
		break;
		case 'L': System.out.print(50);
		break;
		case 'C': System.out.print(100);
		break;
		case 'D': System.out.print(500);
		break;
		case 'M': System.out.print(1000);
		break;
		default: System.out.println(deziZahl +" ist keine gültige Eingabe. Sie haben eine Auswahl aus folgenden Buchstaben: \nI, V, X, L, C, D, M");
		}
	}
	public static void main(String[] args) {
		numberChanger();

	}

}
