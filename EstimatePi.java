
public class EstimatePi {

	public static void main(String[] args) {
		
		double start = 1; 
		double end = 901; 
		System.out.println("i         m(i)      "); 
		System.out.println("---------------------");
		for (double i = start; i <= end; i += 100) {
			System.out.printf("%-10.0f", i); 
			System.out.printf("%-7.4f\n", estimatePi(i)); 
		}
	}
	public static double estimatePi (double n) {
		double pi = 0; 
		for (double i = 1; i <= n; i++) {
			pi += Math.pow(-1,  i + 1) / (2 * i - 1); 
		}
		pi *= 4;
		return pi; 
	}

}
