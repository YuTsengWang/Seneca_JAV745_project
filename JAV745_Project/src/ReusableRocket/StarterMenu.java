package ReusableRocket;

import java.util.ArrayList;
import java.util.Scanner;


public class StarterMenu {
	
	public static void main(String[] args) {
		System.out.println("2022F JAV745 Project by Wang Yu Tseng (Vivianne) 181214214");
		
		startMenu();
		
		
		/*		
		//Demo Rocket
		ConventionalRocketModel cr = new ConventionalRocketModel("SpaceX", 1000, 10, 1, "2020-05-03 00:00:00", true, "NASA", "Orbital", "United States", "Retired", false, false, 4, 2, 4, 4, 6, 2);
		HydrogenRocketModel hr = new HydrogenRocketModel("Kosmos", 2000, 20, 2, "2020-05-05 00:00:00", false, "Roscosmos", "Suborbital", "Russia/USSR", "Prototype", true, false, 2, 1, 2, 2, 3, 1);
		ReusableRocketModel rr = new ReusableRocketModel("Long March", 3000, 30, 3, "2020-05-31 00:00:00", true, "China Academy of Launch Vehicle Technology", "Orbital", "China", "Under Development", false, true, 6, 3, 6, 6, 9, 3);
		StainlessSteelRocketModel sr = new StainlessSteelRocketModel("Ariane", 4000, 40, 4, "2020-02-17 00:00:00", false, "European Union", "Suborbital", "European Union", "Optional", true, true, 8, 4, 8, 8, 10, 8);

				
		ArrayList<Rocket> spaceRockets = new ArrayList<Rocket>();
		spaceRockets.add(cr);
		spaceRockets.add(hr);
		spaceRockets.add(rr);
		spaceRockets.add(sr);
		
		ArrayList<ConventionalRocketModel> spaceRockets_Conventional = new ArrayList<ConventionalRocketModel>();
		spaceRockets_Conventional.add(cr);
		
		ArrayList<HydrogenRocketModel> spaceRockets_Hydrogen = new ArrayList<HydrogenRocketModel>();
		spaceRockets_Hydrogen.add(hr);
		
		ArrayList<ReusableRocketModel> spaceRockets_Reusable = new ArrayList<ReusableRocketModel>();
		spaceRockets_Reusable.add(rr);
		
		ArrayList<StainlessSteelRocketModel> spaceRockets_StainlessSteels = new ArrayList<StainlessSteelRocketModel>();
		spaceRockets_StainlessSteels.add(sr);
		
		
        for (Rocket spaceRocket: spaceRockets){
            System.out.println(
            		"RocketName: " + spaceRocket.getRocketName().toString() 
            		+ ", Rocket Company: " + spaceRocket.getRocketCompany() 
            		+ ", Rocket Type: " + spaceRocket.getRocketType() 
            		+ ", Country of Rocket Owner: " + spaceRocket.getOwnerCountry() 
            		+ ", Rocket Height: " + spaceRocket.getHeight()             		
            		+ ", Rocket Pay load Capacity: " + spaceRocket.getRocketPayloadCapacity() 
            		+ ", Reuse Times: " + spaceRocket.getNumberOfReuse() 
            		+ ", Launch Status:" + spaceRocket.getLunchStatus()
            		+ ", Launch Time: " + spaceRocket.getLaunchDateAndTime() 
            		+ ", Successful Launch On Time: " + spaceRocket.isLaunchOnTimeSuccess()     				 
    				+ ", Status of Recovered: " + spaceRocket.isRecovered() 
    				+ ", Status of Relaunched: " + spaceRocket.isRelaunched()    				
    				+ "\n");
            
            spaceRocket.gravity();
			spaceRocket.momentum();
			spaceRocket.spin();
			spaceRocket.propellantFlow();
			
			System.out.println("\n");
			
            functions_BuildingOriginalRocket.InputForRocketSatellites_Original(spaceRocket,sc);
            functions_BuildingOriginalRocket.InputForRocketStarlinkHighSpeedInternetCalculation_Original(spaceRocket,sc);
    		functions_BuildingOriginalRocket.InputForAirfoils_Original(spaceRocket,sc);
    		functions_BuildingOriginalRocket.InputForAuxiliaryReactionEngines_Original(spaceRocket,sc);
    		functions_BuildingOriginalRocket.InputForMomentumWheels_Original(spaceRocket,sc);
    		functions_BuildingOriginalRocket.InputForGimballedThrust_Original(spaceRocket,sc);
    		functions_BuildingOriginalRocket.InputForDeflectionOfExhaustStream_Original(spaceRocket,sc);
    		functions_BuildingOriginalRocket.InputForStoredPropellant_Original(spaceRocket,sc);
    		
    		System.out.printf("The space probe of rocket is %.2f. And, the military payload is %.1f and the scientific payload is %.1f. \n", spaceRocket.spaceProbe(), spaceRocket.militaryPayload(), spaceRocket.scientificPayload());
          
    		if(spaceRocket.getClass().toString().contains("ConventionalRocketModel")) {
    			landingMethodDisplay(((ConventionalRocketModel) spaceRocket).landingMethod());//int
    			OrbitMethodDisplay(((ConventionalRocketModel) spaceRocket).orbitMethod());//int		
    			//boolean
    			EntryMethodDisplay(((ConventionalRocketModel) spaceRocket).ExtraWeight(),((ConventionalRocketModel) spaceRocket).HeatShield(),((ConventionalRocketModel) spaceRocket).Refurbishment(),((ConventionalRocketModel) spaceRocket).RetrogradeThrust());
    	    	
    			functions_BuildingConventionalRocket.InputForRocketSpeedCalculation_Conventional(((ConventionalRocketModel) spaceRocket),sc);
    			System.out.print("The number of convention is : "+((ConventionalRocketModel) spaceRocket).convention()/66 + "\n" );//int      			
    		}else if(spaceRocket.getClass().toString().contains("HydrogenRocketModel")) {
    			
    			landingMethodDisplay(((HydrogenRocketModel) spaceRocket).landingMethod());//int
    			OrbitMethodDisplay(((HydrogenRocketModel) spaceRocket).orbitMethod());//int		
    			//boolean
    			EntryMethodDisplay(((HydrogenRocketModel) spaceRocket).ExtraWeight(),((HydrogenRocketModel) spaceRocket).HeatShield(),((HydrogenRocketModel) spaceRocket).Refurbishment(),((HydrogenRocketModel) spaceRocket).RetrogradeThrust());
    			
    			functions_BuildingHydrogenRicket.InputForRocketFuelCalculation_Hydrogen(((HydrogenRocketModel) spaceRocket),sc);
    			System.out.print("The number of reusable is : "+((HydrogenRocketModel) spaceRocket).hydrogen()*66 + "\n"); //int    	    	
    			
    		}else if(spaceRocket.getClass().toString().contains("ReusableRocketModel")) {
    			
    			landingMethodDisplay(((ReusableRocketModel) spaceRocket).landingMethod());//int
    			OrbitMethodDisplay(((ReusableRocketModel) spaceRocket).orbitMethod());//int		
    			//boolean
    			EntryMethodDisplay(((ReusableRocketModel) spaceRocket).ExtraWeight(),((ReusableRocketModel) spaceRocket).HeatShield(),((ReusableRocketModel) spaceRocket).Refurbishment(),((ReusableRocketModel) spaceRocket).RetrogradeThrust());
    			
    			functions_BuildingReusableRocket.InputForRocketReusableTimeCalculation_Reusable(((ReusableRocketModel) spaceRocket),sc);
    			System.out.print("The number of reusable time is : "+((ReusableRocketModel) spaceRocket).resuable()+ 66 + "\n" ); //int
    			
    		}else if(spaceRocket.getClass().toString().contains("StainlessSteelRocketModel")) {
    			
    			landingMethodDisplay(((StainlessSteelRocketModel) spaceRocket).landingMethod());//int
    			OrbitMethodDisplay(((StainlessSteelRocketModel) spaceRocket).orbitMethod());//int		
    			//boolean
    			EntryMethodDisplay(((StainlessSteelRocketModel) spaceRocket).ExtraWeight(),((StainlessSteelRocketModel) spaceRocket).HeatShield(),((StainlessSteelRocketModel) spaceRocket).Refurbishment(),((StainlessSteelRocketModel) spaceRocket).RetrogradeThrust());
    			
    			functions_BuildingStainlessSteelRocket.InputForRocketTemperatureTolerance_StainlessSteel(((StainlessSteelRocketModel) spaceRocket),sc);
    			System.out.print( "The number of stainless tolerance is : " + ((StainlessSteelRocketModel) spaceRocket).stainlessSteel()+ "\n"); //int
    		}else {
    			System.out.print("It is a prototype of rocket model without feature.");
    		}
    		
    		
         }        

	*/
	}
	
