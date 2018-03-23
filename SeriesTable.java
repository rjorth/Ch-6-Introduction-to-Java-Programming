
public class SeriesTable {

	public static void main(String[] args) {
		
		double start = 1.0; 
		double rows = 20.0; 
		
		System.out.println("i         m(i)      "); 
		System.out.println("-----------------"); 
		
		for (double i = start; i <= rows; i++) {
			System.out.printf("%-10.0f", i); 
			System.out.printf("%-7.4f\n", sumSeries(i)); 
		}
		
	}
	
	public static double sumSeries(double n) {
		double sum = 0; 
		for (double i = 1; i <= n; i++) {
			sum += i / (i + 1); 
			
		}
		return sum; 
	}
}
