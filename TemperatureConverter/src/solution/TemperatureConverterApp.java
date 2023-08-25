package solution;
import java.util.Scanner;
public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double farhenheit=scan.nextDouble();
		TemperatureConverter t=new TemperatureConverter();
		System.out.println(t.convertFahrenheitToCelsius(farhenheit));
		
	}

}
