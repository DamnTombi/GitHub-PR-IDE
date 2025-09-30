package app;

public class Main {
    public static void main (String[] args){
        System.out.println("Git app");

        int a =23;
        int b = 46;
        int c =add(a, b);
        int d = multiple (a,b);
        double e = subctract (a,b);
        System.out.println("Substract :"+a+"/"+b+"="+e);
        System.out.println("Multiple :"+a+"*"+b+"="+d);
        System.out.println("Add :"+a+"+"+b+"="+c);

    }
    private static int add (int a, int b){
        return a+b;
    }
    private static int multiple(int a, int b){
        return a*b;
    }
    private static double subctract(double a, double b){
        return a/b;
    }
}
