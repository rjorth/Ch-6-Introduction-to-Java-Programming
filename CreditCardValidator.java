import java.util.Scanner; 

public class CreditCardValidator {

	public static final int visa_prefix = 4; 
	public static final int master_prefix = 5; 
	public static final int xp_prefix = 37;
	public static final int discover_prefix = 6; 
	
	static int[] prefixes = new int[] {
		
		visa_prefix, master_prefix, xp_prefix, discover_prefix
	};
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card number: ");
		long ccn = input.nextLong(); 
		
		if (valid(ccn)) {
			System.out.println(ccn + " is valid."); 
		}
		else
			System.out.println(ccn + " is invalid."); 
		

	}
	public static int getSize(long len) {
		
		int size = 0; 
		while (len > 0) {
			size++;
			len /= 10; 
		}
		return size; 
	}
	
	public static int getDigit(int num) {
		
		return (num > 9) ? num - 9 : num; 
	}
	public static int sumOdd(long num) {
		int sum = 0; 
		while (num > 0) {
			int digit = (int)(num % 10); 
			digit = getDigit(digit); 
			sum += digit; 
			num /= 100; 
		}
		return sum; 
	}
	public static int sumEven(long num) {
		int sum = 0; 
		while (num > 0) {
			num /= 10; 
			int digit = getDigit((int) (num % 10) * 2); 
			sum += digit; 
			num /= 10; 
		}
		return sum; 
	}
	
	public static boolean prefixMatch(long num, int left) {
		if (left > num) return false; 
		long diff = (getSize(num) - getSize(left)); 
		return left == (int) (num / Math.pow(10,  diff)); 
	}
	
	public static long getPrefix(long num, int left) {
		if (prefixMatch(num, left)) return left; 
		
		return num; 
	}
	public static boolean valid(long num) {
		if (getSize(num) > 16 || getSize(num) < 13) return false; 
		for (int i = 0; i < prefixes.length; i++) {
			if (getPrefix(num, prefixes[i]) == prefixes[i]) break;
			if (i < prefixes.length - 1) return false; 
		}
		int sum = sumOdd(num) + sumEven(num); 
		return sum % 10 == 0; 
	}

}
