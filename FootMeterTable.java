
public class FootMeterTable {

	public static void main(String[] args) {
		
		System.out.println(
				"\nFeet 	Meters	|	Meters		Feet\n" +
		"\n--------------------------------------------------"); 
		
		for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters +=5) {
			System.out.print(feet); 
			System.out.print(footToMeter(feet)); 
			 
			System.out.print(meters); 
			System.out.print(meterToFoot(meters)); 
		}

	}
	public static double footToMeter(double foot) {
		return 0.305 * foot; 
	}
	public static double meterToFoot(double meter) {
		return 3.279 * meter; 
	}

}
