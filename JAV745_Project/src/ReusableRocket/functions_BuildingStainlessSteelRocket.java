package ReusableRocket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class functions_BuildingStainlessSteelRocket {

	static String StainlessSteelRocketResult = "";
	static void InputForRocketTemperatureTolerance_StainlessSteel(StainlessSteelRocketModel StainlessSteelRocket,Scanner sc){
		//String StainlessSteelRocketResult = "";
		System.out.println("Please enter the estimate time and temperature for calculate rocket tolerance. ");
		System.out.println("Please choose the unit base on SECONDS or MINUTES, Seconds enter 1, Minutes enter 2: ");
		int selectSecondsOrMinutes = 0;
		try {
		selectSecondsOrMinutes = sc.nextInt();	
		if (selectSecondsOrMinutes == 2) {
			System.out.println("Please enter the estimate time: ");
			double time_Double = sc.nextDouble();
			System.out.println("Please enter the estimate temperature base on Celsius: ");
			double temperature_Double = sc.nextDouble();
			//System.out.println("The speed of rocket is :" + StainlessSteelRocket.calculateTemperatureTolerance(time_Double, temperature_Double) + "\n");
			StainlessSteelRocketResult = "The speed of rocket is :" + StainlessSteelRocket.calculateTemperatureTolerance(time_Double, temperature_Double) + "\n";
		}else if(selectSecondsOrMinutes == 1) {
			System.out.println("Please enter the estimate time: ");
			int time_Int = sc.nextInt();
			System.out.println("Please enter the estimate temperature base on Celsius: ");
			int temperature_Int = sc.nextInt();
			//System.out.println("The speed of rocket is :" + StainlessSteelRocket.calculateTemperatureTolerance(time_Int, temperature_Int) + "\n");
			StainlessSteelRocketResult = "The speed of rocket is :" + StainlessSteelRocket.calculateTemperatureTolerance(time_Int, temperature_Int) + "\n";
		}else {
			System.out.println("It has to choose from either Seconds or Minutes, please try again! \n");
			InputForRocketTemperatureTolerance_StainlessSteel(StainlessSteelRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}finally {
			System.out.print(StainlessSteelRocketResult);
		}

	} 
	
	static void DisplayStainlessSteelRocket () {
		System.out.print(StainlessSteelRocketResult);
	}
}
