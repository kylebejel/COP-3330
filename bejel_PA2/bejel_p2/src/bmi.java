import java.util.Scanner;

public class bmi {

	
	public static double bmiPounds(double height, double weight) {
		double bmi = weight * 703;
		bmi /= (height * height);
			
		return bmi;
	}
	
	public static double bmiKilos(double height, double weight) {
		double bmi = weight / (height * height);
		
		return bmi;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double bmi , weight = 0, height = 0;
		int unit = 0;
		do {
			System.out.println("Would you like to calculate BMI using 1) pounds/inches or 2) kilograms/meters?: ");
			unit = scan.nextInt();
			} while(unit != 1 && unit != 2);
		
		if(unit == 1) {
			System.out.println("Please enter your weight(in pounds): ");
			weight = scan.nextDouble();
			System.out.println("Please enter your height(in inches): ");
			height = scan.nextDouble();
			bmi = bmiPounds(height, weight);
			}
		
		else {
			System.out.println("Please enter your weight(in kilograms): ");
			weight = scan.nextDouble();
			System.out.println("Please enter your height(in meters): ");
			height = scan.nextDouble();
			bmi = bmiKilos(height, weight);
		}
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("----------------------------------");
		System.out.println("Underweight: < 18.5");
		System.out.println("Normal Weight: 18.5 – 24.9");
		System.out.println("Overweight: 25 – 29.9");
		System.out.println("Normal: >= 30");
		
		scan.close();
	}
	
}
