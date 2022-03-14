package homework;
/*
5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)

*/

public class Program5 {

    public static void main(String[] args) {

        Program5 P = new Program5(); // object P creation

        addition(10,20); //30
        subtraction(90,40);//50
        P.multiplication(10,50);//500
        P.division(200,50); //4

    }

    public static void addition(int a,int b){   // static method
        System.out.println("Addition of a and b is = " +(a+b));

    }
    public static void subtraction(int a, int b){  // static method
        System.out.println("Subtraction of a and b is = "+(a-b));

    }
    public void multiplication(int a, int b){   // instance method
        System.out.println("Multiplication of a and b is = "+(a*b));

    }
    public void division(int a, int b){       // instance method
        System.out.println("Division of a an b is = "+(a/b));
    }
}
