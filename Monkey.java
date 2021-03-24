
public class Monkey extends RescueAnimal {//Monkey class inherits from the RescueAnimal class.
	
	//Created the attributes for the monkey class.
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	//Created a constructor with all attributes and used setters for each one.
	public Monkey(String name, String species, String gender, String age,
	String weight, String tailLength, String height, String bodyLength, 
	String acquisitionDate, String acquisitionCountry, String trainingStatus, 
	boolean reserved, String inServiceCountry) {
		setName(name);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		
	}
	//Created Accessors(getters) followed by Mutators(setters) for each attribute of the Monkey class.
	public String getTailLength() {
		return tailLength;
	}
	
	public void setTailLength(String monkeyTailLength) {
		tailLength = monkeyTailLength;
	}
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	
	public String getBodyLength() {
		return bodyLength;
	}
	
	public void setBodyLength(String monkeyBodyLength) {
		bodyLength = monkeyBodyLength;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
}
