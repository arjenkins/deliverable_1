package lab_1;

import java.util.Scanner;

public class part_one {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int userNum1; // 1st three digit number for user to enter
		int userNum2; // 2nd three digit number for user to enter

		int ones1; // value of 1st three digit ones place
		int tens1; // value of 1st three digit number tens place
		int hundrd1; // value of 1st three digit number hundreds place

		int ones2; // values of 2nd three digit number ones place
		int tens2; // value of 2nd three digit number tens place
		int hundrd2; // value of 2nd three digit number hundreds place

		int sumOnes; // sum of both three digit numbers ones place
		int sumTens; // sum of both three digit numbers tens place
		int sumHundrds; // sum of both three digit numbers hundreds place

		System.out.print("Enter a three digit number: "); // user prompt to enter number
		userNum1 = input.nextInt();
		while (userNum1 > 999 || userNum1 < 100) {    //validation to make sure numbers are in range
			System.out.println("Amount of numbers entered is not valid. Please enter a three digit number.");
			userNum1 = input.nextInt();
		}
		System.out.print("Enter a three digit number: "); // user prompt to enter number
		userNum2 = input.nextInt();
		while (userNum2 > 999 || userNum2 < 100) {   //validation to make sure numbers are in range
			System.out.println("Amount of numbers entered is not valid. Please enter a three digit number.");
			userNum2 = input.nextInt();
		}

		ones1 = userNum1 % 10;             // value of ones place digit
		tens1 = (userNum1 % 100) / 10;     // value of tens place digit
		hundrd1 = userNum1 / 100;          // value of hundreds place digit

		ones2 = userNum2 % 10;             // value of ones place digit
		tens2 = (userNum2 % 100) / 10;     // value of tens place digit
		hundrd2 = userNum2 / 100;          // value of hundreds place digit

		sumOnes = ones1 + ones2;           // sum of ones place
		sumTens = tens1 + tens2;           // sum of tens place
		sumHundrds = hundrd1 + hundrd2;    // sum of hundreds place

		if ((sumOnes == sumTens) && (sumTens == sumHundrds)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}
}
