package day5;

import java.util.Random;


public class day5 {

	public static void main(String[] args) {
		
		float heads = 0;
		float tails = 0;
		for (int i = 0;i < 50;i++) {
			Random r = new Random();
			int flip = r.nextInt(2);
			if (flip == 0)
				heads = heads+1;
			else
				tails = tails+1;
				
		}
		System.out.println("heads won:" + heads);
		System.out.println("tails won:" + tails);
		System.out.printf("tails percentage is : %.2f\n", (tails / (heads + tails)) *100);
		System.out.printf("heads percentage is : %.2f\n", (heads / (heads + tails)) *100);
		}
	
}
