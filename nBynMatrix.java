import java.util.Scanner;

public class nBynMatrix {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in); 
		int n = input.nextInt(); 
		
		printMatrix(n); 
		

	}
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols++) 
				System.out.print((int)(Math.random() * 2)); 
			
			System.out.println(); 
		}
		
	}

}
