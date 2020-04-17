package searching.strings;

import java.util.Arrays;

public class ReverseString {

    public static void reverseOne(String string) {


        String s = "";
        for (int i = 0; i < string.length(); i++) {

            s = string.charAt(i) + s;


        }


        System.out.println(s);


    }


    public static void reverseTwo(String s) {

        char[] chars = s.toCharArray();
      int n=  chars.length-1;
        for (int i = 0; i < n/2; i++) {
            char a = chars[i];
            chars[i] = chars[n-i];
            chars[n-i] = a;

        }

        System.out.println(Arrays.toString(chars));


    }


    public static void main(String[] args) {

reverseTwo("Vivek");
     //   reverseOne("Vivek");
    }
}
