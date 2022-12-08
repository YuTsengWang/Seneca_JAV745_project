package ReusableRocket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class functions_BuildingHydrogenRicket {
	static String hydrogenRocketResult = "";
	static void InputForRocketFuelCalculation_Hydrogen(HydrogenRocketModel HydrogenRocket,Scanner sc){
		//String hydrogenRocketResult = "";
		System.out.println("Please enter the estimate capacity for calculate rocket fuel. ");
		System.out.println("Please choose the unit base on MILLITER or LITER, Milliter enter 1, Liter enter 2: ");		
		int selectMilliterOrliter = 0;
		try {
		selectMilliterOrliter = sc.nextInt();
		if (selectMilliterOrliter == 2) {
			System.out.println("Please enter the estimate capacity: ");
			double capacity_Double = sc.nextDouble();
			//System.out.println("The speed of rocket is :" + HydrogenRocket.calculateFuel(capacity_Double)+ "\n");
			hydrogenRocketResult = "The speed of rocket is :" + HydrogenRocket.calculateFuel(capacity_Double)+ "\n";
		}else if(selectMilliterOrliter == 1) {
			System.out.println("Please enter the estimate capacity: ");
			int capacity_Int = sc.nextInt();
			//System.out.println("The speed of rocket is :" + HydrogenRocket.calculateFuel(capacity_Int)+ "\n");
			hydrogenRocketResult = "The speed of rocket is :" + HydrogenRocket.calculateFuel(capacity_Int)+ "\n";
		}else {
			System.out.println("It has to choose from either on milliter or liter, please try again! \n");
			InputForRocketFuelCalculation_Hydrogen(HydrogenRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}finally {
			System.out.print(hydrogenRocketResult);
		}
	} 
	
	static void DisplayHydrogenRocket () {
		System.out.print(hydrogenRocketResult);
	}

}
