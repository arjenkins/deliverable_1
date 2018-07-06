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
				System.out.println("Please enter the end date (most current month, day, year).");
				System.out.print("Enter the month: ");
				userMonth1 = scnr.nextInt();
				System.out.print("Enter the day: ");
				userDay1 = scnr.nextInt();
				System.out.print("Enter the year: ");
				userYear1 = scnr.nextInt();
				
				
				System.out.println("Enter the start date (earliest month, day, year)." );
				System.out.print("Enter the month: ");
				userMonth2 = scnr.nextInt();
				System.out.print("Enter the day: ");
				userDay2 = scnr.nextInt();
				System.out.print("Please enter the year: ");
				userYear2 = scnr.nextInt();
		
		
				System.out.println("This is the start date: " + userMonth2 + ", " + userDay2 + ", " + userYear2);
				System.out.println("This is the end date: " + userMonth1 + ", " + userDay1 + ", " + userYear1);
				
				//used to compute difference of dates
				finalMonth = userMonth1 - userMonth2; 
				finalDay = userDay1 - userDay2; 
				finalYear = userYear1 - userYear2;
				
				System.out.println("The difference between dates is " + finalYear + " years, " + finalMonth + " months, " + finalDay + " and days.");
				
			
	
				
				
				
				
			}
		}
		
		
		


