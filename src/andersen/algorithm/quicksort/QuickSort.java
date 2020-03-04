package andersen.algorithm.quicksort;


public class QuickSort {
    private static void quickSort(int[] arr, int start, int finish) {
        int middle = arr[(start + finish) / 2];
        int left = start;
        int right = finish;
        while (left <= right) {
            while (arr[left] < middle) {
                left++;
            }
            while (arr[right] > middle) {
                right--;
            }
            if (left <= right) {
                int current = arr[right];
                arr[right] = arr[left];
                arr[left] = current;
                left++;
                right--;
            }
        }
        if (left < finish) {
            quickSort(arr, left, finish);
        }
        if (start < right) {
            quickSort(arr, start, right);
        }

    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 11, 2, 4, 8, 10};
        quickSort(arr, 0, arr.length - 1);
    }
}
