package app;

public class Main {
    public static void main (String[] args){
        System.out.println("Git app");

        int a =23;
        int b = 46;
        int c =add(a, b);
        System.out.println(c);

    }
    private static int add (int a, int b){
        return (a*b)+(b/a);
    }
}
