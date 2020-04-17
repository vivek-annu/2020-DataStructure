package sorting;

public class Test {
    public static  int data(){

        try {
           // return 5;
            throw new ArrayIndexOutOfBoundsException("");
        }catch (Exception e){
            return 10;
        }
        finally {
            return 56;
        }
    }




    public static void main(String[] args) {
        //System.out.println(data());
        System.out.println(2/10);
    }
}
