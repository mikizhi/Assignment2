/*
 *2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight. 
 *It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. 
 *Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
 *Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */


import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("In order to calculate your BMI (Body Mass Index) ");
		System.out.println("Please enter your weight in pounds: ");
		double weight = scan.nextDouble();
		
		System.out.println("Please enter your height in inches: ");
		double height = scan.nextDouble();
		
		
		double weightInKg = weight*0.45359237;
		double heightInM = height*0.0254;
		double bmiValue = weightInKg / (heightInM*heightInM);
		
		bmiValue = (int) (bmiValue * 10000) / 10000.0;
		
		System.out.println("Your BMI value is: "+ bmiValue);

		
	}

}