	private static void startMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to build your own reusable rocket. :) \n");
		System.out.println("Here is the menu of the options.\n Enter 1 for building rocket based on demo rocket. \n Enter 2 for building rocket from scratch. \n Enter 3 for exiting the application. \n");
		int menuSelection = sc.nextInt();		
		switch (menuSelection) {
			case 1:
				demoRocket.demoRocketOption(sc);
				System.out.print("Ready for launch? \n Enter 1 for launching. \n Enter 2 for re-building rocket.\n");
				int finalSelection_demo = 0;
				switch (finalSelection_demo) {
					case 1:
						System.out.print("Wow !!! Another successful launch. Bringing Space to everyones backyard");
						break;
					case 2:
						startMenu();
						break;
					default:
						break;
				}
				break;
			case 2:
				scratchRocket.scratchRocketBuilding(sc);
				System.out.print("Ready for launch? \n Enter 1 for launching. \n Enter 2 for re-building rocket.\n");
				int finalSelection_scratch = 0;
				switch (finalSelection_scratch) {
					case 1:
						System.out.print("Wow !!! Another successful launch. Bringing Space to everyones backyard");
						break;
					case 2:
						startMenu();
						break;
					default:
						break;
				}
				break;
			case 3:
				System.out.println("Thank you for using the application for building the rocket. :) Good-bye \n");
				break;
			default:
				System.out.println("Please choose the number from 1 to 4 from the menu options. Let's try again. \n");
				break;
		
			}
	}
	/*
	private static void landingMethodDisplay(int landingMethod) {
		switch (landingMethod) {
			case 1:
				System.out.print("Landing System: Braking.");
				break;
			case 2:
				System.out.print("Landing System: Horizontal (Winged).");
				break;
			case 3:
				System.out.print("Landing System: Vertical (Retrograde).");
				break;
			case 4:
				System.out.print("Landing System: Aerostatic Force.");
				break;
			default:
				break;
		}
			
	}
	*/
	/*
	private static void OrbitMethodDisplay(int OrbitMethod) {
		switch (OrbitMethod) {
			case 1:
				System.out.print("Landing System: Single-stage-to-orbit.");
				break;
			case 2:
				System.out.print("Landing System: Two-stage-to-orbit.");
				break;
			case 3:
				System.out.print("Landing System: Multiple-stage-to-orbit.");
				break;
			default:
				break;
		}
			
	}
	*/
	/*
	private static void EntryMethodDisplay(boolean ExtraWeight, boolean HeatShield, boolean Refurbishment, boolean RetrogradeThrust) {
		ArrayList<String> entryMethod = new ArrayList<String>();
		
		if(ExtraWeight){
			entryMethod.add("Extra Weight Ability is ON. ");
		}else {
			entryMethod.add("Extra Weight Ability is OFF. ");
		}
		if(HeatShield){
			entryMethod.add("Heat Shield is ON. ");
		}else {
			entryMethod.add("Heat Shield is OFF. ");
		}
		if(Refurbishment){
			entryMethod.add("Refurbishment is ON. ");
		}else {
			entryMethod.add("Refurbishment is OFF. ");
		}
		if(RetrogradeThrust){
			entryMethod.add("Retrograde Thrust is ON. ");
		}else {
			entryMethod.add("Retrograde Thrust is OFF. ");
		}			
		
		System.out.print(entryMethod);
	}
	*/

}
