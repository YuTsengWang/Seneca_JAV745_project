package ReusableRocket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class functions_BuildingOriginalRocket {
	static String rocketSatellitesResult = "";
	static String rocketStarlinkHighSpeedInternetResult = "";
	static void InputForRocketSatellites_Original(Rocket OriginalRocket,Scanner sc){
		//String rocketSatellitesResult = "";
		System.out.println("Please enter the estimate speed and distance for calculate rocket satellites. ");
		System.out.println("Please choose the unit base on m/s or km/s, m/s enter 1, km/s enter 2: ");
		int selectMSOrKMS = 0;
		try {
		selectMSOrKMS = sc.nextInt();
		if(selectMSOrKMS == 2) {
			System.out.println("Please enter the estimate speed: ");
			double speed_Double = sc.nextDouble();
			System.out.println("Please enter the estimate distance base on KILOMETER: ");
			double distance_Double = sc.nextDouble();
			//System.out.println("The number of rocket satellite is :" + OriginalRocket.satellites(speed_Double, distance_Double));
			rocketSatellitesResult = "The number of rocket satellite is :" + OriginalRocket.satellites(speed_Double, distance_Double) + "\n";
		}else if(selectMSOrKMS == 1) {
			System.out.println("Please enter the estimate speed: ");
			int speed_Int = sc.nextInt();
			System.out.println("Please enter the estimate distance base on METER: ");
			int distance_Int = sc.nextInt();
			//System.out.println("The number of rocket satellite is :" + OriginalRocket.satellites(speed_Int, distance_Int));
			rocketSatellitesResult = "The number of rocket satellite is :" + OriginalRocket.satellites(speed_Int, distance_Int) + "\n";
		}else {
			System.out.println("It has to choose from either m/s or km/s, please try again!");
			InputForRocketSatellites_Original(OriginalRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}finally {
			System.out.print(rocketSatellitesResult);
		}
		
	}

	static void InputForRocketStarlinkHighSpeedInternetCalculation_Original(Rocket OriginalRocket,Scanner sc){
		//String rocketStarlinkHighSpeedInternetResult = "";
		System.out.println("Please enter the estimate power for calculate starlink high speed internet. ");
		System.out.println("Please choose the unit base on W or KW , W enter 1, KW enter 2: ");
		int selectWOrKW = 0;
		try {
		selectWOrKW = sc.nextInt();	
		if(selectWOrKW == 2) {
			System.out.println("Please enter the estimate power: ");
			double power_Double = sc.nextDouble();
			//System.out.println("The starlink high speed internet of rocket is :" + OriginalRocket.StarlinkHighSpeedInternet(power_Double));
			rocketStarlinkHighSpeedInternetResult = "The starlink high speed internet of rocket is :" + OriginalRocket.StarlinkHighSpeedInternet(power_Double) + "\n";
		}else if (selectWOrKW == 1){
			System.out.println("Please enter the estimate power: ");
			int power_Int = sc.nextInt();
			//System.out.println("The starlink high speed internet of rocket is :" + OriginalRocket.StarlinkHighSpeedInternet(power_Int));
			rocketStarlinkHighSpeedInternetResult = "The starlink high speed internet of rocket is :" + OriginalRocket.StarlinkHighSpeedInternet(power_Int) + "\n";
		}else {
			System.out.println("It has to choose from either W or KW, please try again!");
			InputForRocketStarlinkHighSpeedInternetCalculation_Original(OriginalRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}finally {
			System.out.print(rocketStarlinkHighSpeedInternetResult);
		}
		
	}
	
		
	static void InputForAirfoils_Original(Rocket OriginalRocket,Scanner sc){
		System.out.println("Please set Airfoils, Elliptical enter 1, Trapezoidal enter 2, Square enter 3, Rectangular enter 4, Clipped Delta enter 5: ");
		int selectAifoils = 0;
		try {
		selectAifoils = sc.nextInt();
		OriginalRocket.setAirfoils(selectAifoils);
		
		switch (OriginalRocket.getAirfoils()){ //int
			case 1:
				System.out.print("Choose Elliptical. \n");
				break;
			case 2:
				System.out.print("Choose Trapezoidal.\n");
				break;
			case 3:
				System.out.print("Choose Square. \n");
				break;
			case 4:
				System.out.print("Choose Rectangular. \n");
				break;
			case 5:
				System.out.print("Choose Clipped Delta. \n");
				break;
			default:
				System.out.print("Please choose the number from the selection! \n");
				InputForAirfoils_Original(OriginalRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}
		
	}
	
	
	static void InputForAuxiliaryReactionEngines_Original(Rocket OriginalRocket,Scanner sc){
		System.out.println("Please set Auxiliary Reaction Engines, Thermal Rockets enter 1, Chemical Rockets enter 2: ");
		int selectAuxiliaryReactionEngines = 0;
		try {
		selectAuxiliaryReactionEngines = sc.nextInt();
		OriginalRocket.setAuxiliaryReactionEngines(selectAuxiliaryReactionEngines);
		
		switch(OriginalRocket.getAuxiliaryReactionEngines()){//int
			case 1:
				System.out.print("Choose Thermal Rockets. \n");
				break;
			case 2:
				System.out.print("Choose Chemical Rockets. \n");
				break;
			default:
				System.out.print("Please choose the number from the selection! \n");
				InputForAuxiliaryReactionEngines_Original(OriginalRocket,sc);
		
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}
		
	}
	
	static void InputForMomentumWheels_Original(Rocket OriginalRocket,Scanner sc){
		System.out.println("Please set Momentum Wheels, One-axis enter 1, Two-axis enter 2, Three-axis enter 3: ");
		int selectMomentumWheels = 0;
		try {
		selectMomentumWheels = sc.nextInt();
		OriginalRocket.setMomentumWheels(selectMomentumWheels);
		
		switch(OriginalRocket.getMomentumWheels()){//int
			case 1:
				System.out.print("Choose One-axis. \n");
				break;
			case 2:
				System.out.print("Choose Two-axis. \n");
				break;
			case 3:
				System.out.print("Choose Three-axis. \n");
				break;	
			default:
				System.out.print("Please choose the number from the selection! \n");
				InputForMomentumWheels_Original(OriginalRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}
	}
	
	static void InputForGimballedThrust_Original(Rocket OriginalRocket,Scanner sc){
		System.out.println("Please set Gimballed Thrust, Left-line enter 1, Straight-line enter 2, Right-line enter 3: ");
		int selectGimballedThrust = 0;
		try {
		selectGimballedThrust = sc.nextInt();
		OriginalRocket.setGimballedThrust(selectGimballedThrust);
		
		switch(OriginalRocket.getGimballedThrust()){//int
			case 1:
				System.out.print("Choose Left-line. \n");
				break;
			case 2:
				System.out.print("Choose Straight-line. \n");
				break;
			case 3:
				System.out.print("Choose Right-line. \n");
				break;	
			default:
				System.out.print("Please choose the number from the selection! \n");
				InputForGimballedThrust_Original(OriginalRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}
		
	}
	
	
	static void InputForDeflectionOfExhaustStream_Original(Rocket OriginalRocket,Scanner sc){
		System.out.println("Please set Deflection Of Exhaust Stream, VTOL enter 1, STOL enter 2: ");
		int selectDeflectionOfExhaustStream = 0;
		try {
		selectDeflectionOfExhaustStream = sc.nextInt();
		OriginalRocket.setDeflectionOfExhaustStream(selectDeflectionOfExhaustStream);
		
		switch(OriginalRocket.getDeflectionOfExhaustStream()){//int
			case 1:
				System.out.print("Choose VTOL. \n");
				break;
			case 2:
				System.out.print("Choose STOL. \n");
				break;
			default:
				System.out.print("Please choose the number from the selection! \n");
				InputForDeflectionOfExhaustStream_Original(OriginalRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}
		
	}
	
	
	static void InputForStoredPropellant_Original(Rocket OriginalRocket,Scanner sc){
		System.out.println("Please set Stored Propelland, Monopropellant enter 1, Hypergolic-propellants enter 2, Liquid-propellant enter 3, Hybird-propellant enter 4: ");
		int selectstoredPropellant = 0;
		try {
		selectstoredPropellant = sc.nextInt();
		OriginalRocket.setStoredPropellant(selectstoredPropellant);
		
		switch (OriginalRocket.getStoredPropellant()){ //int
			case 1:
				System.out.print("Choose Monopropellant. \n");
				break;
			case 2:
				System.out.print("Choose Hypergolic-propellants.\n");
				break;
			case 3:
				System.out.print("Choose Liquid-propellant. \n");
				break;
			case 4:
				System.out.print("Choose Hybird-propellant. \n");
				break;
			default:
				System.out.print("Please choose the number from the selection! \n");
				InputForStoredPropellant_Original(OriginalRocket,sc);
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}
		
	}
	
	static void DisplayOriginalRocket (Rocket OriginalRocket) {
		try {
		System.out.print(rocketSatellitesResult);
		System.out.print(rocketStarlinkHighSpeedInternetResult);
				
		String[] airfoils = {"Elliptical", "Trapezoidal", "Square", "Rectangular", "Clipped Delta"};
		System.out.print("The shape of airfoils is " + airfoils[OriginalRocket.getAirfoils()] + "\n");
		
		String[] auxiliaryReaction = {"Thermal Rockets", "Chemical Rockets"};
		System.out.print("The type of reaction engines is " + auxiliaryReaction[OriginalRocket.getAuxiliaryReactionEngines()] +"\n");
	
		String[] momentWheels = {"One-axis", "Two-axis", "Three-axis"};
		System.out.print("The type of momentum wheels is " + momentWheels[OriginalRocket.getMomentumWheels()] +"\n");
		
		String[] gimballThrust = {"Left-line", "Straight-line", "Right-line"};
		System.out.print("The type of gimballed thrust is " + gimballThrust[OriginalRocket.getGimballedThrust()] +"\n");
		
		String[] deflectionExhaustStream = {"VTOL", "STOL"};
		System.out.print("The type of exhaust stream is " + deflectionExhaustStream[OriginalRocket.getDeflectionOfExhaustStream()] +"\n");
		
		String[] storedPropellant = {"Monopropellant", "Hypergolic-propellants", "Liquid-propellant", "Hybird-propellant"};
		System.out.print("The type of stored propelland is " + storedPropellant[OriginalRocket.getStoredPropellant()] +"\n");
		}catch(Exception e) {
			System.out.print("Error: " + e.getMessage());
		}

	}
	
}
	
