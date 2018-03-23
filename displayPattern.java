import java.util.Scanner; 

public class displayPattern {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

	
		System.out.print("Enter the number of rows: ");
		int numberOfRows = input.nextInt();

		// Display pattern
		displayPattern(numberOfRows);
	}

	/** displayPattern Method */
	public static void displayPattern(int n) {
		int padding = n - 1;	
		for (int r = 1; r <= n; r++) {
			
			for (int p = 0; p < padding; p++) {
				System.out.print("  ");
			}

		
			for (int i = r; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
			padding--; 
		}
	}
}


