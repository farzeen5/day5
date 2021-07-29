package day5;

import java.util.Scanner;

public class day5 {

	public static void main(String[] args) {
		int year;
		Scanner reader = new Scanner(System.in);

		System.out.println(" Please Enter any year : ");
		year = reader.nextInt();

		if (year % 4 == 0) {
			System.out.format("is a Leap Year. ", +year);
		} else {
			System.out.format("is NOT a Leap Year. ", +year);
		}

	}
}
