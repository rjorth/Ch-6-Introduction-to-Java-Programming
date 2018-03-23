
public class findCommission {

	public static void main(String[] args) {
		
		System.out.println("Sales      Commission");
		System.out.println("----------------------"); 
		for (double sales = 10000; sales <= 100000; sales += 5000) {
			System.out.printf("%-12.0f", sales); 
			System.out.printf("%-5.1f\n", computeCommission(sales)); 
			
		}

	}
	public static double computeCommission(double sales) {
		double balance = 0.0;
		double commission = 0.0;

		
		if (sales >= 10000.01)
			commission += (balance = sales - 10000) * 0.12;

		
		if (sales >= 5000.01)
			commission += (balance -= balance - 5000) * 0.10;

		
		if (sales >= 0.01)
				commission += balance * 0.08;
			
		return commission;
	}
}
	
