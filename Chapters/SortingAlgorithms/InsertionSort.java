package SortingAlgorithms;

public class InsertionSort {
    public static int[] insertionSort(int array[], int size) {
        for (int i = 1; i < size; ++i) {
            int key = array[i], j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        return array;
    }
}
