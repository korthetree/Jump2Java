package jump2java;

public class String1 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "hello";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        String a1 = "hello";
        String b1 = new String("hello");
        System.out.println(a1.equals(b1));
        System.out.println(a1==b1);

        String a2= "Hello Java";
        System.out.println(a2.indexOf("Java"));

        System.out.println(a2.replaceAll("Java", "World"));

        System.out.println(a2.substring(0,4));

        System.out.println(a2.toUpperCase());
    }
}
