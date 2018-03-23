
public class Craps {

	public static void main(String[] args) {
		
		int r1 = roll(); 
		int r2 = roll(); 
		System.out.println("You rolled " + r1 + " + " + r2 + " = " + (r1 + r2));
		System.out.println(score(r1+r2)); 
		

	}
	
	public static String score(int n) {
		
		if (n == 7 || n == 11) return "You win!"; 
		if (n == 2 || n == 12) return "You lose."; 
		
		return "point is " + n; 
	}
	
	public static int roll() {
		
		return (int)(Math.random() * 6 + 1); 
	}

}
