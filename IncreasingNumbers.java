import java.util.Scanner; 

public class IncreasingNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a number: ");
		double num1 = input.nextDouble(); 
		System.out.println("Enter the second number: ");
		double num2 = input.nextDouble(); 
		System.out.println("Enter the third number: ");
		double num3 = input.nextDouble(); 
		
		displaySortedNumbers(num1, num2, num3);

	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double first = 0;
		double last = 0;
		double middle = 0;
		if (num1 > num2 && num1 > num3)
			first = num1; 
		else if (num2 > num1 && num2 > num3)
			first = num2; 
		else 
			first = num3; 
		if (num1 < num2 && num1 < num3) 
			last = num1;
		else if (num2 < num3 && num2 < num1) 
			last = num2;
		else
			last = num3; 
		if (num1 != first && num1 != last) 
			middle = num1; 
		else if (num2 != first && num2 != last)
			middle = num2; 
		else
			middle = num3; 
		
		 System.out.println("" + last + "\n" + middle + "\n" + first); 
	}
	

}
