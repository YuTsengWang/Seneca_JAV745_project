package ReusableRocket;

import java.util.Objects;

public abstract class Rocket {
	
	private String rocketName = null;
	private int height = 0;
	private int rocketPayloadCapacity = 0;
	private int numberOfReuse = 0;
	private String launchDateAndTime = null;
	private boolean launchOnTimeSuccess = false;
	
	private String rocketCompany = null;
	private String rocketType = null;
	private String ownerCountry = null;
	private String lunchStatus = null;
	
	private boolean recovered = false;
	private boolean relaunched = false;
	
	private int airfoils = 0;
	private int auxiliaryReactionEngines= 0;
	private int gimballedThrust = 0;
	private int momentumWheels = 0;
	private int deflectionOfExhaustStream = 0;
	private int storedPropellant = 0;
	
	public void momentum() {};
	public void spin() {};
	public void gravity() {};
	public void propellantFlow() {};
	
	//Constructor
	public Rocket(String rocketName, int height, int rocketPayloadCapacity, int numberOfReuse, String launchDateAndTime,
				boolean launchOnTimeSuccess, String rocketCompany, String rocketType, String ownerCountry,
				String lunchStatus, boolean recovered, boolean relaunched, int airfoils, int auxiliaryReactionEngines,
				int gimballedThrust, int momentumWheels, int deflectionOfExhaustStream, int storedPropellant) {
		super();
		this.rocketName = rocketName;
		this.height = height;
		this.rocketPayloadCapacity = rocketPayloadCapacity;
		this.numberOfReuse = numberOfReuse;
		this.launchDateAndTime = launchDateAndTime;
		this.launchOnTimeSuccess = launchOnTimeSuccess;
		this.rocketCompany = rocketCompany;
		this.rocketType = rocketType;
		this.ownerCountry = ownerCountry;
		this.lunchStatus = lunchStatus;
		this.recovered = recovered;
		this.relaunched = relaunched;
		this.airfoils = airfoils;
		this.auxiliaryReactionEngines = auxiliaryReactionEngines;
		this.gimballedThrust = gimballedThrust;
		this.momentumWheels = momentumWheels;
		this.deflectionOfExhaustStream = deflectionOfExhaustStream;
		this.storedPropellant = storedPropellant;
	}
		
				
	@Override
	public String toString() {
		return "Rocket [rocketName=" + rocketName + ", height=" + height + ", rocketPayloadCapacity="
				+ rocketPayloadCapacity + ", numberOfReuse=" + numberOfReuse + ", launchDateAndTime="
				+ launchDateAndTime + ", launchOnTimeSuccess=" + launchOnTimeSuccess + ", rocketCompany="
				+ rocketCompany + ", rocketType=" + rocketType + ", ownerCountry=" + ownerCountry + ", lunchStatus="
				+ lunchStatus + ", recovered=" + recovered + ", relaunched=" + relaunched + ", airfoils=" + airfoils
				+ ", auxiliaryReactionEngines=" + auxiliaryReactionEngines + ", gimballedThrust=" + gimballedThrust
				+ ", momentumWheels=" + momentumWheels + ", deflectionOfExhaustStream=" + deflectionOfExhaustStream
				+ ", storedPropellant=" + storedPropellant + ", hashCode()=" + hashCode() + ", getRocketName()="
				+ getRocketName() + ", getHeight()=" + getHeight() + ", getRocketPayloadCapacity()="
				+ getRocketPayloadCapacity() + ", getNumberOfReuse()=" + getNumberOfReuse()
				+ ", getLaunchDateAndTime()=" + getLaunchDateAndTime() + ", isLaunchOnTimeSuccess()="
				+ isLaunchOnTimeSuccess() + ", getRocketCompany()=" + getRocketCompany() + ", getRocketType()="
				+ getRocketType() + ", getOwnerCountry()=" + getOwnerCountry() + ", getLunchStatus()="
				+ getLunchStatus() + ", isRecovered()=" + isRecovered() + ", isRelaunched()=" + isRelaunched()
				+ ", getAirfoils()=" + getAirfoils() + ", getAuxiliaryReactionEngines()="
				+ getAuxiliaryReactionEngines() + ", getGimballedThrust()=" + getGimballedThrust()
				+ ", getMomentumWheels()=" + getMomentumWheels() + ", getDeflectionOfExhaustStream()="
				+ getDeflectionOfExhaustStream() + ", getStoredPropellant()=" + getStoredPropellant()
				+ ", spaceProbe()=" + spaceProbe() + ", militaryPayload()=" + militaryPayload()
				+ ", scientificPayload()=" + scientificPayload() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(airfoils, auxiliaryReactionEngines, deflectionOfExhaustStream, gimballedThrust, height,
				launchDateAndTime, launchOnTimeSuccess, lunchStatus, momentumWheels, numberOfReuse, ownerCountry,
				recovered, relaunched, rocketCompany, rocketName, rocketPayloadCapacity, rocketType, storedPropellant);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rocket other = (Rocket) obj;
		return airfoils == other.airfoils && auxiliaryReactionEngines == other.auxiliaryReactionEngines
				&& deflectionOfExhaustStream == other.deflectionOfExhaustStream
				&& gimballedThrust == other.gimballedThrust && height == other.height
				&& Objects.equals(launchDateAndTime, other.launchDateAndTime)
				&& launchOnTimeSuccess == other.launchOnTimeSuccess && Objects.equals(lunchStatus, other.lunchStatus)
				&& momentumWheels == other.momentumWheels && numberOfReuse == other.numberOfReuse
				&& Objects.equals(ownerCountry, other.ownerCountry) && recovered == other.recovered
				&& relaunched == other.relaunched && Objects.equals(rocketCompany, other.rocketCompany)
				&& Objects.equals(rocketName, other.rocketName) && rocketPayloadCapacity == other.rocketPayloadCapacity
				&& Objects.equals(rocketType, other.rocketType) && storedPropellant == other.storedPropellant;
	}
	//Setter and Getter
	public String getRocketName() {
		return rocketName;
	}
	public void setRocketName(String rocketName) {
		this.rocketName = rocketName;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getRocketPayloadCapacity() {
		return rocketPayloadCapacity;
	}
	public void setRocketPayloadCapacity(int rocketPayloadCapacity) {
		this.rocketPayloadCapacity = rocketPayloadCapacity;
	}
	public int getNumberOfReuse() {
		return numberOfReuse;
	}
	public void setNumberOfReuse(int numberOfReuse) {
		this.numberOfReuse = numberOfReuse;
	}
	public String getLaunchDateAndTime() {
		return launchDateAndTime;
	}
	public void setLaunchDateAndTime(String launchDateAndTime) {
		this.launchDateAndTime = launchDateAndTime;
	}
	public boolean isLaunchOnTimeSuccess() {
		return launchOnTimeSuccess;
	}
	public void setLaunchOnTimeSuccess(boolean launchOnTimeSuccess) {
		this.launchOnTimeSuccess = launchOnTimeSuccess;
	}
	
	
	public String getRocketCompany() {
		return rocketCompany;
	}
	public void setRocketCompany(String rocketCompany) {
		this.rocketCompany = rocketCompany;
	}
	public String getRocketType() {
		return rocketType;
	}
	public void setRocketType(String rocketType) {
		this.rocketType = rocketType;
	}
	public String getOwnerCountry() {
		return ownerCountry;
	}
	public void setOwnerCountry(String ownerCountry) {
		this.ownerCountry = ownerCountry;
	}
	public String getLunchStatus() {
		return lunchStatus;
	}
	public void setLunchStatus(String lunchStatus) {
		this.lunchStatus = lunchStatus;
	}
	public boolean isRecovered() {
		return recovered;
	}
	public void setRecovered(boolean recovered) {
		this.recovered = recovered;
	}
	public boolean isRelaunched() {
		return relaunched;
	}
	public void setRelaunched(boolean relaunched) {
		this.relaunched = relaunched;
	}
	public int getAirfoils() {
		return airfoils;
	}
	public void setAirfoils(int airfoils) {
		this.airfoils = airfoils;
	}
	public int getAuxiliaryReactionEngines() {
		return auxiliaryReactionEngines;
	}
	public void setAuxiliaryReactionEngines(int auxiliaryReactionEngines) {
		this.auxiliaryReactionEngines = auxiliaryReactionEngines;
	}
	public int getGimballedThrust() {
		return gimballedThrust;
	}
	public void setGimballedThrust(int gimballedThrust) {
		this.gimballedThrust = gimballedThrust;
	}
	public int getMomentumWheels() {
		return momentumWheels;
	}
	public void setMomentumWheels(int momentumWheels) {
		this.momentumWheels = momentumWheels;
	}
	public int getDeflectionOfExhaustStream() {
		return deflectionOfExhaustStream;
	}
	public void setDeflectionOfExhaustStream(int deflectionOfExhaustStream) {
		this.deflectionOfExhaustStream = deflectionOfExhaustStream;
	}
	public int getStoredPropellant() {
		return storedPropellant;
	}
	public void setStoredPropellant(int storedPropellant) {
		this.storedPropellant = storedPropellant;
	};
	
	
	//public int StarlinkHighSpeedInternet(int power) { return this.getDeflectionOfExhaustStream() * this.getStoredPropellant() / power; }
	public double StarlinkHighSpeedInternet(double power) { return this.getDeflectionOfExhaustStream() * this.getStoredPropellant() / power; }

	
	public int satellites(int speed, int distance) { return (this.getAuxiliaryReactionEngines()+ speed * 10)/ distance; }
	public double satellites(double speed, double distance) { return (this.getAuxiliaryReactionEngines()+ speed * 10)/ distance;}
	
	public double spaceProbe() {return this.getGimballedThrust()*111.11;}
	
	public abstract double militaryPayload(); 
	public abstract double scientificPayload();
	
	
	
	
	
	
	
	
}
