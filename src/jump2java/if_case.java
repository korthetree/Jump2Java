package jump2java;

import java.util.ArrayList;
import java.util.LinkedList;

public class if_case {
    public static void main(String[] args) {
        //기본구조
        /*
        boolean money = true;
        if (money) {
            System.out.println("택시를 타고 가라.");
        }else {
            System.out.println("걸어가라.");
        }
        */
        /*
        int money = 2000;
        if (money >=3000) {
            System.out.println("택시를 타고 가라.");
        }else {
            System.out.println("걸어가라.");
        }
         */

        //and 연산자 사용

        /*
        int money = 2000;
        boolean hasCard = true;

        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라.");
        }else {
            System.out.println("걸어가라.");
        }
        */

        //contains 메소드 사용

        /*
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라.");
        }else {
            System.out.println("걸어가라.");
        }
        */

        //else if 사용
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라.");
        }else if (hasCard) {
            System.out.println("택시를 타고 가라.");
        }else {
            System.out.println("걸어가라.");
        }
    }
}
