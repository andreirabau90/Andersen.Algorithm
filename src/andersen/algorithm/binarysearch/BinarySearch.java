package andersen.algorithm.binarysearch;

import java.util.stream.IntStream;

public class BinarySearch {

    private static int binarySearch(int[] arr, int number) {
        int start = 0;
        int finish = arr.length - 1;
        while (start <= finish) {
            int middle = arr[(start + finish) / 2];
            if (number == middle) {
                return middle;
            }
            if (number > middle) {
                start = middle + 1;
            } else {
                finish = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = IntStream.iterate(0, x -> x + 1).limit(100000).toArray();
        binarySearch(arr, 234);
    }
}
