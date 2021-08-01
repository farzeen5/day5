package day5;
import java.util.Scanner;


public class day5 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
				System.out.println("enter dividend :");
		int dividend = a.nextInt();
				Scanner b = new Scanner(System.in);
				System.out.println("enter divisor :");
		int divisor = b.nextInt();
				
		 int quotient = dividend / divisor;
		    int remainder = dividend % divisor;

		    System.out.println("Quotient = " + quotient);
		    System.out.println("Remainder = " + remainder);
		  }
		}
