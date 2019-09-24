package terry_p3;

import java.util.Scanner;

public class terry_p3 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int y = 1;
		int x = 0;
		int i;
		int j;
		int sumNFL = 0;
		int sumNBA = 0;
		int sumNHL = 0;
		int sumMLB = 0;
		int sumMLS = 0;
		int avgNFL = 0;
		int avgNBA = 0;
		int avgNHL = 0;
		int avgMLB = 0;
		int avgMLS = 0;
		String [] topics = {"NFL", "NBA", "NHL", "MLB", "MLS"};
		int[][] responses = new int[5][10];
		int[] sumResponses = new int[5];
		int[] averages = new int[5];
		int maxResponses;
		int minResponses;
		int r;
		int s;
		
		System.out.print("Welcome to Sean Terry Sports Polls\n\n");
		System.out.print("Today we will ask our poll takers to rate their interest level in each of the 5 major sports in the US\n");
		System.out.print("\tWhen the poll begins, the user will be prompted 5 times to rate the interest level in the specified sport/league\n");
		System.out.print("\nAfter the 5 ratings are entered, the user will be prompted to have the poll repeat for another user's input or to conclude and display results.\n");
		System.out.print("\tThe results will show a table with each rating and the average for each rating along with the sports with the most and lowest overall point totals.\n\n\n");
		
		
		while((y > 0) && (x < 10)) {
			System.out.print("Thank You for participating in today's poll!\n\n");
			System.out.print("For each of the 5 prompts, please enter a number 1-10 for each sports league that best reflect's your interest in it.\n");
			System.out.print("\twith 1 being not interested at all and 10 if you live and breathe that sports league\n\n");
			
			for (i = 0; i < 5; ++i) {
				System.out.print(topics[i]);
				System.out.print(": ");
				responses[i][x] = scnr.nextInt();
			}
			x = x + 1;
			System.out.print("\nThank You for your responses! Would someone else like to fill out our poll?\n\n");
			System.out.print("Please enter 1 to begin the poll again or 0 if you're all done and want to calculate and print results: \n\n\n");
			y = scnr.nextInt();
		}
		
		for (i = 0; i < x; ++i) {
			sumNFL = sumNFL + responses[0][i];
		}
		avgNFL = sumNFL / x;
		averages[0] = avgNFL;
		sumResponses[0] = sumNFL;
		
		for (i = 0; i < x; ++i) {
			sumNBA = sumNBA + responses[1][i];
		}
		avgNBA = sumNBA / x;
		averages[1] = avgNBA;
		sumResponses[1] = sumNBA;
		
		for (i = 0; i < x; ++i) {
			sumNHL = sumNHL + responses[2][i];
		}
		avgNHL = sumNHL / x;
		averages[2] = avgNHL;
		sumResponses[2] = sumNHL;
		
		for (i = 0; i < x; ++i) {
			sumMLB = sumMLB + responses[3][i];
		}
		avgMLB = sumMLB / x;
		averages[3] = avgMLB;
		sumResponses[3] = sumMLB;
		
		for (i = 0; i < x; ++i) {
			sumMLS = sumMLS + responses[4][i];
		}
		avgMLS = sumMLS / x;
		averages[4] = avgMLS;
		sumResponses[4] = sumMLS;
		
		System.out.print("Response:  ");
		for (i = 1; i <= x; ++i) {
			System.out.printf("%d  ", i);
		}
		System.out.print("| Averages\n");
		
		
		for (i = 0; i < 5; ++i) {
			System.out.print(topics[i]);
			System.out.print("     :  ");
			for (j = 0; j < x; ++j) {
				if (responses[i][j] == 10) {
					System.out.printf("%d ", responses[i][j]);
				}
				else {
				System.out.printf("%d  ", responses[i][j]);
				}
			}
			System.out.print("|  ");
			System.out.print(averages[i]);
			System.out.println("");
		}
		
		System.out.print("\n\n");
		
		maxResponses = sumResponses[0];
		minResponses = sumResponses[0];
		r = 0;
		s = 0;
		
		for(i = 0; i < 5; ++i) {
			if (sumResponses[i] > maxResponses) {
				maxResponses = sumResponses[i];
				r = i;
			}
		}
		System.out.print("League with most total rating points: ");
		System.out.print(topics[r]);
		System.out.print(" with a total of ");
		System.out.print(maxResponses);
		System.out.print(" rating points\n\n");
		
		for(i = 0; i < 5; ++i) {
			if (sumResponses[i] < minResponses) {
				minResponses = sumResponses[i];
				s = i;	
			}
		}
		System.out.print("League with least total rating points: ");
		System.out.print(topics[s]);
		System.out.print(" with a total of ");
		System.out.print(minResponses);
		System.out.print(" rating points\n\n");
		
		
		
		
	}

}
