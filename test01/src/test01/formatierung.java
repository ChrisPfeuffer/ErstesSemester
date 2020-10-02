package test01;

import java.util.Scanner;

public class formatierung {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int zahl1;
		

		zahl1 = myScanner.nextInt();
		
		System.out.printf("I love the Number %d", zahl1);
	}

}
