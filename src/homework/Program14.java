package homework;

import java.util.Scanner;

/*
14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/
public class Program14 {
    public static void main(String[] args) {
        rectangle();
    }

    public static void rectangle() {
        double Width;
        double Height;
        double Area;
        double Perimeter;
        System.out.println("Please enter the width:   ");
        Scanner s = new Scanner(System.in);
        Width = s.nextDouble();
        System.out.println("Please enter the height: ");
        Height = s.nextDouble();

        Area = Width * Height;
        Perimeter = 2 * (Width + Height);

        System.out.println("Area is =" + Area);
        System.out.println("Perimeter is = " + Perimeter);

    }

}
