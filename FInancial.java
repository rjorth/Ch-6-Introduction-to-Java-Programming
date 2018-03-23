import java.util.Scanner; 

public class FInancial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int years = 30; 
		System.out.print("The amount invested: "); 
		double amount = input.nextDouble(); 
		System.out.println("Enter annual interest rate: "); 
		double annualRate = input.nextDouble(); 
		
		double monthlyRate = annualRate / 1200; 
		
		System.out.println("Years        Future Value"); 
		for (int i = 1; i <= years; i++) {
			System.out.printf("%-10d", i); 
			System.out.printf("%11.2f\n", 
					futureValue(amount, monthlyRate, i)); 
		}
	}
	public static double futureValue(double investment, double monthlyRate, int i) {
		return investment * (Math.pow(1 + monthlyRate, i * 12)); 
	}
	

}
