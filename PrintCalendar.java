import java.util.Scanner; 

public class PrintCalendar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		int year = input.nextInt(); 
		

	}
	public static boolean validYear(int year) {
		return year > 0; 
	}
	public static boolean validMonth(int month) {
		return month > 0 && month <= 12; 
	}
	public static void printHeader(int month, int year) {
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
		
	};
		System.out.print("\t\t" + months[month - 1] + "\t"); 
		System.out.println(year); 
		System.out.println("--------------------------------"); 
		
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat"); 
	
	}
	
	public static void printFristDay(int month, int year) {
		
		int firstDay = weekday(1, month, year); 
		String leadingTabs = "1"; 
		
		for (int i = 1; i < firstDay; i++) {
			leadingTabs = "\t" + leadingTabs; 
			
		}
		if (firstDay == 0) {
			leadingTabs = "\t\t\t\t\t\t\t1"; 
		}
		System.out.print(leadingTabs + "\t"); 
	}
	
	public static void printCalendar(int month, int year) {
		
		int lastDay = lastDayMethod(month, year); 
		for (int i = 2; i <= lastDay; i++) {
			int printedDay = weekday(i, month, year); 
			if (printedDay == 1) {
				System.out.println(); 
			}
			System.out.print(i + "\t"); 
		}
		public static int weekday(int dayOfMonth, int month, int year) {
			if (month == 1 || month == 2) {
				month = month + 12; 
				year--; 
			}
			int q, m, j, k; 
			q = dayOfMonth; 
			m = month; 
			j = year/100; 
			k = year % 100; 
			int weekday = (q + (26 * (m + 1) / 10) + k + k/4 + j/4 + (5*j)) % 7; 
			return weekday; 
		}
		public static boolean leapYear(int year) {
			return year % 400 = 0 || (year % 4 == 0 && year & 100 != 0); 
			
		}
		public static int lastDay(int month, int year) {
			int lastDay; 
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				lastDay = 31;
			} else if (month == 2) {
				if (LeapYear(year)) {
					lastDayh = 29;
				} else {
					lastDay = 28;
				}
			} else {
				lastDay = 30;
			}
			return lastDay;
		}
	}
}
