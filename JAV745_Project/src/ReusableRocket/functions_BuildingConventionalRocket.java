package ReusableRocket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class functions_BuildingConventionalRocket {
	static String conventionalRocketResult = "";
	static void InputForRocketSpeedCalculation_Conventional(ConventionalRocketModel ConventionalRocket,Scanner sc){
		//String conventionalRocketResult = "";
		System.out.println("Please enter the estimate time and distance for calculate Conventional Rocket Speed. ");
		System.out.println("Please choose the unit base on SECONDS or MINUTES, Seconds enter 1, Minutes enter 2: ");
		int selectSecondsOrMinutes = 0;
		try {
		selectSecondsOrMinutes = sc.nextInt();
		if (selectSecondsOrMinutes == 2) {
			System.out.println("Please enter the estimate time: ");
			double time_Double = sc.nextDouble();
			System.out.println("Please enter the estimate distance base on KILOMETER.: ");
			double distance_Double = sc.nextDouble();
			//System.out.println("The speed of rocket is :" + ConventinalRocket.calculateRocketSpeed(time_Double, distance_Double)+ "\n");
			conventionalRocketResult = "The speed of rocket is :" + ConventionalRocket.calculateRocketSpeed(time_Double, distance_Double)+ "\n";
		}else if(selectSecondsOrMinutes == 1) {
			System.out.println("Please enter the estimate time: ");
			int time_Int = sc.nextInt();
			System.out.println("Please enter the estimate distance base on METER: ");
			int distance_Int = sc.nextInt();
			//System.out.println("The speed of rocket is :" + ConventionalRocket.calculateRocketSpeed(time_Int, distance_Int)+ "\n");
			conventionalRocketResult = "The speed of rocket is :" + ConventionalRocket.calculateRocketSpeed(time_Int, distance_Int)+ "\n";
		}else {
			System.out.println("It has to choose from either Seconds or Minutes, please try again! \n");
			InputForRocketSpeedCalculation_Conventional(ConventionalRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}finally {
			System.out.print(conventionalRocketResult);
		}
	} 
	
	static void DisplayConventionalRocket () {
		System.out.print(conventionalRocketResult);
	}

}
