
public class daysInYear {
	public static void main(String[] args) {
		
		System.out.println("Year          Days in year");
		for (int year = 2000; year <= 2020; year++) {
			System.out.println(year + "         " + daysInAYear(year));
		}
	}

	public static int daysInAYear(int year){
		if (isLeapYear(year)) return 366;
		else return 365;
	}

	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	

}