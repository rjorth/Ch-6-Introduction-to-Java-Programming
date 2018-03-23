
public class SepChar {

	public static void main(String[] args) {
		
		final int charsPerLine = 10; 
		char c1 = '1'; 
		char c2 = 'Z';
		
		System.out.println("Characters per 1 to Z");
		printChars(c1, c2, charsPerLine); 
		System.out.println(); 
		
		

	}
	public static void printChars( char c1, char c2, int num) {
		for (char c = c1, count =1; c <= c2; c++, count++) {
			if (count % num == 0)
				System.out.println(c); 
			else
				System.out.println(c + " "); 
		}
	}

}
