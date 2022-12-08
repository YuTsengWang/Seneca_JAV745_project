package ReusableRocket;

public class HydrogenRocketModel extends Rocket implements Hydrogen, entrySystems, landingSystems, orbitSystems {

	//Constructor
	public HydrogenRocketModel(String rocketName, int height, int rocketPayloadCapacity, int numberOfReuse,
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
		return "HydrogenRocketModel [orbitMethod()=" + orbitMethod() + ", landingMethod()=" + landingMethod()
				+ ", HeatShield()=" + HeatShield() + ", RetrogradeThrust()=" + RetrogradeThrust() + ", ExtraWeight()="
				+ ExtraWeight() + ", Refurbishment()=" + Refurbishment() + ", hydrogen()=" + hydrogen()
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
		System.out.print("Momentum of Hydrogen Rocket. \n");
		super.momentum();
	}

	@Override
	public void spin() {
		// TODO Auto-generated method stub
		System.out.print("Spin of Hydrogen Rocket. \n");
		super.spin();
	}

	@Override
	public void gravity() {
		// TODO Auto-generated method stub
		System.out.print("Gravity of Hydrogen Rocket. \n");
		super.gravity();
	}

	@Override
	public void propellantFlow() {
		// TODO Auto-generated method stub
		System.out.print("Propellant Flow of Hydrogen Rocket. \n");
		super.propellantFlow();
	}

	//Rocket
	@Override
	public double militaryPayload() {
		// TODO Auto-generated method stub
		return 10.5;
	}

	@Override
	public double scientificPayload() {
		// TODO Auto-generated method stub
		return 10.5;
	}

	@Override
	public double StarlinkHighSpeedInternet(double power) {
		// TODO Auto-generated method stub
		return super.StarlinkHighSpeedInternet(power);
	}
	//overloading
	public int StarlinkHighSpeedInternet(int power) {
		// TODO Auto-generated method stub
		return 2000000;
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
		return 1;
	}

	@Override
	public int landingMethod() {
		// TODO Auto-generated method stub
		return 2;
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
		return true;
	}

	@Override
	public boolean Refurbishment() {
		// TODO Auto-generated method stub
		return true;
	}

	//interface_Hydrogen
	@Override
	public int hydrogen() {
		// TODO Auto-generated method stub
		return 888888;
	}

	@Override
	public int calculateFuel(int fuelCapacity) {
		// TODO Auto-generated method stub
		//System.out.printf("The fuel of rocket is %d", fuelCapacity);
		
		return fuelCapacity;
	}
	//overloading
	public double calculateFuel(double fuelCapacity) {
		// TODO Auto-generated method stub
		//System.out.printf("The fuel of rocket is %.2f", fuelCapacity);
		
		return fuelCapacity;
	}


	
}
