public class Aufgabe3 {
	public static void main(String[] args) {
		
		System.out.printf("%-12s | %10s\n","Fahrenheit", "Celsius");
		System.out.println("--------------------------");
		for (int i = -20; i < 0; i+=10) {
			double  celsius =(( 5 *(i - 32.0)) / 9.0);
			  System.out.printf("%-12d | %10s\n", i, Math.round(celsius * 100) / 100.0);
			}
		System.out.printf("%-12s | %10s\n","+0", Math.round((( 5 *(0 - 32.0)) / 9.0) * 100) / 100.0);
		for (int i = 20; i < 40; i+=10) {
			double  celsius =(( 5 *(i - 32.0)) / 9.0);
			  System.out.printf("+%-11d | %10s\n", i, Math.round(celsius * 100) / 100.0);
			}
	}
}
