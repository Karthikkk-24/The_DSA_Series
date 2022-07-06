public class InsertionSortCode {
    public static void printArray(int arr[]) {
        // this function is used to print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        // the given array

        // insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            // here, current is the new variable to hold a position of the array element
            int j = i - 1;
            // as i is used at index 1, j is the index of the first element in the array
            // i.e. 0
            while (j >= 0 && current < arr[j]) {
                // here, we apply the condition where if j >= 0, which means the index at which
                // j currently is
                // the current variable should be always less then the element j holds, then
                // only the switching happens
                // if the element current holds is bigger then current keep holding the element
                // until a bigger element is found
                arr[j + 1] = arr[j];
                j--;
            }

            // placement of element
            arr[j + 1] = current;
        }

        printArray(arr);
    }
}
