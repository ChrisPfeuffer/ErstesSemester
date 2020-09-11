public class Temparaturanzeige_ChristianPfeuffer_FI_C01 {
	public static void main(String[] args) {
		
		System.out.printf("%-12s | %10s\n","Fahrenheit", "Celsius");
		System.out.println("--------------------------");
		for (int i = -20; i < 0; i+=10) {
			double  celsius =(( 5 *(i - 32.0)) / 9.0);
			  System.out.printf("%-12d | %10.2f\n", i, celsius);
			}
		System.out.printf("%-12s | %10.2f\n","+0", (( 5 *(0 - 32.0)) / 9.0));
		for (int i = 20; i < 40; i+=10) {
			double  celsius =(( 5 *(i - 32.0)) / 9.0);
			  System.out.printf("+%-11d | %10.2f\n", i, celsius);
			}
	}
}
