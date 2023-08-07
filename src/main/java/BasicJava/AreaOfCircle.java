package BasicJava;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter an integer for value of r ");

        double r = scan.nextDouble();
        System.out.println("Please enter a number for angle ");


        int a = scan.nextInt();
        double Area = (Math.PI*r*r*a)/360;
        System.out.println(Area);







    }
}
