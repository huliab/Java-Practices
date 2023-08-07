package BasicJava;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter 3 integers for length of triangle \npress enter after each number");
        int side1 = scan.nextInt();
        int side2 = scan.nextInt();
        int side3 = scan.nextInt();

        double  perimeter = side1+side2+side3;

        System.out.println("perimeter : "+ perimeter);
        double u = perimeter/2.0;

        double area = u * (u-side1)* (u-side2)* (u-side3);
        System.out.println("Area : " +   area);



    }
}
