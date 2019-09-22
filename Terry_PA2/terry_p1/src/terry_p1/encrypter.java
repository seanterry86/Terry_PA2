package terry_p1;

import java.util.Scanner;

public class encrypter {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int inputNumber;
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("Enter a 4-digit integer:");
		inputNumber = scnr.nextInt();
		
		a = inputNumber / 1000;
		b = inputNumber / 100;
		b = b % 10;
		c = inputNumber / 10;
		c = c % 10;
		d = inputNumber % 10;
		
		
		a = a + 7;
		a = a % 10;
		b = b + 7;
		b = b % 10;
		c = c + 7;
		c = c % 10;
		d = d + 7;
		d = d % 10;
		
		
		
		System.out.printf("%d%d%d%d", c, d, a, b);
		

	}

}
