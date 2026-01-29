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

    
    public static int[] createRandomArray(int arraySize) {
        Random rand = new Random();
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(101);
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    
    public static int findMax(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

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

    public static double[] getDifferencesFromAverage(int[] array, double average) {
        double[] differences = new double[array.length];
        for(int i = 0; i < array.length; i++){
            differences[i] = array[i] - average;
        }
        return differences;
    }

    public static int sumOfOddNumberedElements(int[] array) {
        int sum = 0;
        for(int i = 1; i < array.length; i+=2){
            sum += array[i];
        }
        return sum;
    }

    public static int sumOfEvenNumberedElements(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i+=2){
            sum += array[i];
        }
        return sum;
    }
}