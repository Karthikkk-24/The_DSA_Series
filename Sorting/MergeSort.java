public class MergeSort {

    public static void divide(int arr[], int startingElement, int endingElement) {
        if  (startingElement >= endingElement) {
            return;
        }
        int mid = startingElement + (endingElement - startingElement) / 2;
        divide(arr, startingElement, mid);
        divide(arr, mid + 1, endingElement);

        conquer(arr, startingElement, mid, endingElement);
    }

    public static void conquer(int arr[], int startingElement, int mid, int endingElement) {
        int merged[] = new int[endingElement - startingElement + 1];
        int index1 = startingElement;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= endingElement) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }

        while (index2 <= endingElement) {
            merged[x++] = arr[index2++];
        }

        for (int i = 0, j = startingElement; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 8, 5, 2, 8 };
        int n = arr.length;

        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
