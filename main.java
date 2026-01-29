import java.util.Scanner;

/**
 * This is the interface of the array operations app
 * 
 * @author Evrim Mete Öztürk
 * @author
 * @author
 * 
 * @date 
 */

public class main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter the size of the array: ");
        int arraySize = userInput.nextInt();

        // Create a random array
        int[] mainArray = ArrayFunctions.createRandomArray(arraySize);

        // Convert random array into a string
        String arrayToString = "";
        for (int i = 0; i < mainArray.length; i++) {
            arrayToString += mainArray[i];
            if (i != mainArray.length - 1)
                arrayToString += ", ";
        }

        System.out.println("Array generated: " + arrayToString);

        int option = -1;

        // Menü
        while (option != 4) {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1) Find Minimum and Maximum");
            System.out.println("2) Calculate Average and Diffrences");
            System.out.println("3) Calculate Sum of Elements with Odd and Even Numbered Indexes");
            System.out.println("4) Exit");
            System.out.print("Select an option: ");

            option = userInput.nextInt();

            if (option == 1) {  // Finds Min and Max
                System.out.println("Minimum: " + ArrayFunctions.findMin(mainArray));
                System.out.println("Maximum: " + ArrayFunctions.findMax(mainArray));
            } 
            
            else if (option == 2) { // Calculate Avg and Differences
                double avg = ArrayFunctions.findAverage(mainArray);
                System.out.println("Average: " + avg);

                arrayToString = "";
                
                double[] avgDeductedArray = ArrayFunctions.getDifferencesFromAverage(mainArray, avg);
                for (int i = 0; i < avgDeductedArray.length; i++) {
                    arrayToString += avgDeductedArray[i];
                    if (i != avgDeductedArray.length - 1)
                        arrayToString += ", ";
                }

                System.out.println("Differences: " + arrayToString);

            } 
            
            else if (option == 3) { //Calculate Sum of Elements with Odd and Even Numbered Indexes
                System.out.println(
                        "Sum of Elements with Odd-Numbered Indexes: " + ArrayFunctions.sumOfOddNumberedElements(mainArray));
                System.out.println(
                        "Sum of Elements with Even-Numbered Indexes: " + ArrayFunctions.sumOfEvenNumberedElements(mainArray));
            } 
            
            else if (option == 4) { // Exit Program
                System.out.println("Closing Program.");

            } 
            
            else { // option not valid
                System.out.println("Please enter a valid option.");
            }

        }
        userInput.close();
    }
}