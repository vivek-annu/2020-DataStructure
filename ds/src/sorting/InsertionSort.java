package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {


        int array[] = {54, 24, 3, 19, 8, 78, 25, 56, 14, 2, 8};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }


        System.out.println(Arrays.toString(array));


    }
}
