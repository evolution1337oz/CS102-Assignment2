import java.util.Arrays;
import java.util.Random;

/**
 * This is the functions class of the array operations app
 * 
 * @author Evrim Mete Öztürk
 * @author Damla Su Bilge
 * @author
 * 
 * @date 
 */

public class ArrayFunctions {

    // to create random int array with given size
    public static int[] createRandomArray(int arraySize) {
        Random rand = new Random();
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(101);
        }
        return array;
    }

    // find min value with sort algorithm
    public static int findMin(int[] array) {
        int sorted [] =Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        
        return sorted[0];
    }

    // find max value with sort algorithm
    public static int findMax(int[] array) {
        int sorted [] =Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        
        return sorted[sorted.length - 1];
    }

    //find avarage value
    public static double findAverage(int[] array) {

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        if(array.length > 0){
            return (double) sum / array.length;
        }
        return 0;
    }
    // Find Differences From Average
    public static double[] getDifferencesFromAverage(int[] array, double average) {
        double[] differences = new double[array.length];
        for(int i = 0; i < array.length; i++){
            differences[i] = array[i] - average;
        }
        return differences;
    }

    // Sum Of Odd Numbered Elements
    public static int sumOfOddNumberedElements(int[] array) {
        int sum = 0;
        for(int i = 1; i < array.length; i+=2){
            sum += array[i];
        }
        return sum;
    }

    // Sum Of Even Numbered Elements
    public static int sumOfEvenNumberedElements(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i+=2){
            sum += array[i];
        }
        return sum;
    }
}