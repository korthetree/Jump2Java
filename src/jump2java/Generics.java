package jump2java;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        /*
        ArrayList aList =  new ArrayList(); //non-Generics
        aList.add("hello");
        aList.add("java");

        String hello = (String) aList.get(0);
        String java = (String) aList.get(1);
        */
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("hello");
        aList.add("java");

        String hello = aList.get(0);
        String java = aList.get(1);
    }
}
