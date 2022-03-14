package homework;
/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */

public class Program2 {
    static int a=10; // static variable declaration
    static int b=20; // static variable declaration

    public static void test() {  // static method
        System.out.println(a);  // static variable call here directly
        System.out.println(b); // static variable call here directly

    }

    public static void main(String[] args) {  // main static method
        test();                               // calling static method inside main static method
    }
}
