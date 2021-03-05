import java.util.Scanner;

public class Paint1 {

	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in); // scnr variable used for prompting input.
        double wallHeight = 0.0;
        double wallWidth = 0.0; // wallHeight, wallWidth, and wallArea used for input values and for multiplication.
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        char continueChar;// Created a char variable that will be set to 'c' for continue or 'l' for looping.
  
        final double squareFeetPerGallons = 350.0; // squareFeetPerGallons used for dividing from the wall area to find the gallonsPaintNeeded variable.
        
        
        do { // do loop for wall height.
        	try { // try used for prompting the user for valid input.
        		System.out.println("Enter wall height (feet): ");
        		wallHeight = scnr.nextDouble();
        		continueChar = 'c'; // set continueChar to 'c'
        		// if statement used to throw an error message if it turns out true.
        		if (wallHeight < 1) {
        			throw new Exception("Invalid height");
        		}
        	}
        	catch (Exception excpt) { // used catch to get the error message and prompt for valid input.
        		System.out.println(excpt.getMessage());
        		System.out.println("Enter a valid wall height");
        		continueChar = 'l'; // if catch executes, continueChar is 'l'.
        	}
        }while (continueChar == 'l'); // while continueChar is 'l', the loop iterates over again.
        
        do { // do loop for wall width.
        	try { // try used for a valid input for the wallWidth.
        		System.out.println("Enter wall width (feet): ");
        		wallWidth = scnr.nextDouble();
        		continueChar = 'c';
        		// if statement used to throw an error message if it turns out true.
        		if (wallWidth < 1) {
        			throw new Exception("Invalid width");
        		}
        	}
        	catch (Exception excpt) { // catch used to output error message and prompt user for valid input.
        		System.out.println(excpt.getMessage());
        		System.out.println("Enter a valid wall width");
        		continueChar = 'l'; // continueChar set to 'l'.
        	}
        }while(continueChar == 'l'); // iterates again if continueChar equals 'l'.

        
        wallArea = wallHeight * wallWidth; // wallArea equals wallHeight times wallWidth.
        System.out.println("Wall area: " + wallArea + " square feet"); // Output the wallArea.

        // gallonsPaintNeeded set to the wallArea divided by squareFeetPerGallons.
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons"); // Output the paint needed with the value of gallonsPaintNeeded variable.

    }
}
