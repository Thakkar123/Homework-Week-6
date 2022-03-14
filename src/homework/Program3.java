package homework;
/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
*/

public class Program3 {
    int a = 10;  // instance variable
    static int b = 20;  // static variable

    public void test() {   // Instance method
        System.out.println(a); // direct access
        System.out.println(Program3.b); //  you can also call direct like --  System.out.println(b);
    }

    public static void test1() {  // Static method
        Program3 t = new Program3(); // object creation
        System.out.println(t.a); // calling instance variable in static method using object t
        System.out.println(b); // static variable b in static method call directly

    }

    public static void main(String[] args) {
        Program3 p = new Program3();
        p.test(); // instance method call here by creating an object p
        test1(); // static method can call here directly

    }
}
