package ReusableRocket;

public class ConventionalRocketModel extends Rocket
		implements Conventional, entrySystems, landingSystems, orbitSystems {

	//Constructor	
	public ConventionalRocketModel(String rocketName, int height, int rocketPayloadCapacity, int numberOfReuse,
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
		return "ConventionalRocketModel [orbitMethod()=" + orbitMethod() + ", landingMethod()=" + landingMethod()
				+ ", HeatShield()=" + HeatShield() + ", RetrogradeThrust()=" + RetrogradeThrust() + ", ExtraWeight()="
				+ ExtraWeight() + ", Refurbishment()=" + Refurbishment() + ", convention()=" + convention()
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
		System.out.print("Momentum of Conventional Rocket. \n");
		super.momentum();
	}

	@Override
	public void spin() {
		// TODO Auto-generated method stub
		System.out.print("Spin of Conventional Rocket. \n");
		super.spin();
	}

	@Override
	public void gravity() {
		// TODO Auto-generated method stub
		System.out.print("Gravity of Conventional Rocket. \n");
		super.gravity();
	}
	

	@Override
	public void propellantFlow() {
		// TODO Auto-generated method stub
		System.out.print("Propellant Flow of Conventional Rocket. \n");
		super.propellantFlow();
	}
	
	//Rocket
	@Override
	public double militaryPayload() {
		// TODO Auto-generated method stub
		return 5.5;
	}

	@Override
	public double scientificPayload() {
		// TODO Auto-generated method stub
		return 5.5;
	}

	@Override
	public double StarlinkHighSpeedInternet(double power) {
		// TODO Auto-generated method stub
		return super.StarlinkHighSpeedInternet(power);
	}
	//overloading
	public int StarlinkHighSpeedInternet(int power) {
		// TODO Auto-generated method stub
		return 1000000;
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
		return 0;
	}

	@Override
	public int landingMethod() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean HeatShield() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean RetrogradeThrust() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ExtraWeight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Refurbishment() {
		// TODO Auto-generated method stub
		return true;
	}

	//interface_Conventional
	@Override
	public int convention() {
		// TODO Auto-generated method stub
		return 888888;
	}

	@Override
	public int calculateRocketSpeed(int time, int distance) {
		// TODO Auto-generated method stub
		int RocketSpeedCalculation = Math.round(distance/time);
		//System.out.printf("The speed of rocket is %d", RocketSpeedCalculation);
		
		return RocketSpeedCalculation;
	}
	//overloading
	public double calculateRocketSpeed(double time, double distance) {
		// TODO Auto-generated method stub
		double RocketSpeedCalculation = distance/time;
		//System.out.printf("The speed of rocket is %.2f", RocketSpeedCalculation);
		
		return RocketSpeedCalculation;
	}
	
	
}
