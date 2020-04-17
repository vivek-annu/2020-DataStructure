import java.util.Stack;

public class StackLogic {

    public static void main(String[] args) {


        findBracketCorrect("{(([(vivek)])}");


    }

    private static boolean findBracketCorrect(String s) {
        Stack<Character> characterStack = new Stack<>();


        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            switch (c) {

                case '{':
                case '(':
                case '[':
                    characterStack.push(c);
                    break;
                case '}':
                case ')':
                case ']':
                    if (!characterStack.isEmpty()) {
                        Character character = characterStack.pop();

                        if (character == '{' && character != '}' || character == '(' && character != ')' || character == '[' && character != ']') {
                            System.out.println("not a valid bracket");
                            return false;
                        }
                    } else {
                        System.out.println("not a valid bracket");
                        return false;
                    }
                    break;
            }


        }

        if (!characterStack.isEmpty()) {
            System.out.println("not a valid bracket");
            return false;
        }
        return true;
    }

}
