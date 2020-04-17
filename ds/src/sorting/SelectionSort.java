package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int array []={54,24,3,19,8,78,25,56,14,2,8};
        System.out.println(Arrays.toString(array));
        int min=0; int temp=0;
        for (int i = 0; i <array.length ; i++) {
            min=i;


            for (int j = i+1; j <array.length ; j++) {

                 if(array[j]<array[min]) {
                 min=j;
                 }
            }

            temp= array[i];
            array[i]=array[min];
            array[min]=temp;


        }



        System.out.println(Arrays.toString(array));
    }
}
