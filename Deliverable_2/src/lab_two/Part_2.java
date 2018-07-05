package lab_two;
		
		import java.util.Scanner;
		
		public class Part_2 {
			
			public static void main(String [] args) {
				Scanner scnr = new Scanner(System.in);
				
				int userYear1; // 1st year for user to enter
				int userYear2; // 2nd year for user to enter
				
				int userDay1; // 1st day for user to enter
				int userDay2; // 2nd day for user to enter
				
				int userMonth1; // 1st month for user to enter
				int userMonth2; // 2nd month for user to enter
				
				int finalMonth;
				int finalDay;
				int finalYear;
				
				
				
				// user prompts to enter dates
				System.out.println(" Enter the end year of the first date (highest date): ");
				userYear1 = scnr.nextInt();
				
				System.out.println("Enter the end day of the first date (highest date): ");
				userDay1 = scnr.nextInt();
				
				System.out.println("Enter the end month of the first date (highest date): ");
				userMonth1 = scnr.nextInt();
				
				System.out.println("Enter the start year of the second date (lowest date): " );
				userYear2 = scnr.nextInt();
				
				System.out.println("Enter the start day of the second date (lowest date): ");
				userDay2 = scnr.nextInt();
				
				System.out.println("Enter the start month of the second date (lowest date): ");
				userMonth2 = scnr.nextInt();
				
				System.out.println("This is the end date: " + userMonth1 + ", " + userDay1 + ", " + userYear1);
				System.out.println("This is the start date: " + userMonth2 + ", " + userDay2 + ", " + userYear2);
				
				
				//used to compute difference of dates
				finalMonth = userMonth1 - userMonth2; 
				finalDay = userDay1 - userDay2; 
				finalYear = userYear1 - userYear2;
				
				System.out.println("The difference between dates is " + finalMonth + " months, " + finalDay + " days, " + finalYear + " years.");
				
			
	
				
				
				
				
			}
		}
		
		
		


