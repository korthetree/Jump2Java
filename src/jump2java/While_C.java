package jump2java;

public class While_C {
    public static void main(String[] args) {
        int a= 0;
        while (a < 10) {
            a++;
            if (a % 2 == 0) {
                continue;
            }
            System.out.println(a);
        }
    }
}
