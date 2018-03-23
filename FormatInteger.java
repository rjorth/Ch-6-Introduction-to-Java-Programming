import java.util.Scanner; 

public class FormatInteger {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Type two numbers: "); 
		int num = input.nextInt(); 
		int width = input.nextInt(); 
		
		System.out.println(num + " formatted to width " + width + ": " + format(num, width)); 

	}
	public static String format(int num, int width) {
		String number = num + ""; 
		
		if (number.length() < width) {
			for (int i = width - number.length(); i > 0; i--) {
				number = 0 + number; 
			}
			
		}
		return number; 
	}

}
