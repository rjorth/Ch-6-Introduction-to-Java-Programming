import java.util.Scanner;

public class myTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Enter three sides of a triangle: "); 
		double first = input.nextDouble();
		double second = input.nextDouble(); 
		double third = input.nextDouble(); 
		
		System.out.println(isValid(first, second, third) ? "The area is " + area(first, second, third) : 
			"Triangle is not valid.");

	}
	public static boolean isValid(double first, double second, double third) {
		
		boolean valid = first + second > third &&
				first + third > second &&
				second + third > first; 
				
		return valid; 
	}
	public static double area(double first, double second, double third) {
		
		double per = (first + second + third) / 2; 
		double area = Math.sqrt(per * (per - first) * (per - second) * (per - third)); 
		
		return area; 
	}

}
