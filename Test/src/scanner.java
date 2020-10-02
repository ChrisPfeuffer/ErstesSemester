import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int zahl1 = 0;

		//System.out.println("Welche Zahl magst du?");		
		//zahl1 = myScanner.nextInt();
		//System.out.printf("du magst also die Zahl %d", zahl1);
		//System.out.print("Er sagte: \"ich mog dieee\"");
		
		String name = "willi";
		int welt = 123456789;
		System.out.printf( "|%+020d|\n", welt );      
		System.out.printf("ich heiﬂe %s! Wie heiﬂt du?", name);
	}

}
