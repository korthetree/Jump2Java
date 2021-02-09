package jump2java;

public class Test2 {
    /*
    public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Test2 myTest = new Test2();
        int c = myTest.sum(a,b);

        System.out.println(c);
      }
     */
    /*
    public int vartest(int a) {
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a = 1;
        Test2 myTest = new Test2();
        a = myTest.vartest(a);
        System.out.println(a);
    }

     */
    int a;

    public void vartest(Test2 test) {
        test.a++;
    }

    public static void main(String[] args) {
        Test2 myTest = new Test2();
        myTest.a = 1;
        myTest.vartest(myTest);
        System.out.println(myTest.a);
    }
}