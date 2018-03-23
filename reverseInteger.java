import java.util.Scanner; 

public class reverseInteger {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: "); 
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt(); 
		
		reverse(number); 
	}
		
	public static void reverse(int number) {
		
		while (number > 0) {
			System.out.print((number % 10)); 
			number /= 10; 
		}
		System.out.println();
			
			
		

	}

}
