package homework;
/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
*/

public class Program1 {
    int a = 10; //instance variable declaration
    int b = 20; //instance variable declaration

    public void test() {    // this is instance area or instance method (no static keyword used here)

        System.out.println(a); //10 variable can be call here directly
        System.out.println(b); //20 variable can be call here directly
    }

    public static void main(String[] args) {  // main static method

        Program1 t = new Program1();  // object creation via class name
        t.test();

    }

}
