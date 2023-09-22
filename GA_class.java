
import java.util.Scanner;
class Daro
{
	static void BMI()
	{
		//variables
		double weight, height, bmi;
		Scanner in = new Scanner(System.in);

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
		in.close();
	}
	public static void main(String[] args){
		BMI();
	}
}
