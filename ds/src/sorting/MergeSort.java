package sorting;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int array[] = {13, 19, 21, 36, 48, 52, 94, 21};
        System.out.println(Arrays.toString(array));

        sort(0, array.length - 1, array);
        System.out.println(Arrays.toString(array));

    }

    private static void sort(int min, int max, int[] array) {


        if(min<max){

            int mid= (min+max)/2;

            sort(min, mid, array);
            sort(mid+1, max,array);
            merge(min,mid,max,array);










        }



    }

    private static void merge(int min, int mid, int max, int[] array) {


        int n1=mid-min+1;
        int n2= max-mid;

        int firstArray[]=new int [n1];
        int secondArray[]= new int[n2];

        for (int i = 0; i <n1 ; i++) {
            firstArray[i]=array[min+i];

        }

        for (int j = 0; j<n1 ; j++) {
            secondArray[j]=array[mid+j+1];

        }




        int i =0; int j=0;
        int k =min;


        while (i<n1&& j<n2){

            if(firstArray[i]<=secondArray[j]){
                array[k]=firstArray[i];
                i++;
            }
            else {
                array[k]=secondArray[j];
                j++;
            }
            k++;


        }

        while (i<n1){
            array[k]=firstArray[i];
            k++;
            i++;
        }

        while (j<n2){

            array[k]=secondArray[j];
            j++;
            k++;
        }

//
//        int i = 0;
//        int j = 0;
//        int k = min;
//        while (i < firstTempArraySize && j < secondTempArraySize) {
//            if (firstArray[i] <= secondArray[j]) {
//                array[k] = firstArray[i];
//                i++;
//            } else {
//                array[k] = secondArray[j];
//                j++;
//            }
//
//            k++;
//        }
//
//
//        while (i < firstTempArraySize) {
//            array[k] = firstArray[i];
//            k++;
//            i++;
//        }
//        while (j < secondTempArraySize) {
//            array[k] = secondArray[j];
//            k++;
//            j++;
//        }
//*/

    }
}
