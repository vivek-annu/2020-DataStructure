import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    //FATOil FIBERSpinach CARBRice FATCheese FIBERBeans
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
    //   int numberOfDays = in.nextInt();

        String totalCookCount = "";

        Map<String, Integer> integerMap = new LinkedHashMap<>();
       List<String> numberOfDays = Arrays.asList("FATOil","FATCheese","FATEgg","FIBERSpinach","CARBRice","FIBERBeans");
        for (int i = 0; i < numberOfDays.size(); i++) {

          // String ingredient = in.next();
            String ingredient=numberOfDays.get(i);
            if (ingredient.contains("FAT")) {
                ingredient = "FAT";
            } else if (ingredient.contains("FIBER")) {
                ingredient = "FIBER";
            } else {
                ingredient = "CARB";
            }
            integerMap.put(ingredient, integerMap.getOrDefault(ingredient, 0) + 1);
            LinkedList<String> strings = new LinkedList<>();

           // if(integerMap.size()>=3){
                 integerMap.forEach((k,v)->{
                   if(v.intValue()>=2){
                       strings.addFirst(k+v);
                   }else {
                       strings.addLast(k+v);
                   }
               });
                 boolean present=false;
          for (String s:strings){
              if(s.contains("2")||s.contains("3")){
                  present=true;
              }
          }


          if(present){
              if( strings.get(0).contains("2")) {
                  if (strings.size() >= 2) {
                      for (int j = 0; j < 2; j++) {
                          String s = strings.get(j);
                          integerMap.remove(s.substring(0, s.length() - 1));
                      }

                      totalCookCount += 1;
                  }
              }
              else if(strings.get(0).contains("3")){
                  for (int j = 0; j < 1; j++) {
                      String s=     strings.get(j);
                      integerMap.remove( s.substring(0, s.length()-1));
                  }
                  totalCookCount+=1;
              }

          }else {
              totalCookCount+="0";
          }


            }


        System.out.println(totalCookCount);

    }
}