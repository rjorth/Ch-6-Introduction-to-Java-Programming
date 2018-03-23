import java.util.Scanner; 

public class sumDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: "); 
		long value = input.nextLong(); 
		System.out.println("The sum of the digits is: " + sumDigits(value)); 
		

	}
	public static int sumDigits(long n) {
		int temp = (int)Math.abs(n); 
		int sum = 0; 
		
		while (temp != 0) {
			sum += (temp % 10); 
			temp = temp/10; 
		}
		return sum; 
	}

}
