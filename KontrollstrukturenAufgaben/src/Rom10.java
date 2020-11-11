/*-  Kleinere Ziffern rechts von größeren Ziffern werden addiert,  z.B. XI = 11 
Kleinere Ziffern links von größeren Ziffern subtrahiert, z.B. IX = 9.
-  Nur Grundzahlen I, X, C dürfen nur von der nächsthöheren Zahlen 
subtrahiert werden:
d.h. erlaubt sind IV = 4, CD = 400, XL = 40
nicht erlaubt sind IC = 99, VD = 495, XM = 990.
I steht nur vor V und X
X steht nur vor L und C
C steht nur vor D und M */

import java.util.Scanner;

public class Rom10 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String roemZahl = "";
		int dezimalzahl = 0;
		char zeichen, naechstesZeichen = ' ';
		System.out.println("+++ Römische ZahlenroemZahl +++");
		System.out.print("Römische Zahl eingeben: ");
		roemZahl = myScanner.next();
		int i = roemZahl.length() - 1;

		while (i >= 0) {
			zeichen = roemZahl.charAt(i);
			if (zeichen == 'I')
				if (naechstesZeichen == 'V' || naechstesZeichen == 'X')
					dezimalzahl = dezimalzahl - 1;
				else
					dezimalzahl = dezimalzahl + 1;
			if (zeichen == 'V')
				dezimalzahl = dezimalzahl + 5;
			if (zeichen == 'X')
				if (naechstesZeichen == 'L' || naechstesZeichen == 'C')
					dezimalzahl = dezimalzahl - 10;
				else
					dezimalzahl = dezimalzahl + 10;
			if (zeichen == 'L')
				dezimalzahl = dezimalzahl + 50;
			if (zeichen == 'C')
				if (naechstesZeichen == 'D' || naechstesZeichen == 'M')
					dezimalzahl = dezimalzahl - 100;
				else
					dezimalzahl = dezimalzahl + 100;
			if (zeichen == 'D')
				dezimalzahl = dezimalzahl + 500;
			if (zeichen == 'M')
				dezimalzahl = dezimalzahl + 1000;
			naechstesZeichen = roemZahl.charAt(i);
			i--;
		}
		System.out.println("Der Dezimalwert des römischen Zahl beträgt " + dezimalzahl);

	}

}
