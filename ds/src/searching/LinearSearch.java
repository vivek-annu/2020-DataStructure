package searching;

import java.util.Arrays;

public class LinearSearch {


    public static int linearSearchIndex(int array[], int searchValue) {


        for (int i = 0; i < array.length; i++) {

            if (array[i] == searchValue) {
                return i;
            }


        }

        return -1;


    }

    public static void main(String[] args) {

        int array[] = {9, 17, 25, 35, 3, 2, 17, 10, 5, 8};
        System.out.println(Arrays.toString(array));
        System.out.println("index value " + linearSearchIndex(array, 5));


    }
}
