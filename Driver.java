import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();// dogList created from the dog class that takes in the attributes. 
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();// Created a monkeyList from the Monkey class that takes in the attributes from that class.  
    private static Monkey userMonkeyList = new Monkey(" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", false, " "); // Created a monkey list to assign values from the input.
    private static Dog userDogList = new Dog(" ", " ", " ", " ", " ", " ", " ", " ", false, " "); // Created a dog list that assigns values from the input.

    public static void main(String[] args) {

    	// Call for the initializeDogList and the initializeMonkeyList methods.
        initializeDogList();
        initializeMonkeyList();
        
        Scanner scnr = new Scanner(System.in);// Created input statement to call upon.
        
        System.out.println("Enter any number to display the menu or enter 'q' to quit."); // Prompt user for input to start the while loop and display the menu.

        String menuInput = scnr.next();// Set menuInput to a default string value.
        
        // Created a loop for the menuInput that displays the menu, prompts the user for input, and takes action depending on the input.
        while (!menuInput.equals("q")) {
        	displayMenu();
        	menuInput = scnr.next();
        	
        	if (menuInput.equals("1")) { // If menuInput is 1, intakeNewDog method is called.
        		intakeNewDog(scnr);
        	}
        	
        	else if (menuInput.equals("2")) { // If menuInput is 2, intakeNewMonkey method is called. 
        		intakeNewMonkey(scnr);
        	}
        	
        	else if (menuInput.equals("3")) { // If menuInput is 3, reserveAnimal method is called upon.
        		reserveAnimal(scnr);
        	}
        	
        	else if (menuInput.equals("4")) { // If menuInput is 4, printAnimals is called for a list of dogs.
        		printAnimals(menuInput);
        	}
        	
        	else if (menuInput.equals("5")) { // If menuInput is 5, printAnimals is called for a list of monkeys.
        		printAnimals(menuInput);
        	}
        	
        	else if (menuInput.equals("6")) { // If menuInput is 6, printAnimals is called for and displays animals that are not reserved.
        		printAnimals(menuInput);
        	}
        	
        	else if (menuInput.equals("q")){ // If menuInput is "q" during the loop, it breaks from it.
        		break;
        	}
        	
        	else {
        		System.out.println("Invalid menu option, enter a number for menu options."); // Error message for when an invalid menu option is used.
        		menuInput = scnr.next(); // Next user input.
        	}
        
        }
        // Output quit message for when menuInput = q, which terminates the while loop.
        System.out.println("You have quit the application.");
    }

    // This method prints the menu options 
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() { // Created monkeys for testing with values for each attribute.
    	Monkey monkey1 = new Monkey("Capu", "Capuchin", "male", "3", "18.3", "1.5", "3.4", "2.1", "01-05-2019", "Paraguay", "phase II", false, "United States");
    	Monkey monkey2 = new Monkey("Marmo", "Marmoset", "female", "4", "20.1", "1.1", "3.2", "1.9", "03-12-2019", "Brazil", "phase I", false, "Brazil");
    	Monkey monkey3 = new Monkey("Tammy", "Tamarin", "female", "5", "23.4", "1.4", "3.0", "1.5", "12-15-2018", "Brazil", "in service", true, "United States");
    	
    	// Added the test monkeys to the monkeyList.
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


    // Modified intakeNewDog method to prompt values for dog attributes with name validation and then add the list to dogList array list.
    public static void intakeNewDog(Scanner scanner) {
    	scanner.nextLine(); // Used to continue to prompt values for the attributes of the dog.
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) { // Loop used for name validation.
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return;
            }
        }
       
        userDogList.setName(name);
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        userDogList.setBreed(breed);
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        userDogList.setGender(gender);
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        userDogList.setAge(age);
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        userDogList.setWeight(weight);
        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        userDogList.setAcquisitionDate(acquisitionDate);
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();
        userDogList.setAcquisitionLocation(acquisitionCountry);
        System.out.println("What is the dog's training status?");
    	String trainingStatus = scanner.nextLine();
    	userDogList.setTrainingStatus(trainingStatus);
        System.out.println("Is the dog reserved? true or false?");
    	boolean reserved = scanner.nextBoolean();
    	userDogList.setReserved(reserved);
    	scanner.nextLine();
        System.out.println("What country is the dog in service?");
    	String inServiceCountry = scanner.nextLine();
    	userDogList.setInServiceCountry(inServiceCountry);
    	dogList.add(userDogList);   
    }

      	// Modified intakeNewMonkey method to prompt for values for each attribute, then assigned those values to userMonkeyList while also checking for name validation, ->
    	//species validation, and finally add the list to the monkeyList.
        public static void intakeNewMonkey(Scanner scanner) {
            scanner.nextLine(); // Used to continue to prompt values for the attributes of a monkey.
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            for (Monkey monkey: monkeyList) {
            	if (monkey.getName().equalsIgnoreCase(name)) {
            		System.out.println("This monkey is already in our system");
            		return;
            	}
            }
            
            userMonkeyList.setName(name);
            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();
            userMonkeyList.setSpecies(species);
            if ((userMonkeyList.getSpecies().equals("Capuchin")) || (userMonkeyList.getSpecies().equals("Guenon")) ||
            	(userMonkeyList.getSpecies().equals("Macaque")) || (userMonkeyList.getSpecies().equals("Marmoset")) ||
            	(userMonkeyList.getSpecies().equals("Squirrel monkey")) || (userMonkeyList.getSpecies().equals("Tamarin"))) {
            	System.out.println("What is the monkey's gender?");
            	String gender = scanner.nextLine();
            	userMonkeyList.setGender(gender);
            	System.out.println("What is the monkey's age?");
            	String age = scanner.nextLine();
            	userMonkeyList.setAge(age);
            	System.out.println("What is the monkey's weight?");
            	String weight = scanner.nextLine();
            	userMonkeyList.setWeight(weight);
            	System.out.println("What is the monkey's tailLength?");
            	String tailLength = scanner.nextLine();
            	userMonkeyList.setTailLength(tailLength);
            	System.out.println("What is the monkey's height?");
            	String height = scanner.nextLine();
            	userMonkeyList.setHeight(height);
            	System.out.println("What is the monkey's bodylength?");
            	String bodyLength = scanner.nextLine();
            	userMonkeyList.setBodyLength(bodyLength);
            	System.out.println("What is the monkey's acquisition date?");
            	String acquisitionDate = scanner.nextLine();
            	userMonkeyList.setAcquisitionDate(acquisitionDate);
            	System.out.println("What is the monkey's acquisition country?");
            	String acquisitionCountry = scanner.nextLine();
            	userMonkeyList.setAcquisitionLocation(acquisitionCountry);
            	System.out.println("What is the monkey's training status?");
            	String trainingStatus = scanner.nextLine();
            	userMonkeyList.setTrainingStatus(trainingStatus);
            	System.out.println("Is the monkey reserved? true or false?");
            	boolean reserved = scanner.nextBoolean();
            	userMonkeyList.setReserved(reserved);
            	scanner.nextLine(); // Used to continue the input for values.
            	System.out.println("What country is the monkey in service?");
            	String inServiceCountry = scanner.nextLine();
            	userMonkeyList.setInServiceCountry(inServiceCountry);
            	monkeyList.add(userMonkeyList);
            }
            // If the species is not supported, output an error message.
            else {
            	System.out.println("Monkey species is not supported.");
            	userMonkeyList.setSpecies(" ");
            }
        }

        // reserveAnimal method used to prompt for input for the animal type and its country, check if that input matches a pet from either the monkeyList or the dogList ->
        // and set the animal to reserve if it is found in the list.
        public static void reserveAnimal(Scanner scanner) {
        	scanner.nextLine(); // Used to continue to prompt for input.
            System.out.println("Enter a valid animal.");
            String animalType = scanner.nextLine(); // Prompt user for animal type.
            System.out.println("Enter the animal's country.");
            String animalCountry = scanner.nextLine(); // Prompt user for the animal's country.
            // If the animalType is a dog, the dogList is looped through to search for a country that matches the input. If matched, the dog gets reserved.
            if (animalType.equals("dog")) {
            	for (Dog dog : dogList) {
            		if (animalCountry.equals(dog.getAcquisitionLocation())) {
            			dog.setReserved(true);
            			System.out.println("The animal has been set to reserved."); // Output message confirming the animal is now reserved.
            			break; // Used break to only set the first match of the animal in the list to reserved.
            		}
            	}
            }
            // If the animalType is a monkey, the monkeyList is looped through searching for the country that matches the input, and if does, the animal is set to reserved. 
            else if (animalType.equals("Monkey")) {
            	for (Monkey monkey : monkeyList) {
            		if (animalCountry.equals(monkey.getAcquisitionLocation())) {
            			monkey.setReserved(true);
            			System.out.println("The animal has been set to reserved."); // Output message confirming the animal has been set to reserved.
            			break; // Used break to only set the first match of the animal in the list to reserved.
            		}
            	}
            }
            // If no match, output an error message.
            else {
            	System.out.println("This animal does not exist, try again.");
            }
        }

       // printAnimals method used to print the objects in each array list.
        public static void printAnimals(String printOption) {
            if (printOption.equals("4")) {
            	for (Dog dog : dogList){ // Gets parameter value from menuInpt.
            		//Output dogList objects.
            		System.out.println(dog.getName() + ", " + dog.getBreed() + ", " + dog.getGender() + 
            				           ", " + dog.getAge() + ", " + dog.getWeight() + ", " + dog.getAcquisitionDate() 
            				           + ", " + dog.getAcquisitionLocation() + ", " + dog.getTrainingStatus() + 
            				 		   ", " + dog.getReserved() + ", " + dog.getInServiceLocation());
            	}
            }
            else if (printOption.equals("5")) { // Gets parameter value from menuInput.
            	for (Monkey monkey : monkeyList) {
            		// Output the monkeyList objects.
            		System.out.println(monkey.getName() + ", " + monkey.getSpecies() + ", " + 
            					       monkey.getGender() + ", " + monkey.getAge() + ", " + 
            						   monkey.getWeight() + ", " + monkey.getTailLength() + 
            						   ", " + monkey.getHeight() + ", " + monkey.getBodyLength() + 
            						   ", " + monkey.getAcquisitionDate() + ", " + monkey.getAcquisitionLocation() 
            						   + ", " + monkey.getTrainingStatus() + ", " + monkey.getReserved() + ", " 
            						   + monkey.getInServiceLocation());
            	}
            }
            // When menuInput is not 4 or 5, dogList and monkeyList are looped through to find if the animal is not reserved.
            else {
            	for (Dog dog : dogList) {
            		if (dog.getReserved() == false) { // If a dog in the list is not reserved, the dog gets printed.
            			System.out.println(dog.getName() + ", " + dog.getBreed() + ", " + dog.getGender() + 
     				           ", " + dog.getAge() + ", " + dog.getWeight() + ", " + dog.getAcquisitionDate() 
     				           + ", " + dog.getAcquisitionLocation() + ", " + dog.getTrainingStatus() + 
     				 		   ", " + dog.getReserved() + ", " + dog.getInServiceLocation());
            		}
            	}
            	for (Monkey monkey : monkeyList) { // If a monkey in the list is not reserved, the monkey gets printed.
            		if (monkey.getReserved() == false) {
            			System.out.println(monkey.getName() + ", " + monkey.getSpecies() + ", " + 
     					       monkey.getGender() + ", " + monkey.getAge() + ", " + 
     						   monkey.getWeight() + ", " + monkey.getTailLength() + 
     						   ", " + monkey.getHeight() + ", " + monkey.getBodyLength() + 
     						   ", " + monkey.getAcquisitionDate() + ", " + monkey.getAcquisitionLocation() 
     						   + ", " + monkey.getTrainingStatus() + ", " + monkey.getReserved() + ", " 
     						   + monkey.getInServiceLocation());
            		}
            	}
            }
        }
}

