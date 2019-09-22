import java.util.Scanner;

public class poll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String topics[] = {"Climate Change  ", "Student Debt    ", "Renewable Energy", "Student Saftey  ", "Right to Privacy"};
		int responses[][] = new int[5][10];
		
		for(int i = 0; i < topics.length; i++) {
			
			int rating = 0;
			int again = 1;
			
			do {
				System.out.println("On a scale from 1(not important) - 10(very important), how would you rate " + topics[i]);
				rating = scan.nextInt();		
				responses[i][rating-1]++;
				System.out.println("Would you like to give another entry for this topic? (1 = yes; 2 = no)");
				again = scan.nextInt();
			} while(again == 1);
		}
		
		int min = 0, max = 0, total = 0;
		
		for(int i = 0; i < responses.length; i++) {
			int avg = 0;
			int div = 0;
			System.out.print("Category: " + topics[i] + "   ");
			
			for(int j = 0; j < responses[0].length; j++) {
				System.out.print("Num of " + (j+1) + "'s: " + responses[i][j] + "  ");
				div += (responses[i][j]);
				avg += (responses[i][j] * j);
				total += (responses[i][j] * j);
				if(total > responses[max][j]) {
					max = i;
				}
				else if(total < responses[min][j]) {
					min = i;
				}
			}
			
			System.out.print("   Average rating for this category is: " + (avg/div) + "  ");
			System.out.println("");
		}
		System.out.println("The category with the highest point total is: " + topics[max]);
		System.out.println("The category with the lowest point total is: " + topics[min]);
		
		scan.close();
		}
	
}
