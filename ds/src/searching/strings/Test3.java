package searching.strings;

public class Test3 {


    public static String reverseString(String string) {

        String finalString = "";
        String temp = "";


        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);

            if (c == ' ') {
                finalString = " " + temp + finalString;
                temp = "";
            } else {
                temp = temp + c;


            }


        }
        finalString = temp + finalString;
        return finalString;

    }

    public static void main(String[] args) {

        System.out.println(reverseString("Coding Simplified  Nice"));
    }
}
