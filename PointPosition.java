import java.util.Scanner;

public class PointPosition {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter three points: "); 
		double x1 = input.nextDouble();
		double y1 = input.nextDouble(); 
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble(); 
	
	
	String p0 = "(" + x1 + ", " + y1 + ")"; 
	String p1 = "(" + x2 + ", " + y2 + ")"; 
	String p2 = "(" + x3 + ", " + y3 + ")"; 
	
	if (leftOfLine(x1, y1, x2, y2, x3, y3)) {
		System.out.println(p2 + " is on the left side of the line from " + p0 + " to " + p1); 
		
	}
	else if (onSameLine(x1, y1, x2, y2, x3, y3)) {
		
		if (onLineSegment(x1, y1, x2, y2, x3, y3)) {
			System.out.println(p2 + " is on the line segment from " + p0 + " to " + p2); 
		}
		else {
			System.out.println(p2 + " is on the same line from " + p0 + " to " + p1); 
		}
	}
	else {
			System.out.println(p2 + " is on the right side of the line from " + p0 + " to " + p2); 
		}
	}
	
	
	
	
	
	public static boolean leftOfLine(double x1, double y1, double x2, double y2, double x3, double y3) 
	{
		double place = (x2 - x1) * (y2 - y1) - (x3 - x2) * (y3 - y2); 
		if (place > 0) 
			return true; 
		return false; 
	}
	
	public static boolean onSameLine(double x1, double y1, double x2, double y2, double x3, double y3) {
		
		double place = (x2 - x1) * (y2 - y1) - (x3 - x2) * (y3 - y2); 
		if (place == 0)
			return true;
		return false; 
	}
	
	public static boolean onLineSegment(double x1, double y1, double x2, double y2, double x3, double y3) {
		
		if (onSameLine(x1, y1, x2, y2, x3, y3)) {
			if ((x3 < x2 && x2 > x1) || (x3 < x1 && x3 > x2) &&
			((y3 < y2 && y3 > y1) || (y3 < y1 && y3 > y2))) {
				return true; 
			}
		}
		return false; 
	}
	
	

}
