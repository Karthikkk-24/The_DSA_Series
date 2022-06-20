import java.util.*;
//this package in java contains all the important methods for implementation

public class BubbleSortCode {

    // this is a array we are using to print the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // here, arr.length is the number of elements in the array
            // i.e. n
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // this is the array we'll be using for sorting purposes
        int arr[] = { 9, 1, 7, 6, 3 };

        // this is the main loop we use for implementing BUBBLE SORT
        for (int i = 0; i < arr.length - 1; i++) {
            // we are implementing this array for elements (arr.length - 1) as it runs (n-1)
            // times
            for (int j = 0; j < arr.length - i - 1; j++) {
                // we are using this inner loop for swapping the elements inside the array above
                if (arr[j] > arr[j + 1]) {
                    // swapping the values
                    int temp = arr[j];
                    // temp is the temporary element that we use for swapping two elements from
                    // their original index...
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // after swapping of array is done we call the print array function and add our
        // array as the parameter
        printArray(arr);
    }
}
