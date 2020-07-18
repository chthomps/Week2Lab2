//A program reading x,y coordinates for two points and calculates the distance between.

import java.util.Scanner;
import java.text.DecimalFormat;


public class DistCalc {

	public static void main(String[] args) {
		

		int x1, y1, x2, y2;
		double discriminant,dist;
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter a pair of (x,y) coordinates you would like to calculate the distance between. \nPlease hit return after each variable entry.\nThe first two entries will define (x1,y1) and the second two will define (x2,y2):");
		
		x1 = scan.nextInt();
		y1 = scan.nextInt();
		x2 = scan.nextInt();
		y2 = scan.nextInt();
		
		System.out.println("You entered coordinates: ("+x1+","+y1+") and ("+x2+","+y2+")");
		
		discriminant = Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2);
		dist = Math.sqrt(discriminant);
		
		//Round the output to three decimal places
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("The distance between your two coodrinates is:" + fmt.format(dist));
		scan.close();
	
		
		
	}

}
