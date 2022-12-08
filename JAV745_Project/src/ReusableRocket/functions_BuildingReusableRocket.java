package ReusableRocket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class functions_BuildingReusableRocket {
	static String reusableRocketResult = "";
	static void InputForRocketReusableTimeCalculation_Reusable(ReusableRocketModel ReusableRocket,Scanner sc){
		//String reusableRocketResult = "";
		System.out.println("Please enter the estimate time for rocket Reusablility. ");
		System.out.println("Please choose the unit base on SECONDS or MINUTES, Seconds enter 1, Minutes enter 2: ");		
		int selectSecondsOrMinutes = 0;
		try {
		selectSecondsOrMinutes = sc.nextInt();
		if (selectSecondsOrMinutes == 2) {
			System.out.println("Please enter the estimate time: ");
			double time_Double = sc.nextDouble();
			//System.out.println("The reusablility of rocket is :" + ReusableRocket.calculateEconomicReusable(time_Double)+ "\n");
			reusableRocketResult = "The reusablility of rocket is :" + ReusableRocket.calculateEconomicReusable(time_Double)+ "\n";
		}else if(selectSecondsOrMinutes == 1) {
			System.out.println("Please enter the estimate time: ");
			int time_Int = sc.nextInt();
			//System.out.println("The reusablility of rocket is :" + ReusableRocket.calculateEconomicReusable(time_Int)+ "\n");
			reusableRocketResult = "The reusablility of rocket is :" + ReusableRocket.calculateEconomicReusable(time_Int)+ "\n";
		}else {
			System.out.println("It has to choose from either on milliter or liter, please try again! \n");
			InputForRocketReusableTimeCalculation_Reusable(ReusableRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}finally {
			System.out.print(reusableRocketResult);
		}

	} 
	
	static void DisplayReusableRocket () {
		System.out.print(reusableRocketResult);
	}

}
