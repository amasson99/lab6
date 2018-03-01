/*
 * Lab6_Methods.java
 * Original Author: Dr. D. Lang
 * Modified by: Alex Masson
 * Course: CIS 200
 * Lab Section: Thursday 4:30-6:30 Section B

*/

import java.util.Scanner;

public class Lab6_Methods {
 public static void main(String[ ] args) {

   Scanner in = new Scanner(System.in);

    double milesTraveled = 0;    // miles until empty - tank initially empty
    double gallonsOfGas = 0;     // amount of fuel left in tank - initially empty
    double initial = 0;
    final double MPG = 25;       // Miles per Gallon - Constant

// Hardcode values to make, model, and year of YOUR car
    String year = args [0];
    String make = args[1];
    String model = args [2];

// -------------------- Get User-entered Input ------------------
    System.out.print("How many gallons do you have left in the tank?" +
                       " <enter 0 if empty>: ");
     initial = in.nextDouble();
     gallonsOfGas = getInput(initial);


// -------------------- Calculations ------------------
// ***Your code goes here***
// If zero wasn't entered above, call the method to calculate how far you
// can go on the current amount of gas in the tank
  milesTraveled = getDistanceToEmpty(MPG, gallonsOfGas);
  //System.out.printf("Miles left on tank = %.1f\n",milesTraveled);

// ----------------------- Display Results ------------------------------
// ***Your code goes here***
// Call the method to display the following:
// Car Info (make, model, year), the MPG,
// and miles you can go before empty (ONLY if there is gas in the tank!)
displayOutput(year, make, model, MPG, milesTraveled);

 } // end main method

 /**
 * displayOutput: Method that displays info about the car (Make, Model, Year),
 * MPG and, if the tank is not empty, how far the car can travel on the current
 * amount of fuel in the tank (only displayed if there is gas in the tank!)
 *
 * @param year - year of the car
 * @param make - make of the car
 * @param model- model of the car
 * @param mpg  - Miles per Gallon rating of the car
 * @param miles- Miles car can go with current fuel in the tank
 * @return None
 */
// ***Code for your method goes here***
public static void displayOutput(String year, String make, String model, double MPG, double milesTraveled) {

System.out.println("Year: " + year);
System.out.println("Make: "+ make);
System.out.println("Model: "+ model);
System.out.println("MPG: " + MPG);
System.out.printf("Miles left on tank = %.1f\n",milesTraveled);

}//end displayOutput


 /**
 *  getDistanceToEmpty: Method returns how far (in miles) a car object can go
 *  until the gas tank is empty
 *
 * @param mpg  - Miles per Gallon rating of the car
 * @param fuel - amount of fuel currently in the tank
 * @return Miles car can travel on current fuel amount
 */
// ***Code for your method goes here***
public static double getDistanceToEmpty (double MPG, double gallonsOfGas){

double mpg = MPG * gallonsOfGas;

return (mpg);
}//end getDistanceToEmpty

/*
* getInput: Method returns whether or not the entered the correct amount of gallons of gallons
* @param gallonsOfGas - amount of fuel in tank
* @return correct amount of fuel in tank
*/
public static double getInput(double initial){
double initial1 = initial;
Scanner in = new Scanner(System.in);
  while (initial1 > 25 || initial1 < 0 ) {
    System.out.print("How many gallons do you have left in the tank?" +
                       " <enter 0 if empty>: ");
     initial1 = in.nextDouble();

  }
  return initial1;

}//end getInput

} // end class
