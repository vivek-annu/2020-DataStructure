package searching;

import java.util.Arrays;

public class BinarySearch {


    public static int binarySearchIndex(int min, int max, int array[], int searchValue) {

        if (min < max) {

            int mid = (min + max) / 2;

            if (array[mid] == searchValue) {
                return mid;

            } else if (array[mid] < searchValue) {
            return    binarySearchIndex(mid + 1, max, array, searchValue);
            } else {
              return   binarySearchIndex(min, mid - 1, array, searchValue);
            }
        }





return -1;



}


    public static void main(String[] args) {
        int array[] = {1, 2, 4, 6, 8, 9, 15, 65, 89};
        System.out.println(Arrays.toString(array));
        System.out.println( binarySearchIndex(0, array.length - 1, array, 355));


    }
}
