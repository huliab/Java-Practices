package BasicJava;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers\nafter each number press enter");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("For addition select 1 \nFor subtraction select 2 " +
                "\nFor multiplication select 3 \nFor division select 4 ");
        int select = scan.nextInt();

        switch(select){

            case 1 :
                System.out.println(num1 + "+" +  num2 + "=" + (num1+num2) );
                break;
            case 2 :
                System.out.println(num1 + "-" +  num2 + "=" + (num1-num2) );
                break;
            case 3 :
                System.out.println(num1 + "*" +  num2 + "=" + (num1*num2) );
                break;
            case 4 :
                System.out.println(num1 + "/" +  num2 + "=" + (num1/num2) );
                break;
            default:
                System.out.println("Enter correct number");
        }

    }
}
