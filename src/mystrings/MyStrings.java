package mystrings;

import java.util.Arrays;

public class MyStrings {

    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello Strings");
        s.append(" in java");
        System.out.println(s);

        char[] character = {'A', 'P', 'P', 'L', 'E'};

        System.out.println(Arrays.toString(character));

        String newStr = new String(character, 1, 3);
        System.out.println(newStr);

        int[] ints = {1,65};
        String newStr2 = new String(ints, 0, 2);

    }
}
