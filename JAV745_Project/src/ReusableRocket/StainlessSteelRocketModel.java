package ReusableRocket;

public class StainlessSteelRocketModel extends Rocket
		implements StainlessSteel, entrySystems, landingSystems, orbitSystems {

	//Constructor
	public StainlessSteelRocketModel(String rocketName, int height, int rocketPayloadCapacity, int numberOfReuse,
			String launchDateAndTime, boolean launchOnTimeSuccess, String rocketCompany, String rocketType,
			String ownerCountry, String lunchStatus, boolean recovered, boolean relaunched, int airfoils,
			int auxiliaryReactionEngines, int gimballedThrust, int momentumWheels, int deflectionOfExhaustStream,
			int storedPropellant) {
		super(rocketName, height, rocketPayloadCapacity, numberOfReuse, launchDateAndTime, launchOnTimeSuccess, rocketCompany,
				rocketType, ownerCountry, lunchStatus, recovered, relaunched, airfoils, auxiliaryReactionEngines,
				gimballedThrust, momentumWheels, deflectionOfExhaustStream, storedPropellant);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "StainlessSteelRocketModel [orbitMethod()=" + orbitMethod() + ", landingMethod()=" + landingMethod()
				+ ", HeatShield()=" + HeatShield() + ", RetrogradeThrust()=" + RetrogradeThrust() + ", ExtraWeight()="
				+ ExtraWeight() + ", Refurbishment()=" + Refurbishment() + ", stainlessSteel()=" + stainlessSteel()
				+ ", militaryPayload()=" + militaryPayload() + ", scientificPayload()=" + scientificPayload()
				+ ", spaceProbe()=" + spaceProbe() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getRocketName()=" + getRocketName() + ", getHeight()=" + getHeight()
				+ ", getRocketPayloadCapacity()=" + getRocketPayloadCapacity() + ", getNumberOfReuse()="
				+ getNumberOfReuse() + ", getLaunchDateAndTime()=" + getLaunchDateAndTime()
				+ ", isLaunchOnTimeSuccess()=" + isLaunchOnTimeSuccess() + ", getRocketCompany()=" + getRocketCompany()
				+ ", getRocketType()=" + getRocketType() + ", getOwnerCountry()=" + getOwnerCountry()
				+ ", getLunchStatus()=" + getLunchStatus() + ", isRecovered()=" + isRecovered() + ", isRelaunched()="
				+ isRelaunched() + ", getAirfoils()=" + getAirfoils() + ", getAuxiliaryReactionEngines()="
				+ getAuxiliaryReactionEngines() + ", getGimballedThrust()=" + getGimballedThrust()
				+ ", getMomentumWheels()=" + getMomentumWheels() + ", getDeflectionOfExhaustStream()="
				+ getDeflectionOfExhaustStream() + ", getStoredPropellant()=" + getStoredPropellant() + ", getClass()="
				+ getClass() + "]";
	}

	//Rocket
	@Override
	public void momentum() {
		// TODO Auto-generated method stub
		System.out.print("Momentum of Stainless Steel Rocket. \n");
		super.momentum();
	}

	@Override
	public void spin() {
		// TODO Auto-generated method stub
		System.out.print("Spin of Stainless Steel Rocket. \n");
		super.spin();
	}

	@Override
	public void gravity() {
		// TODO Auto-generated method stub
		System.out.print("Gravity of Stainless Steel Rocket. \n");
		super.gravity();
	}

	@Override
	public void propellantFlow() {
		// TODO Auto-generated method stub
		System.out.print("Propellant Flow of Stainless Steel Rocket. \n");
		super.propellantFlow();
	}
	
	//Rocket
	@Override
	public double militaryPayload() {
		// TODO Auto-generated method stub
		return 100.5;
	}

	@Override
	public double scientificPayload() {
		// TODO Auto-generated method stub
		return 100.5;
	}

	@Override
	public double StarlinkHighSpeedInternet(double power) {
		// TODO Auto-generated method stub
		return super.StarlinkHighSpeedInternet(power);
	}
	//overloading
	public int StarlinkHighSpeedInternet(int power) {
		// TODO Auto-generated method stub
		return 4000000;
	}

	@Override
	public int satellites(int speed, int distance) {
		// TODO Auto-generated method stub
		return super.satellites(speed, distance);
	}

	@Override
	public double spaceProbe() {
		// TODO Auto-generated method stub
		return super.spaceProbe();
	}


	//interface_Systems
	@Override
	public int orbitMethod() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public int landingMethod() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public boolean HeatShield() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean RetrogradeThrust() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean ExtraWeight() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Refurbishment() {
		// TODO Auto-generated method stub
		return true;
	}

	//interface_StainlessSteel
	@Override
	public int stainlessSteel() {
		// TODO Auto-generated method stub
		return 888888;
	}

	@Override
	public int calculateTemperatureTolerance(int time, int temperature) {
		// TODO Auto-generated method stub
		int RocketTemperatureToleranceCalculation = Math.round(temperature/(time*2));
		//System.out.printf("The speed of rocket is %d", RocketTemperatureToleranceCalculation);
		
		return 0;
	}
	//overloading
	public double calculateTemperatureTolerance(double time, double temperature) {
		// TODO Auto-generated method stub
		double RocketTemperatureToleranceCalculation = temperature/(time*2);
		//System.out.printf("The speed of rocket is %d", RocketTemperatureToleranceCalculation);
		
		return 0;
	}
	
	

}
