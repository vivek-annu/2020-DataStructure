package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int array []={54,24,3,19,8,78,25,56,14,2,8};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i <array.length ; i++) {

            for (int j = 1; j <array.length-i ; j++) {


                if(array[j-1]>array[j]){
                    int value=array[j];
                    array[j]=array[j-1];
                    array[j-1]=value;



                }





            }

        }



        System.out.println(Arrays.toString(array));




    }
}
