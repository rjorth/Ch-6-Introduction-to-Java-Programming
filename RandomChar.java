
public class RandomChar {

	public static void main(String[] args) {
		
		final int num_uppercase = 100; 
		final int num_digits = 100; 
		final int num_per_line = 10; 
		
		for (int i = 1; i < num_uppercase; i++) {
			System.out.print(RandomCharacter.getRandomUpperCaseLetter()); 
			System.out.print(i % num_per_line == 0 ? "\n" : " "); 
		}
		for (int i = 1; i < num_digits; i++) {
			System.out.print(RandomCharacter.getRandomDigitCharacter()); 
			System.out.print(i % num_per_line == 0 ? "\n" : " " ); 
		}

	}

}
