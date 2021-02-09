package jump2java;

import java.util.ArrayList;

public class For_each {
    public static void main(String[] args) {
        /*
        String[] numbers = {"one", "two", "three"};
        for(String number: numbers) {
            System.out.println(number);
        }
        */
        ArrayList<String> numbers = new ArrayList<String> ();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");

        for(String number: numbers) {
            System.out.println(number);
        }
    }
}
