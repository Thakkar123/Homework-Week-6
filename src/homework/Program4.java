package homework;
/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme
 */

public class Program4 {
    int a = 10;  // instance variable
    int b = 20; //  instance variable
    static String name = "Ajit";       // static variable
    static String surname = "Thakkar"; // static variable

    public void test() {  // Instance method
        System.out.println(a); // instance variable call here directly
        System.out.println(b); // // instance variable call here directly
        System.out.println(Program4.name);     //  also, can be call direct -- System.out.println(name);
        System.out.println(Program4.surname);  //  also, can be call direct -- System.out.println(surname);

    }

    public static void test1() {  // Static method
        Program4 t = new Program4(); // object creation using class name
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(name);
        System.out.println(surname);

    }

    public static void main(String[] args) {
        Program4 p = new Program4();

        p.test();
        test1();


    }
}
