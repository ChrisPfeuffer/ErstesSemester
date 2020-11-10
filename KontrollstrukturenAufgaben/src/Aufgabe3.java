import java.util.Scanner;

public class Aufgabe3 {
	public static void ausgeschriebenerMonatIfElse() {		//If-else
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Welchen Monat möchtest du ausgeschrieben haben?");
		byte monate = myScanner.nextByte();
		if(monate == 1) {
			System.out.println("Januar");
		}
		else if(monate == 2) {
			System.out.println("Februar");
		}
		else if(monate == 3) {
			System.out.println("März");
		}
		else if(monate == 4) {
			System.out.println("April");
		}
		else if(monate == 5) {
			System.out.println("Mai");
		}
		else if(monate == 6) {
			System.out.println("Juni");
		}
		else if(monate == 7) {
			System.out.println("Juli");
		}
		else if(monate == 8) {
			System.out.println("August");
		}
		else if(monate == 9) {
			System.out.println("September");
		}
		else if(monate == 10) {
			System.out.println("Oktober");
		}
		else if(monate == 11) {
			System.out.println("November");
		}
		else if(monate == 12){
			System.out.println("Dezember");
		}
		else {
			System.out.println("Es gibt nur 12 Monate");
		}
	}
	public static void ausgeschriebenderMonatSwitch() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Welchen Monat möchtest du ausgeschrieben haben?");
		byte monate = myScanner.nextByte();
		switch(monate) {
		case 1: System.out.println("Januar");
		break;
		case 2: System.out.println("Februar");
		break;
		case 3: System.out.println("März");
		break;
		case 4: System.out.println("April");
		break;
		case 5: System.out.println("Mai");
		break;
		case 6: System.out.println("Juni");
		break;
		case 7: System.out.println("Juli");
		break;
		case 8: System.out.println("August");
		break;
		case 9: System.out.println("September");
		break;
		case 10: System.out.println("Oktober");
		break;
		case 11: System.out.println("November");
		break;
		case 12: System.out.println("Dezember");
		break;
		default: System.out.println("Es gibt nur 12 Monate");
		}
	}
	
	public static void main(String[] args) {
		ausgeschriebenerMonatIfElse();
		ausgeschriebenderMonatSwitch();
	}

}
