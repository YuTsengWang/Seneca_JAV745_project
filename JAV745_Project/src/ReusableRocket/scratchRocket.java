package ReusableRocket;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class scratchRocket {
	
	static void scratchRocketBuilding(Scanner sc){
		
		//Build Rocket
		System.out.println("Here is the menu of the rocket model.\n Enter 1 for building Conventional Rocket. \n Enter 2 for building Hydrogen Rocket. \n Enter 3 for building Reusable Rocket. \n Enter 4 for building StainlessSteel Rocket.");
		int modelSettings = 0;  
		
		try {
		modelSettings = sc.nextInt(); 
		System.out.println("Please enter the name of the rocket.");
		String RocketName = sc.next();
		System.out.println("Please enter the company of the rocket.");
		String RocketCompany = sc.next();
		System.out.println("Please enter the type of the rocket.");
		String RocketType = sc.next();
		System.out.println("Please enter the country owner of the rocket.");
		String CountryOfRocketOwner = sc.next();
		System.out.println("Please enter the height of the rocket.");
		int RocketHeight = sc.nextInt();   		
		System.out.println("Please enter the payload capacity of the rocket.");
		int RocketPayloadCapacity = sc.nextInt();
		System.out.println("Please enter the frquency of reuse times of the rocket.");
		int ReuseTimes = sc.nextInt();
		System.out.println("Please enter the launch status of the rocket.");
		String LaunchStatus = sc.next();
		System.out.println("Please enter the launch time of the rocket.");
		String LaunchTime = sc.next();
		System.out.println("Please enter whether the rocket launch on time.");
		Boolean SuccessfulLaunchOnTime = sc.nextBoolean();
		System.out.println("Please enter whether the rocket recovered.");
		Boolean StatusOfRecovered = sc.nextBoolean();
		System.out.println("Please enter whether the rocket relaunched.");
		Boolean StatusOfRelaunched = sc.nextBoolean();
		System.out.println("Please enter how many airfoils of the rocket.");
		int airfoils = sc.nextInt();
		System.out.println("Please enter how many auxiliary reaction engines of the rocket.");
		int auxiliaryReactionEngines= sc.nextInt();
		System.out.println("Please enter how many gimballed thrusts of the rocket.");
		int gimballedThrust = sc.nextInt();
		System.out.println("Please enter how many momentum wheels of the rocket.");
		int momentumWheels = sc.nextInt();
		System.out.println("Please enter how many deflection Of exhaust streams of the rocket.");
		int deflectionOfExhaustStream = sc.nextInt();
		System.out.println("Please enter how many stored propellant  of the rocket.");
		int storedPropellant = sc.nextInt();
		
		switch (modelSettings) {
			case 1:
				ConventionalRocketModel cr = new ConventionalRocketModel(RocketName, RocketHeight, RocketPayloadCapacity, ReuseTimes, LaunchTime, SuccessfulLaunchOnTime, RocketCompany, RocketType, CountryOfRocketOwner, LaunchStatus, StatusOfRecovered, StatusOfRelaunched, airfoils, auxiliaryReactionEngines, gimballedThrust, momentumWheels, deflectionOfExhaustStream, storedPropellant);
				
				functions_BuildingOriginalRocket.InputForRocketSatellites_Original(cr,sc);
		        functions_BuildingOriginalRocket.InputForRocketStarlinkHighSpeedInternetCalculation_Original(cr,sc);
		    	functions_BuildingOriginalRocket.InputForAirfoils_Original(cr,sc);
		    	functions_BuildingOriginalRocket.InputForAuxiliaryReactionEngines_Original(cr,sc);
		    	functions_BuildingOriginalRocket.InputForMomentumWheels_Original(cr,sc);
		    	functions_BuildingOriginalRocket.InputForGimballedThrust_Original(cr,sc);
		    	functions_BuildingOriginalRocket.InputForDeflectionOfExhaustStream_Original(cr,sc);
		    	functions_BuildingOriginalRocket.InputForStoredPropellant_Original(cr,sc);
				
				functions_BuildingConventionalRocket.InputForRocketSpeedCalculation_Conventional((cr),sc);
				
				System.out.println(
	            		"\n \n RocketName: " + cr.getRocketName().toString() 
	            		+ ", Rocket Company: " + cr.getRocketCompany() 
	            		+ ", Rocket Type: " + cr.getRocketType() 
	            		+ ", Country of Rocket Owner: " + cr.getOwnerCountry() 
	            		+ ", Rocket Height: " + cr.getHeight()             		
	            		+ ", Rocket Pay load Capacity: " + cr.getRocketPayloadCapacity() 
	            		+ ", Reuse Times: " + cr.getNumberOfReuse() 
	            		+ ", Launch Status:" + cr.getLunchStatus()
	            		+ ", Launch Time: " + cr.getLaunchDateAndTime() 
	            		+ ", Successful Launch On Time: " + cr.isLaunchOnTimeSuccess()     				 
	    				+ ", Status of Recovered: " + cr.isRecovered() 
	    				+ ", Status of Relaunched: " + cr.isRelaunched()    				
	    				+ "\n");
				cr.gravity();
				cr.momentum();
				cr.spin();
				cr.propellantFlow();
				functions_BuildingOriginalRocket.DisplayOriginalRocket (cr);
				landingMethodDisplay(cr.landingMethod());//int
				OrbitMethodDisplay(cr.orbitMethod());//int		
				//boolean
				EntryMethodDisplay(cr.ExtraWeight(),cr.HeatShield(),cr.Refurbishment(),cr.RetrogradeThrust());
				
				functions_BuildingConventionalRocket.DisplayConventionalRocket();
				System.out.print("The number of convention is : "+cr.convention()/66 + "\n" );//int    
				break;
			case 2:
				HydrogenRocketModel hr = new HydrogenRocketModel(RocketName, RocketHeight, RocketPayloadCapacity, ReuseTimes, LaunchTime, SuccessfulLaunchOnTime, RocketCompany, RocketType, CountryOfRocketOwner, LaunchStatus, StatusOfRecovered, StatusOfRelaunched, airfoils, auxiliaryReactionEngines, gimballedThrust, momentumWheels, deflectionOfExhaustStream, storedPropellant);

				functions_BuildingOriginalRocket.InputForRocketSatellites_Original(hr,sc);
		        functions_BuildingOriginalRocket.InputForRocketStarlinkHighSpeedInternetCalculation_Original(hr,sc);
		    	functions_BuildingOriginalRocket.InputForAirfoils_Original(hr,sc);
		    	functions_BuildingOriginalRocket.InputForAuxiliaryReactionEngines_Original(hr,sc);
		    	functions_BuildingOriginalRocket.InputForMomentumWheels_Original(hr,sc);
		    	functions_BuildingOriginalRocket.InputForGimballedThrust_Original(hr,sc);
		    	functions_BuildingOriginalRocket.InputForDeflectionOfExhaustStream_Original(hr,sc);
		    	functions_BuildingOriginalRocket.InputForStoredPropellant_Original(hr,sc);
				
				functions_BuildingHydrogenRicket.InputForRocketFuelCalculation_Hydrogen(hr,sc);
				
				System.out.println(
	            		"\n \n RocketName: " + hr.getRocketName().toString() 
	            		+ ", Rocket Company: " + hr.getRocketCompany() 
	            		+ ", Rocket Type: " + hr.getRocketType() 
	            		+ ", Country of Rocket Owner: " + hr.getOwnerCountry() 
	            		+ ", Rocket Height: " + hr.getHeight()             		
	            		+ ", Rocket Pay load Capacity: " + hr.getRocketPayloadCapacity() 
	            		+ ", Reuse Times: " + hr.getNumberOfReuse() 
	            		+ ", Launch Status:" + hr.getLunchStatus()
	            		+ ", Launch Time: " + hr.getLaunchDateAndTime() 
	            		+ ", Successful Launch On Time: " + hr.isLaunchOnTimeSuccess()     				 
	    				+ ", Status of Recovered: " + hr.isRecovered() 
	    				+ ", Status of Relaunched: " + hr.isRelaunched()    				
	    				+ "\n");
				hr.gravity();
				hr.momentum();
				hr.spin();
				hr.propellantFlow();
				functions_BuildingOriginalRocket.DisplayOriginalRocket (hr);
				landingMethodDisplay(hr.landingMethod());//int
				OrbitMethodDisplay(hr.orbitMethod());//int		
				//boolean
				EntryMethodDisplay(hr.ExtraWeight(),hr.HeatShield(),hr.Refurbishment(),hr.RetrogradeThrust());
				
				functions_BuildingHydrogenRicket.DisplayHydrogenRocket();
				System.out.print("The number of reusable is : "+hr.hydrogen()*66 + "\n"); //int 
				break;
			case 3:
				ReusableRocketModel rr = new ReusableRocketModel(RocketName, RocketHeight, RocketPayloadCapacity, ReuseTimes, LaunchTime, SuccessfulLaunchOnTime, RocketCompany, RocketType, CountryOfRocketOwner, LaunchStatus, StatusOfRecovered, StatusOfRelaunched, airfoils, auxiliaryReactionEngines, gimballedThrust, momentumWheels, deflectionOfExhaustStream, storedPropellant);

				functions_BuildingOriginalRocket.InputForRocketSatellites_Original(rr,sc);
		        functions_BuildingOriginalRocket.InputForRocketStarlinkHighSpeedInternetCalculation_Original(rr,sc);
		    	functions_BuildingOriginalRocket.InputForAirfoils_Original(rr,sc);
		    	functions_BuildingOriginalRocket.InputForAuxiliaryReactionEngines_Original(rr,sc);
		    	functions_BuildingOriginalRocket.InputForMomentumWheels_Original(rr,sc);
		    	functions_BuildingOriginalRocket.InputForGimballedThrust_Original(rr,sc);
		    	functions_BuildingOriginalRocket.InputForDeflectionOfExhaustStream_Original(rr,sc);
		    	functions_BuildingOriginalRocket.InputForStoredPropellant_Original(rr,sc);
				
				functions_BuildingReusableRocket.InputForRocketReusableTimeCalculation_Reusable(rr,sc);
				
				System.out.println(
	            		"\n \n RocketName: " + rr.getRocketName().toString() 
	            		+ ", Rocket Company: " + rr.getRocketCompany() 
	            		+ ", Rocket Type: " + rr.getRocketType() 
	            		+ ", Country of Rocket Owner: " + rr.getOwnerCountry() 
	            		+ ", Rocket Height: " + rr.getHeight()             		
	            		+ ", Rocket Pay load Capacity: " + rr.getRocketPayloadCapacity() 
	            		+ ", Reuse Times: " + rr.getNumberOfReuse() 
	            		+ ", Launch Status:" + rr.getLunchStatus()
	            		+ ", Launch Time: " + rr.getLaunchDateAndTime() 
	            		+ ", Successful Launch On Time: " + rr.isLaunchOnTimeSuccess()     				 
	    				+ ", Status of Recovered: " + rr.isRecovered() 
	    				+ ", Status of Relaunched: " + rr.isRelaunched()    				
	    				+ "\n");
				rr.gravity();
				rr.momentum();
				rr.spin();
				rr.propellantFlow();
				functions_BuildingOriginalRocket.DisplayOriginalRocket (rr);
				landingMethodDisplay(rr.landingMethod());//int
				OrbitMethodDisplay(rr.orbitMethod());//int		
				//boolean
				EntryMethodDisplay(rr.ExtraWeight(),rr.HeatShield(),rr.Refurbishment(),rr.RetrogradeThrust());
				
				functions_BuildingReusableRocket.DisplayReusableRocket();
				System.out.print("The number of reusable time is : "+rr.resuable()+ 66 + "\n" ); //int				
				break;
			case 4:
				StainlessSteelRocketModel sr = new StainlessSteelRocketModel(RocketName, RocketHeight, RocketPayloadCapacity, ReuseTimes, LaunchTime, SuccessfulLaunchOnTime, RocketCompany, RocketType, CountryOfRocketOwner, LaunchStatus, StatusOfRecovered, StatusOfRelaunched, airfoils, auxiliaryReactionEngines, gimballedThrust, momentumWheels, deflectionOfExhaustStream, storedPropellant);

				functions_BuildingOriginalRocket.InputForRocketSatellites_Original(sr,sc);
		        functions_BuildingOriginalRocket.InputForRocketStarlinkHighSpeedInternetCalculation_Original(sr,sc);
		    	functions_BuildingOriginalRocket.InputForAirfoils_Original(sr,sc);
		    	functions_BuildingOriginalRocket.InputForAuxiliaryReactionEngines_Original(sr,sc);
		    	functions_BuildingOriginalRocket.InputForMomentumWheels_Original(sr,sc);
		    	functions_BuildingOriginalRocket.InputForGimballedThrust_Original(sr,sc);
		    	functions_BuildingOriginalRocket.InputForDeflectionOfExhaustStream_Original(sr,sc);
		    	functions_BuildingOriginalRocket.InputForStoredPropellant_Original(sr,sc);
				
				functions_BuildingStainlessSteelRocket.InputForRocketTemperatureTolerance_StainlessSteel(sr,sc);
				
				System.out.println(
	            		"\n \n RocketName: " + sr.getRocketName().toString() 
	            		+ ", Rocket Company: " + sr.getRocketCompany() 
	            		+ ", Rocket Type: " + sr.getRocketType() 
	            		+ ", Country of Rocket Owner: " + sr.getOwnerCountry() 
	            		+ ", Rocket Height: " + sr.getHeight()             		
	            		+ ", Rocket Pay load Capacity: " + sr.getRocketPayloadCapacity() 
	            		+ ", Reuse Times: " + sr.getNumberOfReuse() 
	            		+ ", Launch Status:" + sr.getLunchStatus()
	            		+ ", Launch Time: " + sr.getLaunchDateAndTime() 
	            		+ ", Successful Launch On Time: " + sr.isLaunchOnTimeSuccess()     				 
	    				+ ", Status of Recovered: " + sr.isRecovered() 
	    				+ ", Status of Relaunched: " + sr.isRelaunched()    				
	    				+ "\n");
				sr.gravity();
				sr.momentum();
				sr.spin();
				sr.propellantFlow();
				functions_BuildingOriginalRocket.DisplayOriginalRocket (sr);
				landingMethodDisplay(sr.landingMethod());//int
				OrbitMethodDisplay(sr.orbitMethod());//int		
				//boolean
				EntryMethodDisplay(sr.ExtraWeight(),sr.HeatShield(),sr.Refurbishment(),sr.RetrogradeThrust());
				
				functions_BuildingStainlessSteelRocket.DisplayStainlessSteelRocket();
				System.out.print( "The number of stainless tolerance is : " + sr.stainlessSteel()+ "\n"); //int
				
				break;
			default:
				
				break;
		}
		}catch(InputMismatchException e) {
			System.out.print("Error: Input should only be a single number.");
		}
		
	}
	
	private static void landingMethodDisplay(int landingMethod) {
		try {
		switch (landingMethod) {
			case 1:
				System.out.print("Landing System: Braking.\n");
				break;
			case 2:
				System.out.print("Landing System: Horizontal (Winged).\n");
				break;
			case 3:
				System.out.print("Landing System: Vertical (Retrograde).\n");
				break;
			case 4:
				System.out.print("Landing System: Aerostatic Force.\n");
				break;
			default:
				
				break;
		}
		}catch(Exception e) {
			System.out.print("Error: " + e.getMessage());
		}
			
	}
	
	private static void OrbitMethodDisplay(int OrbitMethod) {
		try {
		switch (OrbitMethod) {
			case 1:
				System.out.print("Landing System: Single-stage-to-orbit.\n");
				break;
			case 2:
				System.out.print("Landing System: Two-stage-to-orbit.\n");
				break;
			case 3:
				System.out.print("Landing System: Multiple-stage-to-orbit.\n");
				break;
			default:
				
				break;
		}
		}catch(Exception e) {
			System.out.print("Error: " + e.getMessage());
		}
			
	}
	private static void EntryMethodDisplay(boolean ExtraWeight, boolean HeatShield, boolean Refurbishment, boolean RetrogradeThrust) {
		ArrayList<String> entryMethod = new ArrayList<String>();
		try {
		if(ExtraWeight){
			entryMethod.add("Extra Weight Ability is ON");
		}else {
			entryMethod.add("Extra Weight Ability is OFF");
		}
		if(HeatShield){
			entryMethod.add("Heat Shield is ON");
		}else {
			entryMethod.add("Heat Shield is OFF");
		}
		if(Refurbishment){
			entryMethod.add("Refurbishment is ON");
		}else {
			entryMethod.add("Refurbishment is OFF");
		}
		if(RetrogradeThrust){
			entryMethod.add("Retrograde Thrust is ON");
		}else {
			entryMethod.add("Retrograde Thrust is OFF");
		}			
		}catch(Exception e) {
			System.out.print("Error: " + e.getMessage());
		}finally {		
		System.out.print(entryMethod + "\n");
		}
		
	}

}
