package terry_p2;

import java.util.Scanner;

public class terry_p2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x;
		int height;
		int weight;
		double bMi = 0;
		
		System.out.print("Please make a choice: Imperial (Enter 1) and Metric (Enter 2)\n\n");
		x = scnr.nextInt();
		
		if (x == 1) {
			System.out.print("Please enter height (inches):\n");
			height = scnr.nextInt();
			System.out.print("Please enter weight (pounds):\n\n");
			weight = scnr.nextInt();
			
			bMi = 703 * weight;
			bMi = bMi / (Math.pow(height, 2));
		}
		else if (x == 2) {
			System.out.print("Please enter height (meters):\n");
			height = scnr.nextInt();
			System.out.print("Please enter weight (kilograms):\n\n");
			weight = scnr.nextInt();
			
			bMi = weight / (Math.pow(height, 2));
		}
		else {
			System.out.print("Error: invalid input\n");
		}
		
		System.out.printf("Users BMI = %.1f\n\n", bMi);
		
		
		if ((bMi <= 18.5) && (bMi > 0)) {
			System.out.printf("A value of %.1f corresponds to: Underweight", bMi);
			
		}
		else if ((bMi < 25) && (bMi > 18.5)) {
			System.out.printf("A value of %.1f corresponds to: Normal Weight", bMi);
			
		}
		else if ((bMi < 30) && (bMi >= 25)) {
			System.out.printf("A value of %.1f corresponds to: Overweight", bMi);
			
		}
		else if (bMi >= 30) {
			System.out.printf("A value of %.1f corresponds to: Obesity", bMi);
		}

	}

}
