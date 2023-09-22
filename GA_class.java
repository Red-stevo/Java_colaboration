/*this is a program to calculate the bmi of a user.
1. the user enters their weight and height.
1. then the BMI is calculated.
3. Finally the program displays to the users their BMI.*/
import java.util.Scanner;
class Daro
{
	static void BMI()
	{
		//variables
		double weight, height, bmi;
		Scanner input = new Scanner(System.in);

		//Ask the user to enter their weigth.
		System.out.print("Enter your Weight: ");
		weight = input.nextDouble();

		//Ask the user to enter the height
		System.out.print("Enter your Height:");
		height = input.nextDouble();

		//claculating the bmi
		bmi = weight/(height * height);

		//displaying the results to the user.
		System.out.println("Your BMI is: "+bmi);
		input.close();
	}
	public static void main(String[] args){
		BMI();
	}
}
