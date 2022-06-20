import java.util.*; 

public class SelectionSortCode {
    public static void printArray(int arr[]) {
        //we are going to use this function to print our array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 }; 
        //array to perform selection sort

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) { //arr.length - 1 => because the last index of the last element is going to be 1 less than the length of the given array
            int smallest = i;
            //as i = 0 for this loop, considering at element at 0th index to be the smallest element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    //then running the loop based on a condition so that we can switch the smallest element if any element is found with a smaller value then the initialised element
                    smallest = j;
                }
            }
            //this process is known as swapping where we swap the positions of elements by using a temporary variable and switching the positions of the elements according to their index 
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
