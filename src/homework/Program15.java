package homework;
// 15. Write a Java program to swap two variables.

public class Program15 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;
        System.out.println("value of a before swapping: " + a);
        System.out.println("value of b before swapping: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("value of a after swapping: " + a);
        System.out.println("value of b after swapping: " + b);


    }

}
