package searching.strings;

public class Test2 {

    public static void main(String[] args) {

        String string="Hello World We Are Waiting For You";


       if(string!=null){

           char[] chars = string.toCharArray();

           for (int i = 0; i < chars.length; i++) {

               if(chars[i]!=' ') {
                   if (i == 0) {
                       System.out.println(chars[i]);
                   } else if (chars[i-1] == ' ') {
                       System.out.println(chars[i]);
                   }
               }

           }


       }



    }
}
