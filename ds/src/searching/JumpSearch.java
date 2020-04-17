package searching;

import java.util.Arrays;

public class JumpSearch {

    public static int jumpSearch(int array[], int searchValue, int jumpValue) {

        if (jumpValue < array.length - 1) {


            if (array[jumpValue] == searchValue) {
                return jumpValue;
            } else if (array[jumpValue] < searchValue) {
              int newJump = jumpValue+jumpValue;
                if (newJump < array.length - 1) {
                    return jumpSearch(array, searchValue, newJump);
                } else {

                    for (int i = jumpValue; i < array.length; i++) {
                        if (array[i] == searchValue) {
                            return i;
                        }


                    }

                }

            }else {

                for (int i = 0; i <jumpValue ; i++) {
                    if(array[i]==searchValue){
                        return i;
                    }
                }
            }


        }


        return -1;
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 4, 6, 8, 9, 15, 65, 89};
        System.out.println(Arrays.toString(array));
        int jumpValue = (int) Math.sqrt(array.length - 1);

        System.out.println(jumpSearch(array, 2, jumpValue));

    }
}


