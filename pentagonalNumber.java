
public class pentagonalNumber {

	public static void main(String[] args) {
		
		System.out.println("The first 100 pentagonal number are: "); 
		for (int i = 1; i < 101; i++) {
			System.out.printf("%7d ", getPentNum(i)); 
			if (i % 10 == 0) {
				System.out.println();
			}
			
		}

	}
	public static int getPentNum(int n) {
		return (n * ( 3 * n - 1)) / 2; 
	}

}
