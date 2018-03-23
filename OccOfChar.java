import java.util.Scanner; 

public class OccOfChar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Type something: "); 
		String work = input.nextLine(); 
		System.out.println("Choose a letter: ");
		char c = input.next().charAt(0);
		System.out.println(count(work, c)); 
		

	}
	public static int count(String str, char a) {
		
		int count = 0; 
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a)
				count++; 
		}
		return count; 
	}

}
