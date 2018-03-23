

public class CtoFconversion {

	public static void main(String[] args) {
		
		System.out.println(
				"Celsius	Fahrenheit	|	Fahrenheit	Celsius\n"
				+"-----------------------------------------------");
		for (double celsius = 40.0, fahrenheit = 120.0;
				celsius >= 31.0; celsius--, fahrenheit -= 10) {
			System.out.printf("%-12.f", celsius); 
			System.out.printf("%-15.1f|", celsiusToFahrenheit(celsius));
			System.out.printf("		%-15.1f", fahrenheit); 
			System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit)); 
		}
		
		
		

	}
	public static double celsiusToFahrenheit(double celsius) {
		
		return (9.0 / 5) * celsius + 32; 
		
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		
		return (5.0 / 9) * (fahrenheit - 32);
	}

}
