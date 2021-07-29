package day5;
import java.util.Scanner;
public class day5 {

	public static void main(String[] args) {
		int number, square;
		Scanner reader = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = reader.nextInt();		
		
		square = number * number;
		
		System.out.println(" The Square of a Given Number  " + number + "  =  " + square);
	

	}

}
