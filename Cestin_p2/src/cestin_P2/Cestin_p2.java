package cestin_P2;

import java.util.Scanner;

public class Cestin_p2 {
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner Scan = new Scanner (System.in);
	
	double userWeight;
	double userHeight;
	double userOptions;
	double BMI;
	
	System.out.println("Which method did you want to use? " + "Press 1 for In Pounds or press 2 for Kilograms");
	userOptions = Scan.nextInt();
	
	if (userOptions==1){
		System.out.println("Enter Weight ");
		userWeight=Scan.nextFloat();
		System.out.println("Enter Height ");
		userHeight=Scan.nextFloat();
		userHeight=(userHeight)*(12);
		BMI=(703*(userWeight))/((userHeight)*(userHeight));
		System.out.println("BMI Is : "+BMI);
		
		System.out.println("BMI Categories: ");
	    System.out.println("Underweight = <18.5");
	    System.out.println("Normal weight = 18.5–24.9 5");
	    System.out.println("Overweight = 25–29.9");
	    System.out.println("Obesity = BMI of 30 or greater");
	    }
	else if (userOptions==2){
		System.out.println("Enter Weight ");
		userWeight=Scan.nextFloat();
		System.out.println("Enter Height ");
		userHeight=Scan.nextFloat();
		userHeight=userHeight*userHeight;
		BMI=(userWeight)/(userHeight);
		
		System.out.println("Your BMI Is : "+BMI);
        System.out.println("Your BMI Categories: ");
	    System.out.println("Underweight = < 18.5");
	    System.out.println("Normal weight = 18.5–24.9 5");
	    System.out.println("Overweight = 25–29.9");
	    System.out.println("Obesity = BMI of 30 or greater");
	    }
	else {
		System.out.println("Wrong input, please fallow the instruction next time.");
		//break;
		}
	}
}

